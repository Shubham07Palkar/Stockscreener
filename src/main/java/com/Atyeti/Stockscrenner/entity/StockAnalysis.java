package com.Atyeti.Stockscrenner.entity;

import java.math.BigDecimal;

public class StockAnalysis {
    private String symbol;
    private BigDecimal dailyChangePercent;
    private BigDecimal volumeSurge;
    private String trend;
    private BigDecimal movingAverage;
    private BigDecimal high50Day;
    private BigDecimal low50Day;

    public StockAnalysis(BigDecimal dailyChangePercent, BigDecimal high50Day, BigDecimal low50Day, BigDecimal movingAverage, String trend, BigDecimal volumeSurge) {
        this.dailyChangePercent = dailyChangePercent;
        this.high50Day = high50Day;
        this.low50Day = low50Day;
        this.movingAverage = movingAverage;
        this.trend = trend;
        this.volumeSurge = volumeSurge;
    }

    public StockAnalysis(BigDecimal sma50, BigDecimal high50, BigDecimal low50) {
        this.high50Day = high50;
        this.low50Day = low50;
        this.movingAverage = sma50;
    }



    public BigDecimal getLow50Day() {
        return low50Day;
    }

    public void setLow50Day(BigDecimal low50Day) {
        this.low50Day = low50Day;
    }

    public BigDecimal getHigh50Day() {
        return high50Day;
    }

    public void setHigh50Day(BigDecimal high50Day) {
        this.high50Day = high50Day;
    }

    public BigDecimal getMovingAverage() {
        return movingAverage;
    }

    public void setMovingAverage(BigDecimal movingAverage) {
        this.movingAverage = movingAverage;
    }

    public BigDecimal getDailyChangePercent() {
        return dailyChangePercent;
    }

    public void setDailyChangePercent(BigDecimal dailyChangePercent) {
        this.dailyChangePercent = dailyChangePercent;
    }


    public String getTrend() {
        return trend;
    }

    public void setTrend(String trend) {
        this.trend = trend;
    }

    public BigDecimal getVolumeSurge() {
        return volumeSurge;
    }

    public void setVolumeSurge(BigDecimal volumeSurge) {
        this.volumeSurge = volumeSurge;
    }

    @Override
    public String toString() {
        return "StockAnalysis {" +
                "50DayHigh=" + high50Day +
                ", movingAverage=" + movingAverage +
                ", 50DayLow=" + low50Day +
                '}';
    }
}
