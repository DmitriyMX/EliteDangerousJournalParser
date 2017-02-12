package com.atomrockets.edbounty.models;

import lombok.Data;

@Data
public class RedeemVoucher extends AbstractEvent {
    private String type;
    private long amount;
}
