package study.android.weather;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import study.android.weather.data.Weather;

public interface WorldWeatherOnline {
        @GET("https://api.worldweatheronline.com/premium/v1/weather.ashx?format=json&q=Moscow&key=f3d83d5c8cf444cba47143644201704&includelocation=yes")
        Call<Weather> getWeather();
}
