package com.example.search.client;

import com.example.details.pojo.CityWeather;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient("details-service")
public interface DetailsClient {
    @GetMapping("/details")
    ResponseEntity<List<CityWeather>> queryWeatherByCity(@RequestParam(required = true)String city);

}

