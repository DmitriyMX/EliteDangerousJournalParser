package com.atomrockets.edbounty.models;

import com.atomrockets.edbounty.models.submodels.StarPosition;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class FSDJump extends AbstractEvent{
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
    private float jumpDist;
    private float fuelUsed;
    private float fuelLevel;
    private String systemFaction;
    private String factionState;
}
