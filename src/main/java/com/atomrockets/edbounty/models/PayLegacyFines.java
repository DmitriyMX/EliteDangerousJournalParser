package com.atomrockets.edbounty.models;

import lombok.Data;

@Data
public class PayLegacyFines extends AbstractEvent {
    private long amount;
    private float brokerPercentage;
}
