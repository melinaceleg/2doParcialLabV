package com.parciallabv.parcialLabV.api.deserializer;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.parciallabv.parcialLabV.api.Country;

import java.lang.reflect.Type;

public class CountryDeserializer implements JsonDeserializer<Country> {

    @Override
    public Country deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        Country country = Country.builder()
                .country_id(jsonElement.getAsJsonObject().get("country_id").getAsInt())
                .name(jsonElement.getAsJsonObject().get("name").getAsString())
                .country_code(jsonElement.getAsJsonObject().get("name").getAsString())
                .continent(jsonElement.getAsJsonObject().get("continent").getAsString()).build();
        return country;
    }
}
