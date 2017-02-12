package com.atomrockets.edbounty.models;

import lombok.Data;

@Data
public class Liftoff extends AbstractEvent {
    private float latitude;
    private float longitude;
}
