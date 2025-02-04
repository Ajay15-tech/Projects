package com.ajay;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        // Create a HashSet of strings
        HashSet<String> cities = new HashSet<>();

        // Add five city names to the set, ensuring at least one duplicate entry
        cities.add("New York");
        cities.add("Los Angeles");
        cities.add("Chicago");
        cities.add("Miami");
        cities.add("Los Angeles"); // Duplicate entry

        // Display the elements to show that duplicates are not allowed
        System.out.println("Cities in the set: " + cities);

        // Check if a particular city exists in the set
        String cityToCheck = "Chicago";
        if (cities.contains(cityToCheck)) {
            System.out.println(cityToCheck + " is present in the set.");
        } else {
            System.out.println(cityToCheck + " is not present in the set.");
        }

        // Remove a city and display the updated set
        String cityToRemove = "Miami";
        cities.remove(cityToRemove);
        System.out.println("Updated cities in the set after removing " + cityToRemove + ": " + cities);
    }
}
