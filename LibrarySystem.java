package com.ajay;

//Base class
class Item {
 protected String title;
 protected String author;
 protected int publicationYear;

 // Constructor for Item class
 public Item(String title, String author, int publicationYear) {
     this.title = title;
     this.author = author;
     this.publicationYear = publicationYear;
 }

 // Method to display details
 public void displayDetails() {
     System.out.println("Title: " + title);
     System.out.println("Author: " + author);
     System.out.println("Publication Year: " + publicationYear);
 }
}

//Derived class for Book
class Book extends Item {
 private String genre;

 // Constructor for Book class
 public Book(String title, String author, int publicationYear, String genre) {
     super(title, author, publicationYear);
     this.genre = genre;
 }

 // Override displayDetails method for Book class
 @Override
 public void displayDetails() {
     super.displayDetails();
     System.out.println("Genre: " + genre);
 }
}

//Derived class for Magazine
class Magazine extends Item {
 private int issueNumber;

 // Constructor for Magazine class
 public Magazine(String title, String author, int publicationYear, int issueNumber) {
     super(title, author, publicationYear);
     this.issueNumber = issueNumber;
 }

 // Override displayDetails method for Magazine class
 @Override
 public void displayDetails() {
     super.displayDetails();
     System.out.println("Issue Number: " + issueNumber);
 }
}

public class LibrarySystem {
 public static void main(String[] args) {
     // Creating Book object
     Book book = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, "Fiction");

     // Creating Magazine object
     Magazine magazine = new Magazine("National Geographic", "Various", 2025, 101);

     // Display details of Book and Magazine
     System.out.println("Book Details:");
     book.displayDetails();
     
     System.out.println("\nMagazine Details:");
     magazine.displayDetails();
 }
}
