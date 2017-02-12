package com.atomrockets.edbounty.enums;

/**
 * Created by Allan on 2/5/2017.
 */
public enum EventType {
    /* Startup */
    HEADER ("Fileheader"),
    LOADGAME("LoadGame"),
    PROGRESS("Progress"),
    RANK("Rank"),

    /* Travel */
    APPROACH_SETTLEMENT("ApproachSettlement"),
    DOCKED("Docked"),
    DOCKING_CANCELLED("DockingCancelled"),
    DOCKING_DENIED("DockingDenied"),
    DOCKING_GRANTED("DockingGranted"),
    DOCKING_REQUESTED("DockingRequested"),
    DOCKING_TIMEOUT("DockingTimeout"),
    FSDJUMP("FSDJump"),
    LIFTOFF("Liftoff"),
    LOCATION("Location"),
    SUPERCRUISE_ENTRY("SupercruiseEntry"),
    SUPERCRUISE_EXIT("SupercruiseExit"),
    TOUCHDOWN("Touchdown"),
    UNDOCKED("Undocked"),

    /* Combat */
    BOUNTY("Bounty"),
    CAP_SHIP_BOND("CapShipBond"),
    DIED("Died"),
    ESCAPE_INTERDICTION("EscapeInterdiction"),
    FACTION_KILL_BOND("FactionKillBond"),
    HEAT_DAMAGE("HeatDamage"),
    HEAT_WARNING("HeatWarning"),
    HULL_DAMAGE("HullDamage"),
    INTERDICTED("Interdicted"),
    INTERDICTION("Interdiction"),
    SHIELD_STATE("ShieldState"),

    /* Exploration */
    SCAN("Scan"),
    MATERIAL_COLLECTED("MaterialCollected"),
    MATERIAL_DISCARDED("MaterialDiscarded"),
    MATERIAL_DISCOVERED("MaterialDiscovered"),
    BUY_EXPLORATION_DATA("BuyExplorationData"),
    SELL_EXPLORATION_DATA("SellExplorationData"),
    SCREENSHOT("Screenshot"),

    /* Trade */
    BUY_TRADE_DATA("BuyTradeData"),
    COLLECT_CARGO("CollectCargo"),
    EJECT_CARGO("EjectCargo"),
    MARKET_BUY("MarketBuy"),
    MARKED_SELL("MarketSell"),
    MINING_REFINED("MiningRefined"),

    /*Station Services */
    BUY_AMMO("BuyAmmo"),
    BUY_DRONES("BuyDrones"),
    COMMUNITY_GOAL_JOIN("CommunityGoalJoin"),
    COMMUNITY_GOAL_REWARED("CommunityGoalReward"),
    ENGINEER_APPLY("EngineerApply"),
    ENGINEER_CRAFT("EngineerCraft"),
    ENGINEER_PROGRESS("EngineerProgress"),
    FETCH_REMOTE_MODULE("FetchRemoteModule"),
    MISSION_ABANDONED("MissionAbandoned"),
    MISSION_ACCEPTED("MissionAccepted"),
    MISSION_COMPLETED("MissionCompleted"),
    MISSION_FAILED("MissionFailed"),
    MODULE_BUY("ModuleBuy"),
    MODULE_RETRIEVE("ModuleRetrieve"),
    MODULE_SELL("ModuleSell"),
    MODULE_SELL_REMOTE("ModuleSellRemote"),
    MODULE_STORE("ModuleStore"),
    MODULE_SWAP("ModuleSwap"),
    PAY_FINES("PayFines"),
    PAY_LEGACY_FINES("PayLegacyFines"),
    REDEEM_VOUCHER("RedeemVoucher"),
    REFUEL_ALL("RefuelAll"),
    REFUEL_PARTIAL("RefuelPartial"),
    REPAIR("Repair"),
    REPAIR_ALL("RepairAll"),
    RESTOCK_VEHICLE("RestockVehicle"),
    SELL_DRONES("SellDrones"),
    SHIPYARD_BUY("ShipyardBuy"),
    SHIPYARD_NEW("ShipyardNew"),
    SHIPYARD_SELL("ShipyardSell"),
    SHIPYARD_SWAP("ShipyardSwap"),
    SHIPYARD_TRANSFER("ShipyardTransfer"),

    /* Power Play */


    /*Other Events */
    COCKPIT_BREACHED("CockpitBreached"),
    COMMIT_CRIME("CommitCrime"),
    DATALINK_SCANNED("DatalinkScan"),
    DATA_SCANNED("DataScanned"),
    DOCK_FIGHTER("DockFighter"),
    DOCK_SRV("DockSRV"),
    FUEL_SCOOP("FuelScoop"),
    LAUNCH_FIGHTER("LaunchFighter"),
    LAUNCH_SRV("LaunchSRV"),
    PROMOTION("Promotion"),
    REBOOT_REPAIR("RebootRepair"),
    RECIEVE_TEXT("ReceiveText"),
    RESURRECT("Resurrect"),
    SELF_DESTRUCT("SelfDestruct"),
    SEND_TEXT("SendText"),
    SYNTHESIS("Synthesis"),
    USSDROP("USSDrop"),
    VEHICLE_SWITCH("VehicleSwitch"),
    WING_ADD("WingAdd"),
    WING_JOIN("WingJoin"),
    WING_LEAVE("WingLeave"),

    UNKONWN("unknown");

    private final String eventType;

    private EventType(String s) {
        this.eventType = s;
    }
}
