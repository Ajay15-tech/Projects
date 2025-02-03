package com.ajay;

//Abstract class Shape
abstract class Shape {
 // Abstract method to draw the shape
 public abstract void draw();
}

//Derived class Circle
class Circle extends Shape {
 // Implementing the draw method for Circle
 @Override
 public void draw() {
     System.out.println("Drawing a Circle");
 }
}

//Derived class Rectangle
class Rectangle extends Shape {
 // Implementing the draw method for Rectangle
 @Override
 public void draw() {
     System.out.println("Drawing a Rectangle");
 }
}

//Main class to demonstrate polymorphism
public class ShapeDrawingApp {
 public static void main(String[] args) {
     // Create an array of Shape objects (polymorphism in action)
     Shape[] shapes = new Shape[3];
     
     // Add Circle and Rectangle objects to the array
     shapes[0] = new Circle();
     shapes[1] = new Rectangle();
     shapes[2] = new Circle(); // Another Circle

     // Call the draw method on each shape in the array
     for (Shape shape : shapes) {
         shape.draw();  // Polymorphic call - the correct method will be called based on the object type
     }
 }
}
