package com.shambhavi;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class ApiTestRunner {

    public static void main(String[] args) throws Exception {
        HttpClient client = HttpClient.newBuilder()
                .connectTimeout(Duration.ofSeconds(10))
                .build();

        String apiUrl = "https://jsonplaceholder.typicode.com/posts/1";

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(apiUrl))
                .timeout(Duration.ofSeconds(15))
                .GET()
                .build();

        System.out.println("================================");
        System.out.println("      API TESTING PLATFORM");
        System.out.println("================================");
        System.out.println("Testing URL: " + apiUrl);

        long startTime = System.currentTimeMillis();

        HttpResponse<String> response = client.send(
                request,
                HttpResponse.BodyHandlers.ofString()
        );

        long responseTime = System.currentTimeMillis() - startTime;
        int statusCode = response.statusCode();

        System.out.println("\n--- TEST RESULTS ---");
        System.out.println("Status Code: " + statusCode);
        System.out.println("Response Time: " + responseTime + " ms");

        if (statusCode == 200) {
            System.out.println("Status Test: PASS");
        } else {
            System.out.println("Status Test: FAIL");
        }

        if (response.body().contains("\"id\": 1")) {
            System.out.println("Response Body Test: PASS");
        } else {
            System.out.println("Response Body Test: FAIL");
        }

        System.out.println("\n--- RESPONSE BODY ---");
        System.out.println(response.body());
        System.out.println("\nTesting completed!");
    }
}