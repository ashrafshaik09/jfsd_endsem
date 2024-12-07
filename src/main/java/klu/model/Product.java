package klu.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Product {
    private int id;
    private String title;
    private double price;
    private String description;
    private String category;
    private String image;

    public Product() {
    }

    public Product(int id, String title, double price, String description, String category, String image) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.description = description;
        this.category = category;
        this.image = image;
    }

    @JsonProperty
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @JsonProperty
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @JsonProperty
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @JsonProperty
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
