package com.atomrockets.edbounty.models;

import lombok.Data;

@Data
public class VehicleSwitch extends AbstractEvent {
    private String to;
}
