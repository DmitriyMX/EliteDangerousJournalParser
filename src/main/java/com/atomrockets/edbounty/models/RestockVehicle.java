package com.atomrockets.edbounty.models;

import lombok.Data;

@Data
public class RestockVehicle extends AbstractEvent {
    private String type;
    private String loadOut;
    private long cost;
    private int count;
}
