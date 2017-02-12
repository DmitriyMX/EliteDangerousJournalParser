package com.atomrockets.edbounty.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Docked extends AbstractEvent {
    private String stationName;
    private String stationType;
    private String starSystem;
    private String stationFaction;
    private String stationGovernment;
    @JsonProperty("stationGovernment_Localised")
    private String stationGovernmentLocalised;
    private String stationAllegiance;
    private String stationEconomy;
    @JsonProperty("stationEconomy_Localised")
    private String stationEconomyLocalised;
}
