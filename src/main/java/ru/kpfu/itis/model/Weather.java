package ru.kpfu.itis.model;

public class Weather {
    private String city;
    private double temperature;
    private double feelsLike;

    public Weather(String city, double temperature, double feelsLike) {
        this.city = city;
        this.temperature = temperature;
        this.feelsLike = feelsLike;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getFeelsLike() {
        return feelsLike;
    }

    public void setFeelsLike(double feelsLike) {
        this.feelsLike = feelsLike;
    }
}
