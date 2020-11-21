package com.example.cutebabywallpaper.Adapters;

import java.io.Serializable;

public class UserClass implements Serializable {
private String category;
private String images;

public UserClass(String category, String images) {
        this.category = category;
        this.images = images;
        }

public UserClass(String images) {
        this.images = images;
        }

public String getImages() {
        return images;
        }

public void setImages(String images) {
        this.images = images;
        }

public String getCategory() {
        return category;
        }

public void setCategory(String category) {
        this.category = category;
        }
        }
