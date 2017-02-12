package com.atomrockets.edbounty.models.submodels;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Material {
    private String type;
    private String name;
    private int count;

    public Material(final String name, final int count) {
        this.name = name;
        this.count = count;
    }
}
