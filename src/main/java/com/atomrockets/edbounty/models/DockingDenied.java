package com.atomrockets.edbounty.models;

import lombok.Data;

@Data
public class DockingDenied extends AbstractEvent{
    private String stationName;
    private String reason; //Reasons include: NoSpace, TooLarge, Hostile, Offences, Distance, ActiveFighter, NoReason
}
