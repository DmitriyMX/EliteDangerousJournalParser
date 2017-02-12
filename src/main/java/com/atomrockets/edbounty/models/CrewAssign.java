package com.atomrockets.edbounty.models;

import lombok.Data;

@Data
public class CrewAssign extends AbstractEvent {
    private String name;
    private String role;
}
