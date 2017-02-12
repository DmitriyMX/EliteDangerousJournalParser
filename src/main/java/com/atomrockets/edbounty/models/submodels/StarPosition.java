package com.atomrockets.edbounty.models.submodels;

import com.atomrockets.edbounty.models.deserializers.StarPositionDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@JsonDeserialize(using = StarPositionDeserializer.class)
public class StarPosition {
    private float x;
    private float y;
    private float z;

    public StarPosition(final float x, final float y, final float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
}
