package com.atomrockets.edbounty.models;

import lombok.Data;

@Data
public class BuyTradeData extends AbstractEvent {
    private String system;
    private long cost;
}
