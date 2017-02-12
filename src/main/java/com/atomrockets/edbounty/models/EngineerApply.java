package com.atomrockets.edbounty.models;

import lombok.Data;

@Data
public class EngineerApply extends AbstractEvent {
    private String engineer;
    private String blueprint;
    private int level;
    private String override;
}
