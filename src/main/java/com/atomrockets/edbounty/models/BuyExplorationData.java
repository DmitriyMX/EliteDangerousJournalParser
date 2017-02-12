package com.atomrockets.edbounty.models;

import lombok.Data;

@Data
public class BuyExplorationData extends AbstractEvent {
    private String system;
    private long cost;
}
