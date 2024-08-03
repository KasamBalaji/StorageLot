package com.balaji.model;

import com.balaji.model.floorcontext.FloorContext;
import com.balaji.service.placementstrategy.IPlacementStrategy;
import lombok.Data;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Data
public class Floor {
    private static final Logger log = LogManager.getLogger(Floor.class);

    private String Id;
    private int width;
    private int length;
    private boolean[][] grid;

    private IPlacementStrategy strategy;

    private FloorContext floorContext;

    public Floor(int width, int length, IPlacementStrategy strategy, FloorContext context) {
        this.width = width;
        this.length = length;
        this.grid = new boolean[length][width];
        this.floorContext = context;
    }

    public boolean markBox(Location location) {
        Coordinate c1 = location.getVertices().getFirst();
        Coordinate c2 = location.getVertices().getLast();

        for (int i = c1.getX(); i <= c2.getX(); i++)
            for (int j = c1.getY(); j <= c2.getY(); j++)
                this.grid[i][j] = true;
        return true;
    }

    public boolean freeLocation(Location location){
        Coordinate c1 = location.getVertices().getFirst();
        Coordinate c2 = location.getVertices().getLast();

        for (int i = c1.getX(); i <= c2.getX(); i++)
            for (int j = c1.getY(); j <= c2.getY(); j++)
                this.grid[i][j] = false;
        return true;

    }

    public Location placeBox(Box box) throws Exception {
        try {
            Location location = strategy.getLocation(floorContext, box);
            this.markBox(location);
            strategy.postPlacementContextUpdate(floorContext, box, location);
            return location;
        } catch (Exception e) {
            log.error("Unable to place Box {}", box);
            throw e;
        }
    }

}
