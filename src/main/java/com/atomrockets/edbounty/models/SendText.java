package com.atomrockets.edbounty.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class SendText extends AbstractEvent {
    private String to;
    @JsonProperty("To_Localised")
    private String toLocalised;
    private String message;
}
