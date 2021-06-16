package com.parciallabv.parcialLabV.api;

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.parciallabv.parcialLabV.api.deserializer.DeserializeListJugadorApi;
import com.parciallabv.parcialLabV.model.Jugador;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DataResponseList {

    @SerializedName("Data")
    @JsonAdapter(DeserializeListJugadorApi.class)
    private List<JugadorApi> Data;
}
