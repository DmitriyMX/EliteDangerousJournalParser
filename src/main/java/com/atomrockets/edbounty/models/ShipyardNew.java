package com.atomrockets.edbounty.models;

import lombok.Data;

@Data
public class ShipyardNew extends AbstractEvent {
    private String shipType;
    private int newShipId;
}
