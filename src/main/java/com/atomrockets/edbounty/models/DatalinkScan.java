package com.atomrockets.edbounty.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class DatalinkScan extends AbstractEvent {
    private String message;
    @JsonProperty("Message_Localised")
    private String messageLocalised;
}
