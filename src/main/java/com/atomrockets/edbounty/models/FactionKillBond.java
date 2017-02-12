package com.atomrockets.edbounty.models;

import lombok.Data;

@Data
public class FactionKillBond extends AbstractEvent {
    private long reward;
    private String awardingFaction;
    private String victimFaction;
}
