package com.atomrockets.edbounty.models;

import lombok.Data;

@Data
public class LaunchSRV extends AbstractEvent {
    private String loadout;
    private boolean playerControlled;
}
