package com.example.brianyoung.quoteapp;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ChuckNorrisResponse implements Serializable
{

    @SerializedName("categories")
    @Expose
    private List<String> categories = null;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("icon_url")
    @Expose
    private String iconUrl;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("value")
    @Expose
    private String value;
    private final static long serialVersionUID = 850548863146122988L;
    public static String json = "{\n"+
        "  \"categories\": [\n"+
        "    \"dev\"\n"+
        "  ],\n"+
        "  \"created_at\": \"2020-01-05 13:42:19.324003\",\n"+
        "  \"icon_url\": \"https://assets.chucknorris.host/img/avatar/chuck-norris.png\",\n"+
        "  \"id\": \"ag_6paerrkg-mxfjjqw4ba\",\n"+
        "  \"updated_at\": \"2020-01-05 13:42:19.324003\",\n"+
        "  \"url\": \"https://api.chucknorris.io/jokes/random?category=dev\",\n"+
        "  \"value\": \"Chuck Norris's beard can type 140 wpm.\"\n"+
        "}";

    /**
     * No args constructor for use in serialization
     *
     */
    public ChuckNorrisResponse() {
    }

    /**
     *
     * @param createdAt
     * @param categories
     * @param iconUrl
     * @param id
     * @param value
     * @param url
     * @param updatedAt
     */
    public ChuckNorrisResponse(List<String> categories, String createdAt, String iconUrl, String id, String updatedAt, String url, String value) {
        super();
        this.categories = categories;
        this.createdAt = createdAt;
        this.iconUrl = iconUrl;
        this.id = id;
        this.updatedAt = updatedAt;
        this.url = url;
        this.value = value;
    }

    public List<String> getCategories() {
        return categories;
    }

    public void setCategories(List<String> categories) {
        this.categories = categories;
    }

    public ChuckNorrisResponse withCategories(List<String> categories) {
        this.categories = categories;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public ChuckNorrisResponse withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public ChuckNorrisResponse withIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
        return this;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ChuckNorrisResponse withId(String id) {
        this.id = id;
        return this;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public ChuckNorrisResponse withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public ChuckNorrisResponse withUrl(String url) {
        this.url = url;
        return this;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public ChuckNorrisResponse withValue(String value) {
        this.value = value;
        return this;
    }

}
