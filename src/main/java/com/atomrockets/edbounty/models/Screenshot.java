package com.atomrockets.edbounty.models;

import lombok.Data;

@Data
public class Screenshot extends AbstractEvent {
    private String filename;
    private int width;
    private int height;
    private String system;
    private String body;
}
