package com.atomrockets.edbounty.models;

import com.atomrockets.edbounty.models.submodels.StarPosition;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class Location extends AbstractEvent {
    private boolean docked;
    private String stationName;
    private String stationType;
    private String starSystem;
    private StarPosition starPos;
    private String systemAllegiance;
    private String systemEconomy;
    @JsonProperty("SystemEconomy_Localised")
    private String systemEconomyLocalised;
    private String systemGovernment;
    @JsonProperty("SystemGovernment_Localised")
    private String SystemGovernmentLocalised;
    private String systemSecurity;
    @JsonProperty("systemSecurity_Localised")
    private String systemSecurityLocalised;
    private String body;
    private String bodyType;
    private String systemFaction;

    //Powerplay Specific
    private List<String> powers;
    private String powerplayState;
}
