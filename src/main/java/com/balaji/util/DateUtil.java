package com.balaji.util;

import java.time.Duration;
import java.time.LocalDateTime;

public class DateUtil {

    public static Duration difference(LocalDateTime start, LocalDateTime end){
        return Duration.between(start,end);
    }

}
