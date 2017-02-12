package com.atomrockets.edbounty.models;

import lombok.Data;

@Data
public class DatalinkVoucher extends AbstractEvent {
    private long reward;
    private String victimFaction;
    private String payeeFaction;
}
