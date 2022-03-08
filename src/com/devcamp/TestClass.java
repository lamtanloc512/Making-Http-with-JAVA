package com.devcamp;

public record TestClass(int id, String title, double price, String description,
		String category, String image, Rating rating) {
}
record Rating(float rate, long count) {
}