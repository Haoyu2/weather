package com.example.search;

import com.example.search.client.DetailsClient;
import com.example.search.service.SearchService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;

@RunWith(SpringRunner.class)
@SpringBootTest

public class serviceTest {
    @Autowired
    SearchService service;
    @Autowired
    DetailsClient client;
    @Test
    public void getWeather(){
        System.out.println(client.queryWeatherByCity("Boston"));
        System.out.println(service.getWeatherCities(
                Arrays.asList("Boston")));
    }
}
