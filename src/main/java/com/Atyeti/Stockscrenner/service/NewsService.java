package com.Atyeti.Stockscrenner.service;

import com.Atyeti.Stockscrenner.apiResponse.NewsResponseFin;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Service
public class NewsService {

    @Value("${finnhub.api.key}")
    private String apiKey;

    private final RestTemplate restTemplate;


    public NewsService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public NewsResponseFin getCompanyNews(String symbol){

        LocalDate toDate = LocalDate.now();
        LocalDate fromDate = toDate.minusDays(30);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        String url ="https://finnhub.io/api/v1/company-news?symbol="+symbol+"&from="+fromDate+"&to="+toDate+"&token="+apiKey;
        try {
            ResponseEntity<NewsResponseFin> response = restTemplate.exchange(url, HttpMethod.GET, null, NewsResponseFin.class);
            return response.getBody();
        } catch (RestClientException e) {
            throw new RuntimeException(e);
        }

    }
}
