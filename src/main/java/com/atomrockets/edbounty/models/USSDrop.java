package com.atomrockets.edbounty.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class USSDrop extends AbstractEvent {
    private String ussType;
    @JsonProperty("USSType_Localised")
    private String ussTypeLocalised;
    private String ussThreat;
}
