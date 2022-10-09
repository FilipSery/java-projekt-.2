package com.engeto.demo;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class APICaller {
    private final String URL = "https://euvatrates.com/rates.json";
    public String getAPI () throws IOException, InterruptedException {

        HttpClient c = HttpClient.newHttpClient();
        HttpRequest r = HttpRequest.newBuilder().GET().uri(URI.create(URL)).build();
        HttpResponse <String> output = c.send(r, HttpResponse.BodyHandlers.ofString());
        String outputString = output.body();
        return outputString;
    }
}
