package com.devcamp;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class App {
	public static void main(String[] args) throws IOException, InterruptedException {
		// making Http request and parse to object
		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder().GET().header("accept", "application/json")
				.uri(URI.create("https://fakestoreapi.com/products")).build();
		HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
		ObjectMapper mapper = new ObjectMapper();

		List<TestClass> list = mapper.readValue(response.body(), new TypeReference<List<TestClass>>() {
		});

		list.forEach(System.out::println);

	}

}
