package com.atomrockets.edbounty.models;

import lombok.Data;

@Data
public class RepairAll extends AbstractEvent {
    private long cost;
}
