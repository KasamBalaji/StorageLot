package com.balaji.model;

import lombok.Data;

import java.time.LocalDateTime;


@Data
public class Token {
    private String tokenId;
    private String boxId;
    private String floorId;
    private Location location;

    private LocalDateTime checkInTime;

    private LocalDateTime checkOutTime;

    private double price;

    private boolean paymentStatus;



}
