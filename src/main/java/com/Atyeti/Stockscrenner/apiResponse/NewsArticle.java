package com.Atyeti.Stockscrenner.apiResponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class NewsArticle {

    @JsonProperty("category")
    private String category;

    @JsonProperty("datetime")
    private long datetime;

    @JsonProperty("headline")
    private String headline;

    @JsonProperty("url")
    private String url;

    @JsonProperty("summary")
    private String summary;

    @JsonProperty("source")
    private String source;

    @JsonProperty("image")
    private String image;

    @JsonProperty("related")
    private String related;

    @JsonProperty("id")
    private long id;


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
