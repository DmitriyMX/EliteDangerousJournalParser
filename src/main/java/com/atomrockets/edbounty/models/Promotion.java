package com.atomrockets.edbounty.models;

import lombok.Data;

@Data
public class Promotion extends AbstractEvent {
    private Integer combat;
    private Integer trade;
    private Integer explore;
    private Integer cqc;
    private Integer federation;
    private Integer empire;
}
