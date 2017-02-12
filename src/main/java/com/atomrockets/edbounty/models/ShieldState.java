package com.atomrockets.edbounty.models;

import lombok.Data;

@Data
public class ShieldState extends AbstractEvent {
    private boolean shieldsUp;
}
