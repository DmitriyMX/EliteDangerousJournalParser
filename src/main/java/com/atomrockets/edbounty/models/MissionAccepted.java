package com.atomrockets.edbounty.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.time.ZonedDateTime;

@Data
public class MissionAccepted extends AbstractEvent{
    private String faction;
    private String name;
    private ZonedDateTime expiry;
    private long missionId;

    @JsonProperty("expiry")
    public void setExpiry(String expiry) {
        this.expiry = ZonedDateTime.parse(expiry);
    }
}
