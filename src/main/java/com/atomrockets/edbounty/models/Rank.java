package com.atomrockets.edbounty.models;

import lombok.Data;

@Data
public class Rank extends AbstractEvent {
    private int combat;
    private int trade;
    private int explore;
    private int empire;
    private int federation;
    private int cqc;
}
