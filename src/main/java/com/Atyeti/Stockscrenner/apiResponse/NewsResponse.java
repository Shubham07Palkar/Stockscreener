package com.Atyeti.Stockscrenner.apiResponse;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class NewsResponse {
   private List<NewsArticle> articles;

    public List<NewsArticle> getArticles() {
        return articles;
    }

    public void setArticles(List<NewsArticle> articles) {
        this.articles = articles;
    }

    public static class NewsArticle{

        @JsonProperty("title")
        private String title;

        @JsonProperty("url")
        private String url;

        @JsonProperty("summary")
        private String summary;

        @JsonProperty("banner_image")
        private String bannerImage;

        @JsonProperty("source")
        private String source;

        @JsonProperty("time_published")
        private String timePublished;


        public String getBannerImage() {
            return bannerImage;
        }

        public void setBannerImage(String bannerImage) {
            this.bannerImage = bannerImage;
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

        public String getTimePublished() {
            return timePublished;
        }

        public void setTimePublished(String timePublished) {
            this.timePublished = timePublished;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }

}
