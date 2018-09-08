package com.coolweather.android.gson;

/**
 * Created by HY on 2018/9/8.
 * CoolWeather
 */

public class AQI {

    public AQICity city;

    public class AQICity {

        public String aqi;
        
        public String pm25;
    }
}
