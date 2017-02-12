package com.atomrockets.edbounty.models;

import lombok.Data;

@Data
public class LaunchFighter extends AbstractEvent {
    private String loadout;
    private boolean playerControlled;
}
