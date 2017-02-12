package com.atomrockets.edbounty.models;

import lombok.Data;

@Data
public class MaterialCollected extends AbstractEvent {
    private String category;
    private String name;
    private int count;
}
