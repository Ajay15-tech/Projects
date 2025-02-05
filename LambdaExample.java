package com.ajay;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class LambdaExample {

    // Functional Interface
    @FunctionalInterface
    interface StringProcessor {
        String process(String str);
    }

    public static void main(String[] args) {

        // List of Strings
        List<String> strings = new ArrayList<>();
        strings.add("apple");
        strings.add("banana");
        strings.add("cherry");
        strings.add("date");

        // Sorting the list in reverse alphabetical order using a lambda expression
        strings.sort((str1, str2) -> str2.compareTo(str1)); // Reverse alphabetical order

        System.out.println("Sorted list in reverse alphabetical order:");
        for (String str : strings) {
            System.out.println(str);
        }

        // Using the StringProcessor functional interface and lambda to process and print uppercase strings
        StringProcessor processor = str -> str.toUpperCase();

        System.out.println("\nUppercase forms of the strings:");
        for (String str : strings) {
            System.out.println(processor.process(str));
        }
    }
}
