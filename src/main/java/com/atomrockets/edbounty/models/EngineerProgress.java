package com.atomrockets.edbounty.models;

import lombok.Data;

@Data
public class EngineerProgress extends AbstractEvent {
    private String engineer;
    private int rank;
    private String progress; //(Invited/Acquainted/Unlocked/Barred)
}
