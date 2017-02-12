package com.atomrockets.edbounty.models;

import com.atomrockets.edbounty.models.submodels.StarPosition;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class FSDJump extends AbstractEvent{
    private String starSystem;
    private StarPosition starPos;
    private boolean boostUsed;
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
    private float jumpDist;
    private float fuelUsed;
    private float fuelLevel;
    private String systemFaction;
    private String factionState;

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
