package com.atomrockets.edbounty.models;

import lombok.Data;

@Data
public class MissionCompleted extends AbstractEvent {
    private String faction;
    private String name;
    private long missionId;
    private long donation;
    private long reward;
}
