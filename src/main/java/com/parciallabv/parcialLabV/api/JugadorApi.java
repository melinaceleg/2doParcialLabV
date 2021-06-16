package com.parciallabv.parcialLabV.api;


import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.parciallabv.parcialLabV.api.deserializer.CountryDeserializer;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class JugadorApi {
    private Integer player_id;
    private String firstname;
    private String lastname;
    private Integer age;
    private Integer height;
    @SerializedName("country")
    @JsonAdapter(CountryDeserializer.class)
    private Country country;
}
