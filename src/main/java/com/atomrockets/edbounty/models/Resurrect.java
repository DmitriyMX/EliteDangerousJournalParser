package com.atomrockets.edbounty.models;

import lombok.Data;

@Data
public class Resurrect extends AbstractEvent {
    private String option;
    private long cost;
    private boolean bankrupt;
}
