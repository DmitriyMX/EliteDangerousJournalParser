package com.atomrockets.edbounty.models;

import com.atomrockets.edbounty.models.deserializers.MaterialListDeserializer;
import com.atomrockets.edbounty.models.submodels.Material;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Data;

import java.util.List;

@Data
public class Synthesis extends AbstractEvent {
    private String name;
    @JsonDeserialize(using = MaterialListDeserializer.class)
    private List<Material> materials;
}
