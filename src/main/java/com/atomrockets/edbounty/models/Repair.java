package com.atomrockets.edbounty.models;

import lombok.Data;

@Data
public class Repair extends AbstractEvent {
    private String item;
    private long cost;
}
