
package study.android.weather.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Astronomy {

    @SerializedName("sunrise")
    @Expose
    public String sunrise;
    @SerializedName("sunset")
    @Expose
    public String sunset;
    @SerializedName("moonrise")
    @Expose
    public String moonrise;
    @SerializedName("moonset")
    @Expose
    public String moonset;
    @SerializedName("moon_phase")
    @Expose
    public String moonPhase;
    @SerializedName("moon_illumination")
    @Expose
    public String moonIllumination;

}
