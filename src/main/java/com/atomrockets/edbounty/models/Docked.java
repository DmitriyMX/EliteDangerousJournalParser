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
    private boolean cockpitBreach;

    /*
     * Backwards compatible setters
     */
    private String factionState;
    private String security;
    @JsonProperty("Security_Localised")
    private String securityLocalised;

    @JsonProperty("allegiance")
    public void setAllegiance(String allegiance) {
        this.stationAllegiance = allegiance;
    }

    @JsonProperty("economy")
    public void setEconomy(String economy) {
        this.stationEconomy = economy;
    }

    @JsonProperty("Economy_Localised")
    public void setEconomyLocalised(String economyLocalised) {
        this.stationEconomyLocalised = economyLocalised;
    }

    @JsonProperty("Government")
    public void setGovernment(String government) {
        this.stationGovernment = government;
    }

    @JsonProperty("Government_Localised")
    public void setGovernmentLocalised(String governmentLocalised) {
        this.stationGovernmentLocalised = governmentLocalised;
    }

    @JsonProperty("Security")
    public void setSecurity(String security) {
        this.security = security;
    }

    @JsonProperty("Security_Localised")
    public void setSecurityLocalised(String securityLocalised) {
        this.securityLocalised = securityLocalised;
    }

    @JsonProperty("Faction")
    public void setFaction(String faction) {
        this.stationFaction = faction;
    }
}
