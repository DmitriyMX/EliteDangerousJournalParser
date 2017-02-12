package com.atomrockets.edbounty.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class NewCommander extends AbstractEvent {
    private String name;
    @JsonProperty("package")
    private String thePackage;
}
