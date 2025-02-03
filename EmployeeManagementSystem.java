package com.ajay;

//Abstract class Employee
abstract class Employee {
 protected String name;
 protected int id;

 // Constructor for Employee
 public Employee(String name, int id) {
     this.name = name;
     this.id = id;
 }

 // Abstract method to calculate salary
 public abstract double calculateSalary();

 // Abstract method to display employee details
 public abstract void displayDetails();
}

//FullTimeEmployee class extending Employee
class FullTimeEmployee extends Employee {
 private double monthlySalary;

 // Constructor for FullTimeEmployee
 public FullTimeEmployee(String name, int id, double monthlySalary) {
     super(name, id);
     this.monthlySalary = monthlySalary;
 }

 // Implement calculateSalary method for FullTimeEmployee
 @Override
 public double calculateSalary() {
     return monthlySalary;
 }

 // Implement displayDetails method for FullTimeEmployee
 @Override
 public void displayDetails() {
     System.out.println("Full-Time Employee ID: " + id);
     System.out.println("Name: " + name);
     System.out.println("Monthly Salary: $" + monthlySalary);
 }
}

//PartTimeEmployee class extending Employee
class PartTimeEmployee extends Employee {
 private double hourlyRate;
 private int hoursWorked;

 // Constructor for PartTimeEmployee
 public PartTimeEmployee(String name, int id, double hourlyRate, int hoursWorked) {
     super(name, id);
     this.hourlyRate = hourlyRate;
     this.hoursWorked = hoursWorked;
 }

 // Implement calculateSalary method for PartTimeEmployee
 @Override
 public double calculateSalary() {
     return hourlyRate * hoursWorked;
 }

 // Implement displayDetails method for PartTimeEmployee
 @Override
 public void displayDetails() {
     System.out.println("Part-Time Employee ID: " + id);
     System.out.println("Name: " + name);
     System.out.println("Hourly Rate: $" + hourlyRate);
     System.out.println("Hours Worked: " + hoursWorked);
 }
}

public class EmployeeManagementSystem {
 public static void main(String[] args) {
     // Creating an array of Employee objects (polymorphism in action)
     Employee[] employees = new Employee[2];
     
     // Adding FullTimeEmployee and PartTimeEmployee to the array
     employees[0] = new FullTimeEmployee("John Doe", 101, 5000);
     employees[1] = new PartTimeEmployee("Jane Smith", 102, 20, 80);

     // Displaying details and calculating salary for each employee using polymorphism
     for (Employee employee : employees) {
         employee.displayDetails();
         System.out.println("Salary: $" + employee.calculateSalary());
         System.out.println();
     }
 }
}
