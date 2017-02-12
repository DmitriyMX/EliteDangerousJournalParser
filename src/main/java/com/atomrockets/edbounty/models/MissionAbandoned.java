package com.atomrockets.edbounty.models;

import lombok.Data;

@Data
public class MissionAbandoned extends AbstractEvent {
    private String name;
    private int missionId;
}
