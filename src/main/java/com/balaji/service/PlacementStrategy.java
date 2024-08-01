package com.balaji.service;

import com.balaji.model.Box;
import com.balaji.model.Floor;
import com.balaji.model.Location;

public interface PlacementStrategy {

    boolean canPlace(Floor floor, Box box);
    Location place(Floor floor,Box box);


}
