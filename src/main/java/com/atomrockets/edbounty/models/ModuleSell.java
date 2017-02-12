package com.atomrockets.edbounty.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ModuleSell extends AbstractEvent {
    private String slot;
    private String sellItem;
    @JsonProperty("SellItem_Localised")
    private String sellItemLocalised;
    private long sellPrice;
    private String ship;
    private int shipId;
}
