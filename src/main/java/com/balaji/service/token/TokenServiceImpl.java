package com.balaji.service.token;

import com.balaji.model.Box;
import com.balaji.model.Floor;
import com.balaji.model.Location;
import com.balaji.model.Token;
import com.balaji.service.pricingstrategy.IPricingStrategy;

import java.util.UUID;

public class TokenServiceImpl implements TokenService {

    private IPricingStrategy IPricingStrategy;
    @Override
    public Token checkIn(Floor floor, Box box, Location location) {
        Token token = new Token();
        token.setTokenId(String.valueOf(UUID.randomUUID()));
        token.setBoxId(box.getId());
        token.setFloorId(floor.getId());
        return null;

    }

    @Override
    public Token checkOut(Token token) {
        return null;
    }
}
