package com.atomrockets.edbounty.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.time.ZonedDateTime;

@Data
public class MissionAccepted extends AbstractEvent{
    private long missionId;
    private String faction;
    private String name;
    private String commodity;
    @JsonProperty("Commodity_Localised")
    private String commodityLocalised;
    private Long count;
    private String target;
    private String targetType;
    @JsonProperty("TargetType_Localised")
    private String targetTypeLocalised;
    private String targetFaction;
    private ZonedDateTime expiry;
    private String destinationSystem;
    private String destinationStation;
    private Integer passengerCount;
    private Boolean passengerVips;
    private Boolean passengerWanted;
    private String passengerType;

    @JsonProperty("expiry")
    public void setExpiry(String expiry) {
        this.expiry = ZonedDateTime.parse(expiry);
    }
}
