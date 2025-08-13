package com.Atyeti.Stockscrenner.apiResponse;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class NewsResponseFin {

    @JsonProperty("news")
    private List<NewsArticle> articles;

    public List<NewsArticle> getArticles() {
        return articles;
    }

    public static class NewsArticle{
        @JsonProperty("headline")
        private String headline;

        @JsonProperty("url")
        private String url;

        @JsonProperty("summary")
        private String summary;

        @JsonProperty("source")
        private String source;

        @JsonProperty("datetime")
        private long datetime;


        public long getDatetime() {
            return datetime;
        }

        public void setDatetime(long datetime) {
            this.datetime = datetime;
        }

        public String getHeadline() {
            return headline;
        }

        public void setHeadline(String headline) {
            this.headline = headline;
        }

        public String getSource() {
            return source;
        }

        public void setSource(String source) {
            this.source = source;
        }

        public String getSummary() {
            return summary;
        }

        public void setSummary(String summary) {
            this.summary = summary;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }
}
