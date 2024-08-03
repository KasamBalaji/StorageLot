package com.balaji.model.floorcontext;

import com.balaji.enums.BoxType;
import com.balaji.model.Box;
import lombok.Data;


@Data
public class ClassifcationContext extends FloorContext {

    private Box smallBox;
    private Box mediumBox;

    private Integer smallLimit = 0;

    private Integer mediumLimit = 0;

    private Integer largeLimit = 0;

    private Integer smallCount = 0;

    private Integer mediumCount = 0;

    private Integer largeCount = 0;


    public ClassifcationContext(Box smallBox, Box mediumBox, Box largeBox) {
        this.smallBox = smallBox;
        this.mediumBox = mediumBox;
    }

    public BoxType getCategory(Box box) {
        if (box.smallerThan(smallBox))
            return BoxType.SMALL;
        if (box.smallerThan(mediumBox))
            return BoxType.MEDIUM;
        return BoxType.LARGE;
    }

    public Integer incrementCounter(BoxType type) throws Exception {
        switch (type) {
            case SMALL:
                return ++smallCount;
            case MEDIUM:
                return ++mediumCount;
            case LARGE:
                return ++largeCount;
        }
        throw new Exception("Unknown Box type for Context");
    }

    public Integer getCount(BoxType type) throws Exception {
        switch (type) {
            case SMALL:
                return smallCount;
            case MEDIUM:
                return mediumCount;
            case LARGE:
                return largeCount;
        }
        throw new Exception("Unknown Box type for Context");
    }

    public Integer getLimit(BoxType type) throws Exception {
        switch (type){
            case SMALL:
                return smallLimit;
            case MEDIUM:
                return mediumLimit;
            case LARGE:
                return largeLimit;
        }
        throw new Exception("Unknown Box type for Context");

    }



}
