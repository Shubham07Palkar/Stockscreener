package com.Atyeti.Stockscrenner.controller;

import com.Atyeti.Stockscrenner.apiResponse.NewsArticle;
import com.Atyeti.Stockscrenner.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stocks/finance")
public class NewsController {

    @Autowired
    private NewsService newsService;

    @GetMapping("/news/{symbol}")
    public ResponseEntity<?> getStockNews(@PathVariable String symbol){
        NewsArticle[] response = newsService.getCompanyNews(symbol.toUpperCase());
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
