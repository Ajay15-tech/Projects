package com.ajay;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        // Create a HashMap to store student roll numbers (Integer) as keys and names (String) as values
        HashMap<Integer, String> students = new HashMap<>();

        // Insert five student records
        students.put(101, "Alice");
        students.put(102, "Bob");
        students.put(103, "Charlie");
        students.put(104, "David");
        students.put(105, "Eva");

        // Retrieve and display the name of a student using a specific roll number
        int rollNumberToRetrieve = 103;
        String studentName = students.get(rollNumberToRetrieve);
        if (studentName != null) {
            System.out.println("The name of student with roll number " + rollNumberToRetrieve + " is " + studentName);
        } else {
            System.out.println("Student with roll number " + rollNumberToRetrieve + " not found.");
        }

        // Remove a student entry using a roll number
        int rollNumberToRemove = 104;
        students.remove(rollNumberToRemove);
        System.out.println("Student with roll number " + rollNumberToRemove + " has been removed.");

        // Display all student records
        System.out.println("\nAll student records:");
        for (Integer rollNumber : students.keySet()) {
            System.out.println("Roll Number: " + rollNumber + ", Name: " + students.get(rollNumber));
        }
    }
}
