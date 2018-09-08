package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by HY on 2018/9/8.
 * CoolWeather
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
