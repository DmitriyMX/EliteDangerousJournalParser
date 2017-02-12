package com.atomrockets.edbounty.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Interdiction extends AbstractEvent {
    private boolean success;
    private String interdicted;
    @JsonProperty("IsPlayer")
    private boolean player;
    private String combatRank;
    private String faction;
    private String power;
}
