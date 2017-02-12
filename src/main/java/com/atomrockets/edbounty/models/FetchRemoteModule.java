package com.atomrockets.edbounty.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class FetchRemoteModule extends AbstractEvent {
    private int storageSlot;
    private String storedItem;
    @JsonProperty("StoredItem_Localised")
    private String storedItemLocalised;
    private long serverId;
    private long transferCost;
    private String ship;
    private int shipId;
}
