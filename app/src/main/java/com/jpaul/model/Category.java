package com.jpaul.model;

public class Category {
    private String name;
    private String description;
    private String urlImage;

    public Category(String name, String description, String urlImage) {
        this.name = name;
        this.description = description;
        this.urlImage = urlImage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrlImage() { return urlImage; }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

}