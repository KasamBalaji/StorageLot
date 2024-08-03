package com.balaji.model;

public class Box {


    private int height;
    private int width;
    private int length;

    private double weight;

    private String Id;
    private String description;


    public int getHeight() {
        return height;
    }


    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public boolean smallerThan(Box box) {
        return this.width <= box.getWidth() && this.length <= box.getLength();
    }

}
