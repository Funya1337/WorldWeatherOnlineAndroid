
package study.android.weather.data;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Hourly {

    @SerializedName("time")
    @Expose
    public String time;
    @SerializedName("tempC")
    @Expose
    public String tempC;
    @SerializedName("tempF")
    @Expose
    public String tempF;
    @SerializedName("windspeedMiles")
    @Expose
    public String windspeedMiles;
    @SerializedName("windspeedKmph")
    @Expose
    public String windspeedKmph;
    @SerializedName("winddirDegree")
    @Expose
    public String winddirDegree;
    @SerializedName("winddir16Point")
    @Expose
    public String winddir16Point;
    @SerializedName("weatherCode")
    @Expose
    public String weatherCode;
    @SerializedName("weatherIconUrl")
    @Expose
    public List<WeatherIconUrl_> weatherIconUrl = null;
    @SerializedName("weatherDesc")
    @Expose
    public List<WeatherDesc_> weatherDesc = null;
    @SerializedName("precipMM")
    @Expose
    public String precipMM;
    @SerializedName("precipInches")
    @Expose
    public String precipInches;
    @SerializedName("humidity")
    @Expose
    public String humidity;
    @SerializedName("visibility")
    @Expose
    public String visibility;
    @SerializedName("visibilityMiles")
    @Expose
    public String visibilityMiles;
    @SerializedName("pressure")
    @Expose
    public String pressure;
    @SerializedName("pressureInches")
    @Expose
    public String pressureInches;
    @SerializedName("cloudcover")
    @Expose
    public String cloudcover;
    @SerializedName("HeatIndexC")
    @Expose
    public String heatIndexC;
    @SerializedName("HeatIndexF")
    @Expose
    public String heatIndexF;
    @SerializedName("DewPointC")
    @Expose
    public String dewPointC;
    @SerializedName("DewPointF")
    @Expose
    public String dewPointF;
    @SerializedName("WindChillC")
    @Expose
    public String windChillC;
    @SerializedName("WindChillF")
    @Expose
    public String windChillF;
    @SerializedName("WindGustMiles")
    @Expose
    public String windGustMiles;
    @SerializedName("WindGustKmph")
    @Expose
    public String windGustKmph;
    @SerializedName("FeelsLikeC")
    @Expose
    public String feelsLikeC;
    @SerializedName("FeelsLikeF")
    @Expose
    public String feelsLikeF;
    @SerializedName("chanceofrain")
    @Expose
    public String chanceofrain;
    @SerializedName("chanceofremdry")
    @Expose
    public String chanceofremdry;
    @SerializedName("chanceofwindy")
    @Expose
    public String chanceofwindy;
    @SerializedName("chanceofovercast")
    @Expose
    public String chanceofovercast;
    @SerializedName("chanceofsunshine")
    @Expose
    public String chanceofsunshine;
    @SerializedName("chanceoffrost")
    @Expose
    public String chanceoffrost;
    @SerializedName("chanceofhightemp")
    @Expose
    public String chanceofhightemp;
    @SerializedName("chanceoffog")
    @Expose
    public String chanceoffog;
    @SerializedName("chanceofsnow")
    @Expose
    public String chanceofsnow;
    @SerializedName("chanceofthunder")
    @Expose
    public String chanceofthunder;
    @SerializedName("uvIndex")
    @Expose
    public String uvIndex;

}
