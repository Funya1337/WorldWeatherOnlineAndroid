package study.android.weather;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.os.Bundle;
import android.widget.TextView;

import com.anychart.AnyChart;
import com.anychart.AnyChartView;
import com.anychart.chart.common.dataentry.DataEntry;
import com.anychart.chart.common.dataentry.ValueDataEntry;
import com.anychart.charts.Cartesian;
import com.anychart.core.cartesian.series.Column;
import com.anychart.enums.Anchor;
import com.anychart.enums.HoverMode;
import com.anychart.enums.Position;
import com.anychart.enums.TooltipPositionMode;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarDataSet;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import study.android.weather.data.Weather;


public class MainActivity extends AppCompatActivity {
    private BarChart barChart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AnyChartView anyChartView = findViewById(R.id.any_chart_view);
        anyChartView.setProgressBar(findViewById(R.id.progress_bar));
        Cartesian cartesian = AnyChart.column();
        ArrayList<DataEntry> data = new ArrayList<>();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.worldweatheronline.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        WorldWeatherOnline service = retrofit.create(WorldWeatherOnline.class);
        Call<Weather> weather = service.getWeather();
        weather.enqueue(new Callback<Weather>() {
            @Override
            public void onResponse(Call<Weather> call, Response<Weather> response) {
                for (int i = 0; i <= 11; i++) {
                    double temp = Double.parseDouble(response.body().data.climateAverages.get(0).month.get(i).absMaxTemp);
                    temp = Math.round(temp);
                    String month = response.body().data.climateAverages.get(0).month.get(i).name;
                    data.add(new ValueDataEntry(month, temp));

                    System.out.println(data);
                }
                Column column = cartesian.column(data);

                column.tooltip()
                        .titleFormat("{%X}")
                        .position(Position.CENTER_BOTTOM)
                        .anchor(Anchor.CENTER_BOTTOM)
                        .offsetX(0d)
                        .offsetY(5d)
                        .format("{%Value}{groupsSeparator: }°C");

                cartesian.animation(true);
                cartesian.title("Average temperature of each month");

                cartesian.yScale().minimum(0d);

                cartesian.yAxis(0).labels().format("{%Value}{groupsSeparator: }°C");

                cartesian.tooltip().positionMode(TooltipPositionMode.POINT);
                cartesian.interactivity().hoverMode(HoverMode.BY_X);

                cartesian.xAxis(0).title("Month");
                cartesian.yAxis(0).title("Temperature");

                anyChartView.setChart(cartesian);
            }

            @Override
            public void onFailure(Call<Weather> call, Throwable t) {

            }
        });
    }
}
