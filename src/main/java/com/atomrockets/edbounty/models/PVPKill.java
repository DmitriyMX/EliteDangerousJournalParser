package com.atomrockets.edbounty.models;

import lombok.Data;

@Data
public class PVPKill extends AbstractEvent {
    private String victim;
    private int combatRank;
}
