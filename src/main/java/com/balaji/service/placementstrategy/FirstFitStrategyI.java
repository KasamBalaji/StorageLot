package com.balaji.service.placementstrategy;

import com.balaji.model.Box;
import com.balaji.model.Coordinate;
import com.balaji.model.Location;
import com.balaji.model.floorcontext.FirstFitContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FirstFitStrategyI implements IPlacementStrategy<FirstFitContext> {

    private static final Logger log = LogManager.getLogger(FirstFitStrategyI.class);

    @Override
    public boolean canPlace(FirstFitContext context, Box box) {
        return false;
    }

    @Override
    public Location getLocation(FirstFitContext context, Box box) {
        return null;
    }

    @Override
    public void postPlacementContextUpdate(FirstFitContext context, Box box, Location location) throws Exception {
        context.setLastPlacedBox(location);
        int y = location.getVertices().getLast().getY();
        if (y > context.getMaxLength())
            context.setMaxLength(y);
    }

    private Coordinate getInitialCoordinate(FirstFitContext context) {
        if (context.getLastPlacedBox() == null) return new Coordinate(0, 0);
        Location lastPlaceBox = context.getLastPlacedBox();
        return lastPlaceBox.getVertices().get(3);
    }


}
