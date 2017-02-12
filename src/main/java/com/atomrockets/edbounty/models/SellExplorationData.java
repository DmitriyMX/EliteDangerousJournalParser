package com.atomrockets.edbounty.models;

import lombok.Data;

import java.util.List;

@Data
public class SellExplorationData extends AbstractEvent {
    private List<String> systems;
    private List<String> discovered;
    private long baseValue;
    private long bonus;
}
