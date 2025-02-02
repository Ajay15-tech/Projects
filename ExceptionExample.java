package com.ajay;

public class ExceptionExample {

    public static void main(String[] args) {
        // Example for NullPointerException
        String str = null;

        try {
            System.out.println("Trying to access a method on a null object...");
            System.out.println(str.length()); // This will throw NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed after NullPointerException.");
        }

        // Example for ArrayIndexOutOfBoundsException
        int[] arr = {1,2,3};
       
        try {
            System.out.println("Trying to access an invalid array index...");
            System.out.println(arr[5]); // This will throw ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed after ArrayIndexOutOfBoundsException.");
        }
    }
}
