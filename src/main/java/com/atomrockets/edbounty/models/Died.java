package com.atomrockets.edbounty.models;

import com.atomrockets.edbounty.models.submodels.Killer;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class Died extends AbstractEvent {
    private String killerName;
    @JsonProperty("KillerName_Localised")
    private String killerNameLocalised;
    private String killerShip;
    private String killerRank;
    private List<Killer> killers;
}
