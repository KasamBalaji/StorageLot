package com.balaji.model.floorcontext;


import lombok.Data;

@Data
public abstract class FloorContext {

    //Floor Context has basic info of grid which helps Strategy in deciding
    private boolean[][] grid;

    public int getLength(){
        return grid.length;
    }

    public int getWidth(){
        return grid[0].length;
    }



}
