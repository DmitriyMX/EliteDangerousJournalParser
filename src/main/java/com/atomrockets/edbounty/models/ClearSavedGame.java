package com.atomrockets.edbounty.models;

import lombok.Data;

@Data
public class ClearSavedGame extends AbstractEvent {
    private String name;
}
