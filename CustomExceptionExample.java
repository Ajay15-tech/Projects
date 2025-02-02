package com.ajay;

//Custom exception class
class AgeException extends Exception {  // Custom exception extending Exception
 public AgeException(String message) {
     super(message);  // Call the parent constructor with the message
 }
}

public class CustomExceptionExample {

 public static void main(String[] args) {
     try {
         int age = 16;  // Test with age less than 18
         if (age < 18) {
             throw new AgeException("Age must be 18 or older.");  // Throw the custom exception
         }
         System.out.println("You are eligible.");
     } catch (AgeException e) {
         System.out.println("Caught Exception: " + e.getMessage());  // Catch and print the custom exception message
     }
 }
}
