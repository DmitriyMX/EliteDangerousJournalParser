package com.atomrockets.edbounty.models;

import lombok.Data;

@Data
public class ShipyardSell extends AbstractEvent {
    private String shipType;
    private int sellShipId;
    private long shipPrice;
}
