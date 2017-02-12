package com.atomrockets.edbounty.models;

import lombok.Data;

@Data
public class MarketSell extends AbstractEvent {
    private String type;
    private int count;
    private long sellPrice;
    private long totalSale;
    private long avgPricePaid;
}
