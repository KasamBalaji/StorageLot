package com.balaji.service.pricingstrategy;

import com.balaji.model.Token;
import com.balaji.util.DateUtil;

import java.time.Duration;
import java.time.LocalDateTime;

public class PricingStrategy implements IPricingStrategy {
    @Override
    public float price(Token token) {
        LocalDateTime checkInTime = token.getCheckInTime();
        LocalDateTime checkOutTime = token.getCheckOutTime();

        Duration duration = DateUtil.difference(checkInTime,checkOutTime);

        return (float) (duration.getSeconds()*0.05);
    }
}
