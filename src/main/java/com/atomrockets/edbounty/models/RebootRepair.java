package com.atomrockets.edbounty.models;

import lombok.Data;

import java.util.List;

@Data
public class RebootRepair extends AbstractEvent {
    private List<String> modules;
}
