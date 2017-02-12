package com.atomrockets.edbounty.models;

import lombok.Data;

@Data
public class MarketBuy extends AbstractEvent {
    private String type;
    private int count;
    private long buyPrice;
    private long totalCost;
}
