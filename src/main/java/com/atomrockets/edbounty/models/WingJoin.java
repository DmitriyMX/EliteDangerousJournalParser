package com.atomrockets.edbounty.models;

import lombok.Data;

import java.util.List;

@Data
public class WingJoin extends AbstractEvent {
    private List<String> others;
}
