package ru.kpfu.itis.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import ru.kpfu.itis.dto.WeatherResponse;

@Service
public class WeatherService {

    private final RestTemplate restTemplate;
    private final String apiUrl = "https://api.openweathermap.org/data/2.5/weather?q=";
    private final String apiKey = "6faded995f07a67bd6431a5176bb4640";

    public WeatherService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public WeatherResponse getWeatherByCity(String city) {
        String url = apiUrl + city + "&units=metric&appid=" + apiKey;
        return restTemplate.getForObject(url, WeatherResponse.class);
    }

}

