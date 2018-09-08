package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by HY on 2018/9/8.
 * CoolWeather
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{

        @SerializedName("txt")
        public String info;
    }
}
