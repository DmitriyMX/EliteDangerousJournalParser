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
    private String systemGovernmentLocalised;
    private String systemSecurity;
    @JsonProperty("systemSecurity_Localised")
    private String systemSecurityLocalised;
    private String body;
    private String bodyType;
    private String systemFaction;

    private String factionState;

    //Powerplay Specific
    private List<String> powers;
    private String powerplayState;

    /*
     * Backwards Compatible Setters
     */
    @JsonProperty("allegiance")
    public void setAllegiance(String allegiance) {
        this.systemAllegiance = allegiance;
    }

    @JsonProperty("economy")
    public void setEconomy(String economy) {
        this.systemEconomy = economy;
    }

    @JsonProperty("Economy_Localised")
    public void setEconomyLocalised(String economyLocalised) {
        this.systemEconomyLocalised = economyLocalised;
    }

    @JsonProperty("Government")
    public void setGovernment(String government) {
        this.systemGovernment = government;
    }

    @JsonProperty("Government_Localised")
    public void setGovernmentLocalised(String governmentLocalised) {
        this.systemGovernmentLocalised = governmentLocalised;
    }

    @JsonProperty("Security")
    public void setSecurity(String security) {
        this.systemSecurity = security;
    }

    @JsonProperty("Security_Localised")
    public void setSecurityLocalised(String securityLocalised) {
        this.systemSecurityLocalised = securityLocalised;
    }

    @JsonProperty("Faction")
    public void setFaction(String faction) {
        this.systemFaction = faction;
    }
}

