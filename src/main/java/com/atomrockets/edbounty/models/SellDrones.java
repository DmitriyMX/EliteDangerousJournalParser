package com.atomrockets.edbounty.models;

import lombok.Data;

@Data
public class SellDrones extends AbstractEvent {
    private String type;
    private int count;
    private long sellPrice;
    private long totalSale;
}
