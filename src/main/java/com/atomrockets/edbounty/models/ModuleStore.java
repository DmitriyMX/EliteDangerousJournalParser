package com.atomrockets.edbounty.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ModuleStore extends AbstractEvent {
    private String slot;
    private String storedItem;
    @JsonProperty("StoredItem_Localised")
    private String storedItemLocalised;
    private long sellPrice;
    private String ship;
    private int shipId;
}
