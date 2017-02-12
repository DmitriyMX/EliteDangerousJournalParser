package com.atomrockets.edbounty.models;

import lombok.Data;

@Data
public class DockingCancelled extends AbstractEvent {
    private String stationName;
}
