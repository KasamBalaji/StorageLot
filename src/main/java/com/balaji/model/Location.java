package com.balaji.model;

import java.util.List;

public class Location {
    private List<Coordinate> vertices;

    public List<Coordinate> getVertices() {
        return vertices;
    }

    public void setVertices(List<Coordinate> vertices) {
        this.vertices = vertices;
    }
}
