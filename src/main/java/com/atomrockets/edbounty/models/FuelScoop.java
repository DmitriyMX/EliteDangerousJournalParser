package com.atomrockets.edbounty.models;

import lombok.Data;

@Data
public class FuelScoop extends AbstractEvent {
    private float scooped;
    private float total;
}
