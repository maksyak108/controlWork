package ru.kpfu.itis.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WeatherResponse {

    @JsonProperty("main")
    private WeatherMainInfo mainInfo;

    public WeatherMainInfo getMainInfo() {
        return mainInfo;
    }

    public void setMainInfo(WeatherMainInfo mainInfo) {
        this.mainInfo = mainInfo;
    }

    public static class WeatherMainInfo {
        private double temp;
        private double feelsLike;

        public double getTemp() {
            return temp;
        }

        public void setTemp(double temp) {
            this.temp = temp;
        }

        public double getFeelsLike() {
            return feelsLike;
        }

        public void setFeelsLike(double feelsLike) {
            this.feelsLike = feelsLike;
        }
    }
}
