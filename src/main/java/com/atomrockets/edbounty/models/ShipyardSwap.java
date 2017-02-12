package com.atomrockets.edbounty.models;

import lombok.Data;

@Data
public class ShipyardSwap extends AbstractEvent {
    private String shipType;
    private int shipId;
    private String storeOldShip;
    private int storeShipID;
}
