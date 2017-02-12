package com.atomrockets.edbounty.models;

import lombok.Data;

@Data
public class HullDamage extends AbstractEvent {
    private float health;
    private boolean playerPilot;
    private boolean fighter;
}
