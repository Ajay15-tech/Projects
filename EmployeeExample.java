package com.ajay;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeExample {

    // Employee class with name, age, and salary
    static class Employee {
        String name;
        int age;
        double salary;

        Employee(String name, int age, double salary) {
            this.name = name;
            this.age = age;
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public double getSalary() {
            return salary;
        }
    }

    public static void main(String[] args) {
        // Create a list of employees
        List<Employee> employees = Arrays.asList(
            new Employee("Alice", 25, 50000),
            new Employee("Bob", 35, 60000),
            new Employee("Charlie", 40, 70000),
            new Employee("David", 28, 55000),
            new Employee("Eve", 45, 80000)
        );

        // Use Streams API to filter employees older than 30
        List<String> names = employees.stream()
            .filter(e -> e.getAge() > 30) // Filter employees older than 30
            .map(Employee::getName)       // Extract names
            .collect(Collectors.toList()); // Collect names into a list

        // Find the average salary of employees older than 30
        double averageSalary = employees.stream()
            .filter(e -> e.getAge() > 30) // Filter employees older than 30
            .mapToDouble(Employee::getSalary) // Map to salary
            .average()                    // Calculate average salary
            .orElse(0);                   // If no employees match, default to 0

        // Print the list of employee names and the average salary
        System.out.println("Employee names (older than 30): " + names);
        System.out.println("Average salary of employees (older than 30): " + averageSalary);
    }
}
