package com.atomrockets.edbounty.models;

import lombok.Data;

@Data
public class ShipyardBuy extends AbstractEvent {
    private String shipType;
    private long shipPrice;
    private String storeOldShip;
    private int storeShipId;
    private String sellOldShip;
    private int sellShipId;
    private long sellPrice;
}
