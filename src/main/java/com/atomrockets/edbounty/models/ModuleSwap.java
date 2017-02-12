package com.atomrockets.edbounty.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ModuleSwap extends AbstractEvent {
    private String fromSlot;
    private String toSlot;
    private String fromItem;
    @JsonProperty("FromItem_Localised")
    private String fromItemLocalised;
    private String toItem;
    @JsonProperty("ToItem_Localised")
    private String toItemLocalised;
    private String ship;
    private int shipId;
}
