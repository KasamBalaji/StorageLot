package com.balaji.service.token;

import com.balaji.model.Box;
import com.balaji.model.Floor;
import com.balaji.model.Location;
import com.balaji.model.Token;

public interface TokenService {

    Token checkIn(Floor floor, Box box, Location location);

    Token checkOut(Token token);
}
