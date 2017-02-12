package com.atomrockets.edbounty.models;

import lombok.Data;

@Data
public class EjectCargo extends AbstractEvent {
    private String type;
    private int count;
    private boolean abandoned;

    // Powerplay
    private String powerplayOrigin;
}
