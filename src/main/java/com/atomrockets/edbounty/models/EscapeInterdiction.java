package com.atomrockets.edbounty.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class EscapeInterdiction extends AbstractEvent {
    private String interdictor;
    @JsonProperty("IsPlayer")
    private boolean player;
}
