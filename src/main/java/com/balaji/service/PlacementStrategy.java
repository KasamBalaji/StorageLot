package com.balaji.service;

import com.balaji.model.Box;
import com.balaji.model.Floor;
import com.balaji.model.Location;
import com.balaji.model.floorcontext.FloorContext;

public interface PlacementStrategy<C extends FloorContext> {

    //The Strategy's Job is only to get FloorContext , use the context and tell if we can place box
    // If we can place return the location of box placement

    boolean canPlace(C context, Box box);

    Location getLocation(C context, Box box);

    void postPlacementContextUpdate(C context, Box box, Location location) throws Exception;


}
