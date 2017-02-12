package com.atomrockets.edbounty.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ModuleSellRemote extends AbstractEvent {
    private int storageSlot;
    private String sellItem;
    @JsonProperty("SellItem_Localised")
    private String sellItemLocalised;
    private long sellPrice;
    private String ship;
    private int shipId;
    private long serverId;
}
