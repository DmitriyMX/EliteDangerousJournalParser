package com.atomrockets.edbounty.models;

import lombok.Data;

@Data
public class DockingGranted extends AbstractEvent {
    private int landingPad;
    private String stationName;
}
