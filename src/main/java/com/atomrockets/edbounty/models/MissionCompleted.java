package com.atomrockets.edbounty.models;

import com.atomrockets.edbounty.models.submodels.CommodityReward;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class MissionCompleted extends AbstractEvent {
    private long missionId;
    private String faction;
    private String name;
    private String commodity;
    @JsonProperty("Commodity_Localised")
    private String commodityLocalised;
    private int count;
    private String destinationSystem;
    private String destinationStation;
    private String target;
    private String targetType;
    @JsonProperty("TargetType_Localised")
    private String targetTypeLocalised;
    private String targetFaction;
    private long donation;
    private long reward;
    private List<String> permitsAwarded;
    private List<CommodityReward> commodityReward;
}
