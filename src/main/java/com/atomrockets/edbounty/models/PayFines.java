package com.atomrockets.edbounty.models;

import lombok.Data;

@Data
public class PayFines extends AbstractEvent {
    private long amount;
    private float brokerPercentage;
}
