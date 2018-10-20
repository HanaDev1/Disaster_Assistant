package com.example.hanaalalawi.nasachallenge;

public class Disaster {
    private String name;
    private String description;
    private int img;

    public Disaster(String name, int image) {
        this.name = name;
        this.img = image;
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

    public int getImg() {
        return img;
    }

    public void setImg(int image) {
        this.img = image;
    }
}
