package com.example.administrator.coolweather.gson;

/**
 * Created by Administrator on 2021/1/10/010.
 */

public class AQI {
    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }

}
