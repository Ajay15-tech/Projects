package com.ajay;

//Abstract class PaymentMethod
abstract class PaymentMethod {
 // Abstract method to process payment
 public abstract void processPayment(double amount);
}

//Derived class CreditCard
class CreditCard extends PaymentMethod {
 // Implementing the processPayment method for CreditCard
 @Override
 public void processPayment(double amount) {
     double fee = 0.02 * amount;  // 2% transaction fee for CreditCard
     double totalAmount = amount + fee;
     System.out.println("Processing payment via Credit Card.");
     System.out.println("Amount: $" + amount + ", Fee: $" + fee + ", Total: $" + totalAmount);
 }
}

//Derived class PayPal
class PayPal extends PaymentMethod {
 // Implementing the processPayment method for PayPal
 @Override
 public void processPayment(double amount) {
     double fee = 0.03 * amount;  // 3% transaction fee for PayPal
     double totalAmount = amount + fee;
     System.out.println("Processing payment via PayPal.");
     System.out.println("Amount: $" + amount + ", Fee: $" + fee + ", Total: $" + totalAmount);
 }
}

//Main class to demonstrate polymorphism in payment processing
public class OnlinePaymentSystem {
 public static void processTransaction(PaymentMethod paymentMethod, double amount) {
     paymentMethod.processPayment(amount);  // Polymorphic call
 }

 public static void main(String[] args) {
     // Creating CreditCard and PayPal objects
     PaymentMethod creditCardPayment = new CreditCard();
     PaymentMethod payPalPayment = new PayPal();
     
     // Processing transactions
     System.out.println("Transaction 1 (Credit Card):");
     processTransaction(creditCardPayment, 100.0);
     
     System.out.println("\nTransaction 2 (PayPal):");
     processTransaction(payPalPayment, 200.0);
 }
}
