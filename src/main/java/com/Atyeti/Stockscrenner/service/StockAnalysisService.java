package com.Atyeti.Stockscrenner.service;

import com.Atyeti.Stockscrenner.apiResponse.StockApiResponse;
import com.Atyeti.Stockscrenner.apiResponse.StockDailyData;
import com.Atyeti.Stockscrenner.entity.StockAnalysis;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StockAnalysisService {
    public static StockAnalysis calculateIndicators(StockApiResponse response){
        Map<String, StockDailyData> timeSeries = response.getTimeSeriesDaily();

        List<String> sortedDates = new ArrayList<>(timeSeries.keySet());
        sortedDates.sort(Comparator.reverseOrder());

        List<StockDailyData> last50DaysData=sortedDates.stream()
                .limit(50)
                .map(timeSeries::get)
                .collect(Collectors.toList());

        List<BigDecimal> closingPrices=new ArrayList<>();
        List<BigDecimal> highs= new ArrayList<>();
        List<BigDecimal> lows = new ArrayList<>();

        for (StockDailyData data:last50DaysData){
            closingPrices.add(new BigDecimal(data.getClose()));
            highs.add(new BigDecimal(data.getHigh()));
            lows.add(new BigDecimal(data.getLow()));
        }

        //Calculating sma
        BigDecimal sum = closingPrices.stream()
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        BigDecimal sma50 = sum.divide(BigDecimal.valueOf(50),2,BigDecimal.ROUND_HALF_UP);

        //calculating 50 day high/low
        BigDecimal high50 = highs.stream().max(Comparator.naturalOrder()).orElse(BigDecimal.ZERO);
        BigDecimal low50 = lows.stream().min(Comparator.naturalOrder()).orElse(BigDecimal.ZERO);

        //Price Change%
        BigDecimal todayOpen = new BigDecimal(last50DaysData.get(0).getOpen());
        BigDecimal todayClose = new BigDecimal(last50DaysData.get(0).getClose());

        BigDecimal priceChange = todayClose.subtract(todayOpen)
                .divide(todayOpen, 4, BigDecimal.ROUND_HALF_UP)
                .multiply(BigDecimal.valueOf(100));

        //Volume Surge
        List<BigDecimal> volumes = last50DaysData.stream()
                .map(d-> new BigDecimal(d.getVolume()))
                .collect(Collectors.toList());

        BigDecimal todayVolume = volumes.get(0);
        BigDecimal avgVolume = volumes.stream()
                .reduce(BigDecimal.ZERO, BigDecimal::add)
                .divide(BigDecimal.valueOf(volumes.size()), 2, BigDecimal.ROUND_HALF_UP);

        BigDecimal volumeSurge = todayVolume.divide(avgVolume, 2, BigDecimal.ROUND_HALF_UP);

        //trend
        String trend = todayClose.compareTo(sma50)>0?"UpTrend":"DownTrend";

        return new StockAnalysis(sma50, high50, low50, volumeSurge,trend,priceChange);

    }

//    public static void main(String[] args) {
//        RestTemplate template = new RestTemplate();
//        StockService service = new StockService(template);
//        StockAnalysis service1 = StockAnalysisService.calculateIndicators(service.getStock("MSFT"));
//        System.out.println(service1);
//
//    }
}
