package com.Atyeti.Stockscrenner.apiResponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CompanyOverview {

        @JsonProperty("Symbol")
        private String symbol;

        @JsonProperty("Name")
        private String name;

        @JsonProperty("Description")
        private String description;

        @JsonProperty("Exchange")
        private String exchange;

        @JsonProperty("Currency")
        private String currency;

        @JsonProperty("Country")
        private String country;

        @JsonProperty("Sector")
        private String sector;

        @JsonProperty("Industry")
        private String industry;

        @JsonProperty("MarketCapitalization")
        private String marketCapitalization;

        @JsonProperty("PERatio")
        private String pERatio;

        @JsonProperty("PEGRatio")
        private String pEGRatio;

        @JsonProperty("EPS")
        private String ePS;

        @JsonProperty("DividendPerShare")
        private String dividendPerShare;

        @JsonProperty("DividendYield")
        private String dividendYield;

        @JsonProperty("ReturnOnEquityTTM")
        private String returnOnEquityTTM;

        @JsonProperty("ProfitMargin")
        private String profitMargin;

        @JsonProperty("AnalystTargetPrice")
        private String analystTargetPrice;

        @JsonProperty("FiftyTwoWeekHigh")
        private String fiftyTwoWeekHigh;

        @JsonProperty("FiftyTwoWeekLow")
        private String fiftyTwoWeekLow;

        @JsonProperty("FiftyDayMovingAverage")
        private String fiftyDayMovingAverage;

        @JsonProperty("TwoHundredDayMovingAverage")
        private String twoHundredDayMovingAverage;

        public String getAnalystTargetPrice() {
            return analystTargetPrice;
        }

        public void setAnalystTargetPrice(String analystTargetPrice) {
            this.analystTargetPrice = analystTargetPrice;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getCurrency() {
            return currency;
        }

        public void setCurrency(String currency) {
            this.currency = currency;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getDividendPerShare() {
            return dividendPerShare;
        }

        public void setDividendPerShare(String dividendPerShare) {
            this.dividendPerShare = dividendPerShare;
        }

        public String getDividendYield() {
            return dividendYield;
        }

        public void setDividendYield(String dividendYield) {
            this.dividendYield = dividendYield;
        }

        public String getePS() {
            return ePS;
        }

        public void setePS(String ePS) {
            this.ePS = ePS;
        }

        public String getExchange() {
            return exchange;
        }

        public void setExchange(String exchange) {
            this.exchange = exchange;
        }

        public String getFiftyDayMovingAverage() {
            return fiftyDayMovingAverage;
        }

        public void setFiftyDayMovingAverage(String fiftyDayMovingAverage) {
            this.fiftyDayMovingAverage = fiftyDayMovingAverage;
        }

        public String getFiftyTwoWeekHigh() {
            return fiftyTwoWeekHigh;
        }

        public void setFiftyTwoWeekHigh(String fiftyTwoWeekHigh) {
            this.fiftyTwoWeekHigh = fiftyTwoWeekHigh;
        }

        public String getFiftyTwoWeekLow() {
            return fiftyTwoWeekLow;
        }

        public void setFiftyTwoWeekLow(String fiftyTwoWeekLow) {
            this.fiftyTwoWeekLow = fiftyTwoWeekLow;
        }

        public String getIndustry() {
            return industry;
        }

        public void setIndustry(String industry) {
            this.industry = industry;
        }

        public String getMarketCapitalization() {
            return marketCapitalization;
        }

        public void setMarketCapitalization(String marketCapitalization) {
            this.marketCapitalization = marketCapitalization;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getpEGRatio() {
            return pEGRatio;
        }

        public void setpEGRatio(String pEGRatio) {
            this.pEGRatio = pEGRatio;
        }

        public String getpERatio() {
            return pERatio;
        }

        public void setpERatio(String pERatio) {
            this.pERatio = pERatio;
        }

        public String getProfitMargin() {
            return profitMargin;
        }

        public void setProfitMargin(String profitMargin) {
            this.profitMargin = profitMargin;
        }

        public String getReturnOnEquityTTM() {
            return returnOnEquityTTM;
        }

        public void setReturnOnEquityTTM(String returnOnEquityTTM) {
            this.returnOnEquityTTM = returnOnEquityTTM;
        }

        public String getSector() {
            return sector;
        }

        public void setSector(String sector) {
            this.sector = sector;
        }

        public String getSymbol() {
            return symbol;
        }

        public void setSymbol(String symbol) {
            this.symbol = symbol;
        }

        public String getTwoHundredDayMovingAverage() {
            return twoHundredDayMovingAverage;
        }

        public void setTwoHundredDayMovingAverage(String twoHundredDayMovingAverage) {
            this.twoHundredDayMovingAverage = twoHundredDayMovingAverage;
        }

}
