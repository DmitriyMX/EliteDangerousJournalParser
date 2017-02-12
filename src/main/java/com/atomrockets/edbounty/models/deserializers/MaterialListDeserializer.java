package com.atomrockets.edbounty.models.deserializers;

import com.atomrockets.edbounty.models.submodels.Material;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MaterialListDeserializer extends JsonDeserializer<List<Material>> {
    @Override
    public List<Material> deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
        JsonNode jsonNode = p.getCodec().readTree(p);

        List<Material> materials = new ArrayList<>();


        for (Iterator<String> it = jsonNode.fieldNames(); it.hasNext(); ) {
            String fieldName = it.next();

            materials.add(new Material(fieldName, jsonNode.get(fieldName).asInt()));
        }

        return materials;
    }
}
