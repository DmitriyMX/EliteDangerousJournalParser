package com.atomrockets.edbounty.models;

import lombok.Data;

@Data
public class LoadGame extends AbstractEvent {
    private String commander;
    private String ship;
    private int shipId;
    private String gameMode;
    private String group;
    private long credits;
    private long loan;
}
