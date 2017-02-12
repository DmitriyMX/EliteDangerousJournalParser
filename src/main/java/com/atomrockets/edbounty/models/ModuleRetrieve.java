package com.atomrockets.edbounty.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ModuleRetrieve extends AbstractEvent {
    private String slot;
    private String retrievedItem;
    @JsonProperty("RetrievedItem_Localised")
    private String retrievedItemLocalised;
    private String swapOutItem;
    @JsonProperty("SwapOutItem_Localised")
    private String swapOutItemLocalised;
    private String engineerModifications;
    private long cost;
    private String ship;
    private int shipId;
}
