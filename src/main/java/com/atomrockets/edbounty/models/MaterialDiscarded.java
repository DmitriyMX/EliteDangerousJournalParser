package com.atomrockets.edbounty.models;

import lombok.Data;

@Data
public class MaterialDiscarded extends AbstractEvent {
    private String category;
    private String name;
    private int count;
}
