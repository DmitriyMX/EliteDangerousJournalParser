package com.atomrockets.edbounty.models;

import lombok.Data;

@Data
public class BuyAmmo extends AbstractEvent {
    private long cost;
}
