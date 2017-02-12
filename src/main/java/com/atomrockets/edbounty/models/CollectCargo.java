package com.atomrockets.edbounty.models;

import lombok.Data;

@Data
public class CollectCargo extends AbstractEvent {
    private String type;
    private boolean stolen;
}
