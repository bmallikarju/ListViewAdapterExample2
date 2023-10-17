package com.example.listviewadapterexample2.model;

public class CarModel {

    private static String name;
    public static String price;
    private static int image;
    private static String description;

    public CarModel(String name, String price, int image, String description) {
        this.name = name;
        this.price= price;
        this.image = image;
        this.description = description;


    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        CarModel.name = name;
    }

    public static String getPrice() {
        return price;
    }

    public static void setPrice(String price) {
        CarModel.price = price;
    }

    public static int getImage() {
        return image;
    }

    public static void setImage(int image) {
        CarModel.image = image;
    }

    public static String getDescription() {
        return description;
    }

    public static void setDescription(String description) {
        CarModel.description = description;
    }


}


