package com.atomrockets.edbounty.models;

import lombok.Data;

@Data
public class DockingTimeout extends AbstractEvent {
    private String stationName;
}
