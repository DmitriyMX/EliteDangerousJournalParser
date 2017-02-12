package com.atomrockets.edbounty.models.deserializers;

import com.atomrockets.edbounty.models.submodels.StarPosition;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

import java.io.IOException;

public class StarPositionDeserializer extends JsonDeserializer<StarPosition> {
    @Override
    public StarPosition deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
        JsonNode jsonNode = p.getCodec().readTree(p);

        return new StarPosition(jsonNode.get(0).floatValue(), jsonNode.get(1).floatValue(), jsonNode.get(2).floatValue());
    }
}
