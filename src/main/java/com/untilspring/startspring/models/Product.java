package com.untilspring.startspring.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String name;
    private double price;
    private String description;
    private double rating;
    private String category;
    private String seller;
    private int stock;
    private int numofReviews;

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

    @ElementCollection
    private List<String> images;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getNumofReviews() {
        return numofReviews;
    }

    public void setNumofReviews(int numofReviews) {
        this.numofReviews = numofReviews;
    }


    public Product() {
        super();
    }


    public Product(String name, double price, String description, double rating, String category, String seller, int stock, int numofReviews, List<String> images) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.rating = rating;
        this.category = category;
        this.seller = seller;
        this.stock = stock;
        this.numofReviews = numofReviews;
        this.images = images;
    }
}