package com.balaji.model;


import lombok.Data;

@Data
public class Box {


    private int height;
    private int width;
    private int length;

    private double weight;

    private String Id;
    private String description;

    public boolean smallerThan(Box box) {
        return this.width <= box.getWidth() && this.length <= box.getLength();
    }

}
