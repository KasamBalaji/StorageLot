package com.balaji.model.floorcontext;

import com.balaji.model.Location;
import lombok.Data;

@Data
public class FirstFitContext extends FloorContext {

    private Location lastPlacedBox;
    private Integer maxLength = 0;

}
