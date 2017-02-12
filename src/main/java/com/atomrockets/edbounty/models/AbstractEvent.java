package com.atomrockets.edbounty.models;

import com.atomrockets.edbounty.enums.EventType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.Data;

import java.time.ZonedDateTime;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "event")
@JsonSubTypes({
        @JsonSubTypes.Type(value = Fileheader.class, name = "Fileheader"),

        // Startup
        @JsonSubTypes.Type(value = ClearSavedGame.class, name = "ClearSavedGame"),
        @JsonSubTypes.Type(value = NewCommander.class, name = "NewCommander"),
        @JsonSubTypes.Type(value = LoadGame.class, name = "LoadGame"),
        @JsonSubTypes.Type(value = Progress.class, name = "Progress"),
        @JsonSubTypes.Type(value = Rank.class, name = "Rank"),

        // Travel
        @JsonSubTypes.Type(value = Docked.class, name = "Docked"),
        @JsonSubTypes.Type(value = DockingCancelled.class, name = "DockingCancelled"),
        @JsonSubTypes.Type(value = DockingDenied.class, name = "DockingDenied"),
        @JsonSubTypes.Type(value = DockingGranted.class, name = "DockingGranted"),
        @JsonSubTypes.Type(value = DockingRequested.class, name = "DockingRequested"),
        @JsonSubTypes.Type(value = DockingTimeout.class, name = "DockingTimeout"),
        @JsonSubTypes.Type(value = FSDJump.class, name = "FSDJump"),
        @JsonSubTypes.Type(value = Liftoff.class, name = "Liftoff"),
        @JsonSubTypes.Type(value = Location.class, name = "Location"),
        @JsonSubTypes.Type(value = SupercruiseEntry.class, name = "SupercruiseEntry"),
        @JsonSubTypes.Type(value = SupercruiseExit.class, name = "SupercruiseExit"),
        @JsonSubTypes.Type(value = Touchdown.class, name = "Touchdown"),
        @JsonSubTypes.Type(value = Undocked.class, name = "Undocked"),

        // Combat
        @JsonSubTypes.Type(value = Bounty.class, name = "Bounty"),
        @JsonSubTypes.Type(value = HeatWarning.class, name = "HeatWarning"),
        @JsonSubTypes.Type(value = HullDamage.class, name = "HullDamage"),
        @JsonSubTypes.Type(value = Interdicted.class, name = "Interdicted"),
        @JsonSubTypes.Type(value = ShieldState.class, name = "ShieldState"),

        // Exploration
        @JsonSubTypes.Type(value = BuyExplorationData.class, name = "BuyExplorationData"),
        @JsonSubTypes.Type(value = MaterialCollected.class, name = "MaterialCollected"),

        // Trade
        @JsonSubTypes.Type(value = MarketSell.class, name = "MarketSell"),

        // Station Services
        @JsonSubTypes.Type(value = BuyAmmo.class, name = "BuyAmmo"),
        @JsonSubTypes.Type(value = CrewAssign.class, name = "CrewAssign"),
        @JsonSubTypes.Type(value = MissionAccepted.class, name = "MissionAccepted"),
        @JsonSubTypes.Type(value = MissionCompleted.class, name = "MissionCompleted"),
        @JsonSubTypes.Type(value = ModuleBuy.class, name = "ModuleBuy"),
        @JsonSubTypes.Type(value = RedeemVoucher.class, name = "RedeemVoucher"),
        @JsonSubTypes.Type(value = RefuelAll.class, name = "RefuelAll"),
        @JsonSubTypes.Type(value = Repair.class, name = "Repair"),
        @JsonSubTypes.Type(value = RepairAll.class, name = "RepairAll"),
        @JsonSubTypes.Type(value = RestockVehicle.class, name = "RestockVehicle"),
        @JsonSubTypes.Type(value = ShipyardSell.class, name = "ShipyardSell"),
        @JsonSubTypes.Type(value = ShipyardSwap.class, name = "ShipyardSwap"),

        // Other Events
        @JsonSubTypes.Type(value = ApproachSettlement.class, name = "ApproachSettlement"),
        @JsonSubTypes.Type(value = CommitCrime.class, name = "CommitCrime"),
        @JsonSubTypes.Type(value = DockFighter.class, name = "DockFighter"),
        @JsonSubTypes.Type(value = LaunchFighter.class, name = "LaunchFighter"),
        @JsonSubTypes.Type(value = RebootRepair.class, name = "RebootRepair"),
        @JsonSubTypes.Type(value = ReceiveText.class, name = "ReceiveText"),



})
@Data
public abstract class AbstractEvent {
    private ZonedDateTime timestamp;
    private EventType event;

    @JsonProperty("timestamp")
    public void setTimestamp(String timestamp) {
        this.timestamp = ZonedDateTime.parse(timestamp);
    }
}
