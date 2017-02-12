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
        @JsonSubTypes.Type(value = CapShipBond.class, name = "CapShipBond"),
        @JsonSubTypes.Type(value = Died.class, name = "Died"),
        @JsonSubTypes.Type(value = EscapeInterdiction.class, name = "EscapeInterdiction"),
        @JsonSubTypes.Type(value = FactionKillBond.class, name = "FactionKillBond"),
        @JsonSubTypes.Type(value = HeatDamage.class, name = "HeatDamage"),
        @JsonSubTypes.Type(value = HeatWarning.class, name = "HeatWarning"),
        @JsonSubTypes.Type(value = HullDamage.class, name = "HullDamage"),
        @JsonSubTypes.Type(value = Interdicted.class, name = "Interdicted"),
        @JsonSubTypes.Type(value = Interdiction.class, name = "Interdiction"),
        @JsonSubTypes.Type(value = PVPKill.class, name = "PVPKill"),
        @JsonSubTypes.Type(value = ShieldState.class, name = "ShieldState"),

        // Exploration
        @JsonSubTypes.Type(value = Scan.class, name = "Scan"),
        @JsonSubTypes.Type(value = BuyExplorationData.class, name = "BuyExplorationData"),
        @JsonSubTypes.Type(value = MaterialCollected.class, name = "MaterialCollected"),
        @JsonSubTypes.Type(value = MaterialDiscarded.class, name = "MaterialDiscarded"),
        @JsonSubTypes.Type(value = MaterialDiscovered.class, name = "MaterialDiscovered"),
        @JsonSubTypes.Type(value = SellExplorationData.class, name = "SellExplorationData"),
        @JsonSubTypes.Type(value = Screenshot.class, name = "Screenshot"),

        // Trade
        @JsonSubTypes.Type(value = BuyTradeData.class, name = "BuyTradeData"),
        @JsonSubTypes.Type(value = CollectCargo.class, name = "CollectCargo"),
        @JsonSubTypes.Type(value = EjectCargo.class, name = "EjectCargo"),
        @JsonSubTypes.Type(value = MarketBuy.class, name = "MarketBuy"),
        @JsonSubTypes.Type(value = MarketSell.class, name = "MarketSell"),
        @JsonSubTypes.Type(value = MiningRefined.class, name = "MiningRefined"),

        // Station Services
        @JsonSubTypes.Type(value = BuyAmmo.class, name = "BuyAmmo"),
        @JsonSubTypes.Type(value = BuyDrones.class, name = "BuyDrones"),
        @JsonSubTypes.Type(value = CrewAssign.class, name = "CrewAssign"),
        @JsonSubTypes.Type(value = CrewFire.class, name = "CrewFire"),
        @JsonSubTypes.Type(value = CrewHire.class, name = "CrewHire"),
        @JsonSubTypes.Type(value = EngineerApply.class, name = "EngineerApply"),
        @JsonSubTypes.Type(value = EngineerCraft.class, name = "EngineerCraft"),
        @JsonSubTypes.Type(value = EngineerProgress.class, name = "EngineerProgress"),
        @JsonSubTypes.Type(value = FetchRemoteModule.class, name = "FetchRemoteModule"),
        @JsonSubTypes.Type(value = MassModuleStore.class, name = "MassModuleStore"),
        @JsonSubTypes.Type(value = MissionAbandoned.class, name = "MissionAbandoned"),
        @JsonSubTypes.Type(value = MissionAccepted.class, name = "MissionAccepted"),
        @JsonSubTypes.Type(value = MissionCompleted.class, name = "MissionCompleted"),
        @JsonSubTypes.Type(value = MissionFailed.class, name = "MissionFailed"),
        @JsonSubTypes.Type(value = ModuleBuy.class, name = "ModuleBuy"),
        @JsonSubTypes.Type(value = ModuleRetrieve.class, name = "ModuleRetrieve"),
        @JsonSubTypes.Type(value = ModuleSell.class, name = "ModuleSell"),
        @JsonSubTypes.Type(value = ModuleSellRemote.class, name = "ModuleSellRemote"),
        @JsonSubTypes.Type(value = ModuleStore.class, name = "ModuleStore"),
        @JsonSubTypes.Type(value = ModuleSwap.class, name = "ModuleSwap"),
        @JsonSubTypes.Type(value = PayFines.class, name = "PayFines"),
        @JsonSubTypes.Type(value = PayLegacyFines.class, name = "PayLegacyFines"),
        @JsonSubTypes.Type(value = RedeemVoucher.class, name = "RedeemVoucher"),
        @JsonSubTypes.Type(value = RefuelAll.class, name = "RefuelAll"),
        @JsonSubTypes.Type(value = Repair.class, name = "Repair"),
        @JsonSubTypes.Type(value = RepairAll.class, name = "RepairAll"),
        @JsonSubTypes.Type(value = RestockVehicle.class, name = "RestockVehicle"),
        @JsonSubTypes.Type(value = SellDrones.class, name = "SellDrones"),
        @JsonSubTypes.Type(value = ShipyardBuy.class, name = "ShipyardBuy"),
        @JsonSubTypes.Type(value = ShipyardNew.class, name = "ShipyardNew"),
        @JsonSubTypes.Type(value = ShipyardSell.class, name = "ShipyardSell"),
        @JsonSubTypes.Type(value = ShipyardSwap.class, name = "ShipyardSwap"),
        @JsonSubTypes.Type(value = ShipyardTransfer.class, name = "ShipyardTransfer"),

        // Other Events
        @JsonSubTypes.Type(value = ApproachSettlement.class, name = "ApproachSettlement"),
        @JsonSubTypes.Type(value = CockpitBreached.class, name = "CockpitBreached"),
        @JsonSubTypes.Type(value = CommitCrime.class, name = "CommitCrime"),
        @JsonSubTypes.Type(value = DatalinkScan.class, name = "DatalinkScan"),
        @JsonSubTypes.Type(value = DatalinkVoucher.class, name = "DatalinkVoucher"),
        @JsonSubTypes.Type(value = DataScanned.class, name = "DataScanned"),
        @JsonSubTypes.Type(value = DockFighter.class, name = "DockFighter"),
        @JsonSubTypes.Type(value = DockSRV.class, name = "DockSRV"),
        @JsonSubTypes.Type(value = FuelScoop.class, name = "FuelScoop"),
        @JsonSubTypes.Type(value = JetConeBoost.class, name = "JetConeBoost"),
        @JsonSubTypes.Type(value = LaunchFighter.class, name = "LaunchFighter"),
        @JsonSubTypes.Type(value = LaunchSRV.class, name = "LaunchSRV"),
        @JsonSubTypes.Type(value = Promotion.class, name = "Promotion"),
        @JsonSubTypes.Type(value = RebootRepair.class, name = "RebootRepair"),
        @JsonSubTypes.Type(value = ReceiveText.class, name = "ReceiveText"),
        @JsonSubTypes.Type(value = Resurrect.class, name = "Resurrect"),
        @JsonSubTypes.Type(value = SendText.class, name = "SendText"),
        @JsonSubTypes.Type(value = Synthesis.class, name = "Synthesis"),
        @JsonSubTypes.Type(value = USSDrop.class, name = "USSDrop"),
        @JsonSubTypes.Type(value = VehicleSwitch.class, name = "VehicleSwitch"),
        @JsonSubTypes.Type(value = WingAdd.class, name = "WingAdd"),
        @JsonSubTypes.Type(value = WingJoin.class, name = "WingJoin"),
        @JsonSubTypes.Type(value = WingLeave.class, name = "WingLeave"),
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
