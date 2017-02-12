package com.atomrockets.edbounty.models;

import lombok.Data;

@Data
public class RefuelAll extends AbstractEvent {
    private long cost;
    private float amount;
}
