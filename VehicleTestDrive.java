package com.ajay;

//Base class Vehicle
class Vehicle {
 // Method to start the engine (base class implementation)
 public void startEngine() {
     System.out.println("Vehicle engine started.");
 }
}

//Derived class Car
class Car extends Vehicle {
 // Overriding the startEngine method for Car
 @Override
 public void startEngine() {
     System.out.println("Car engine started with a key turn.");
 }
}

//Derived class Motorcycle
class Motorcycle extends Vehicle {
 // Overriding the startEngine method for Motorcycle
 @Override
 public void startEngine() {
     System.out.println("Motorcycle engine started with a button press.");
 }
}

//Main class to demonstrate polymorphism
public class VehicleTestDrive {
 
 // Method that accepts any Vehicle object and calls its startEngine method
 public static void vehicleTestDrive(Vehicle vehicle) {
     vehicle.startEngine();
 }

 public static void main(String[] args) {
     // Creating objects of Car and Motorcycle
     Vehicle myCar = new Car();
     Vehicle myMotorcycle = new Motorcycle();
     
     // Passing different vehicle objects to vehicleTestDrive method
     System.out.println("Test drive for my car:");
     vehicleTestDrive(myCar);
     
     System.out.println("\nTest drive for my motorcycle:");
     vehicleTestDrive(myMotorcycle);
 }
}
