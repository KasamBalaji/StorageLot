package com.balaji.service.placementstrategy;

import com.balaji.enums.BoxType;
import com.balaji.model.Box;
import com.balaji.model.Location;
import com.balaji.model.floorcontext.ClassifcationContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ClassifiedStrategyI implements IPlacementStrategy<ClassifcationContext> {

    private static final Logger log = LogManager.getLogger(ClassifiedStrategyI.class);

    @Override
    public boolean canPlace(ClassifcationContext context, Box box) {
        BoxType type = context.getCategory(box);
        try {
            if (context.getCount(type) >= context.getLimit(type)) return false;
        } catch (Exception e) {
            log.error("Unable to check for place due to {}", e.getMessage());
        }
        return false;

    }

    @Override
    public Location getLocation(ClassifcationContext context, Box box) {
        if (!canPlace(context, box)) {
            throw new RuntimeException("Cannot place box");
        }
        return new Location();
    }

    @Override
    public void postPlacementContextUpdate(ClassifcationContext context, Box box, Location location) throws Exception {
        BoxType type = context.getCategory(box);
        context.incrementCounter(type);
    }
}
