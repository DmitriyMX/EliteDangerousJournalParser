package com.atomrockets.edbounty.models;

import com.atomrockets.edbounty.models.submodels.Item;
import lombok.Data;

import java.util.List;

@Data
public class MassModuleStore extends AbstractEvent {
    private String ship;
    private int shipId;
    private List<Item> items;
}
