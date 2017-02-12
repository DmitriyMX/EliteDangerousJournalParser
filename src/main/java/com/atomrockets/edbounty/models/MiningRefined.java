package com.atomrockets.edbounty.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class MiningRefined extends AbstractEvent {
    private String type;
    @JsonProperty("Type_Localised")
    private String typeLocalised;
}
