package com.parciallabv.parcialLabV.api.deserializer;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.google.gson.*;
import com.parciallabv.parcialLabV.api.JugadorApi;
import org.h2.util.json.JSONObject;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

public class DeserializeListJugadorApi implements JsonDeserializer<List<JugadorApi>> {

        public static final ObjectMapper mapper = new ObjectMapper();
        private static final CollectionType collectionType =
            TypeFactory
                    .defaultInstance()
                    .constructCollectionType(List.class, JugadorApi.class);
    @Override
    public List<JugadorApi> deserialize(JsonParser jsonParser, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException, IOException {
        ObjectNode objectNode = mapper.readTree(jsonParser);
        JsonNode nodeJugadores = objectNode.get("JugadorApi");

        if (null == nodeJugadores                     // if no author node could be found
                || !nodeJugadores.isArray()           // or author node is not an array
                || !nodeJugadores.elements().hasNext())   // or author node doesn't contain any authors
            return null;

        return mapper.reader(collectionType).readValue(nodeJugadores);
    }
}
