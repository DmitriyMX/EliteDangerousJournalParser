package com.atomrockets.edbounty.models;

import com.atomrockets.edbounty.models.submodels.Ring;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class Scan extends AbstractEvent {
    private String bodyName;
    private long distanceFromArrivalLS;

    // Stars
    private String starType;
    private float stellarMass;
    private float radius;
    private float absoluteMagnitude;
    @JsonProperty("Age_MY")
    private long ageMy;
    private List<Ring> rings;

    // Oribal Parameters Planet/Moon/Star
    private float semiMajorAxis;
    private float eccentricity;
    private float orbitalInclination;
    private float periapsis;
    private float orbitalPeriod;
    private float rotationPeriod;

    // Planet/Moon
    private boolean tidalLock;
    private String terraformState;
    private String planetClass;
    private String atmosphere;
    private String atmosphereType;
    private String volcanism;
    private float surfaceGravity;
    private float surfaceTemperature;
    private float surfacePressure;
    private boolean landable;
    private float massEM;
}

