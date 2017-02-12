package com.atomrockets.edbounty.models;

import lombok.Data;

@Data
public class SupercruiseExit extends AbstractEvent {
    private String starSystem;
    private String body;
    private String bodyType;
}
