package com.balaji.service.pricingstrategy;

import com.balaji.model.Token;

public interface IPricingStrategy {

    float price(Token token);
}
