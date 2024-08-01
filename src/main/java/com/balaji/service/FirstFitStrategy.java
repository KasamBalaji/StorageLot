package com.balaji.service;

import com.balaji.model.Box;
import com.balaji.model.Floor;
import com.balaji.model.Location;

public class FirstFitStrategy implements  PlacementStrategy{

    @Override
    public boolean canPlace(Floor floor , Box box) {
        return false;
    }

    @Override
    public Location place(Floor floor, Box box) {
        return null;
    }
}
