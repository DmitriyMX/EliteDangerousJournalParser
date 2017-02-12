package com.atomrockets.edbounty.models;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Fileheader extends AbstractEvent {
    private int part;
    private String language;
    private BigDecimal gameversion;
    private String build;
}
