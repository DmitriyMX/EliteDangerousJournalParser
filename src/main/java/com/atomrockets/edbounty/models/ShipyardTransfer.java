package com.atomrockets.edbounty.models;

import lombok.Data;

@Data
public class ShipyardTransfer extends AbstractEvent {
    private String shipType;
    private int shipId;
    private String system;
    private float distance;
    private long transferPrice;
}
