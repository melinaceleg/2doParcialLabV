package com.parciallabv.parcialLabV.api;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiCallSportDataService {

        public DataResponseList getData() throws IOException, InterruptedException {

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://app.sportdataapi.com/api/v1/soccer/players?apikey=6f8ae170-cee6-11eb-89c5-f7eb45b42062&country_id=13"))
                    .header("accept", "application/json")
                    .method("GET", HttpRequest.BodyPublishers.noBody())
                    .build();
            HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());

            return new Gson().fromJson(response.body(),DataResponseList.class); ///hace el mapeo del body al bojeto, pasando cada uno de los campos

        }

}
