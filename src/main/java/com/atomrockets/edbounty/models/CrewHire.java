package com.atomrockets.edbounty.models;

import lombok.Data;

@Data
public class CrewHire extends AbstractEvent {
    private String name;
    private String faction;
    private long cost;
    private String combatRank;
}
