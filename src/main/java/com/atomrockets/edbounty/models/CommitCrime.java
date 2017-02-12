package com.atomrockets.edbounty.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CommitCrime extends AbstractEvent {
    private String crimeType;
    private String faction;
    private String victim;
    @JsonProperty("Victim_Localised")
    private String vicitimLocalised;
    private long bounty;
}
