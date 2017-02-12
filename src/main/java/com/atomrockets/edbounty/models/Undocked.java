package com.atomrockets.edbounty.models;

import lombok.Data;

@Data
public class Undocked extends AbstractEvent {
    private String stationName;
    private String stationType;
}
