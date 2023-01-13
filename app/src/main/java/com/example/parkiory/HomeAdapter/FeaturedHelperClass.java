package com.example.parkiory.HomeAdapter;

public class FeaturedHelperClass {
    int image;
    String name, description;

    public FeaturedHelperClass(int image, String name, String description) {
        this.image = image;
        this.name = name;
        this.description = description;
    }

    public int getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
