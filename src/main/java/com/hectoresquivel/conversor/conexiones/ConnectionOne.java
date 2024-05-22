package com.hectoresquivel.conversor.conexiones;

import com.google.gson.Gson;
import com.hectoresquivel.conversor.modelos.MonedaBase;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConnectionOne {
    public MonedaBase busqueda(String moneda) {
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/95f4c6824eaedf391c586921/latest/" + moneda);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(direccion).build();
        try {
            HttpResponse<String> response;
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), MonedaBase.class);
        } catch (Exception e) {
            throw new RuntimeException("No encontré esa moneda.");
        }
    }
}
