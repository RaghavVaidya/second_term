package models;
import java.util.Arrays;

// Order class representing an order made by a user
public class Order {
    String fullName;
    String phoneNumber;
    int[] items;
    TShirt[] tShirts;

    // Constructor to initialize fields
    public Order(String fullName, String phoneNumber, int[] items, TShirt[] tShirts) {
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.items = items;
        this.tShirts = tShirts;
    }

    // Getters and setters
    // Add getters and setters for fields as appropriate


    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int[] getItems() {
        return items;
    }

    public void setItems(int[] items) {
        this.items = items;
    }

    public TShirt[] gettShirts() {
        return tShirts;
    }

    public void settShirts(TShirt[] tShirts) {
        this.tShirts = tShirts;
    }

    // Method to print the bill with VAT and total price
    public void printBill() {
        double totalPrice = 0;
        for (int i = 0; i < items.length; i++) {
            totalPrice += tShirts[i].getPrice();
        }
        double vat = totalPrice * 0.13; // VAT calculation

        System.out.println("Order details:");
        System.out.println("Name: " + fullName);
        System.out.println("Phone number: " + phoneNumber);
        System.out.println("Items: " + Arrays.toString(items));
        System.out.println("Total Price (excluding VAT): " + totalPrice);
        System.out.println("VAT (13%): " + vat);
        System.out.println("Total Price (including VAT): " + (totalPrice + vat));
    }
}
