package com.balaji.model;

import com.balaji.service.PlacementStrategy;

import java.util.List;

public class Floor {
    int width;
    int length;
    boolean[][] grid;

    PlacementStrategy strategy;

    public Floor(int width, int length, PlacementStrategy strategy){
        this.width = width;
        this.length = length;
        this.grid = new boolean[length][width];
    }

    public boolean markBox(Location location){
        for(int i=location.getX1();i<=location.getX2();i++)
            for(int j=location.getY1();j<=location.getY2();j++)
                    this.grid[i][j]=true;
        return true;
    }



}
