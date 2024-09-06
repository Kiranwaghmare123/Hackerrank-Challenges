import java.util.Scanner;

class Cake {
    // Instance variables for cake name, weight, and price per gram
    private String name;
    private int weight;
    private double pricePerGram;

    // Constructor to initialize the cake details
    public Cake(String name, int weight, double pricePerGram) {
        this.name = name;
        this.weight = weight;
        this.pricePerGram = pricePerGram;
    }

    // Method to calculate the total price
    public double calculateTotalPrice() {
        return weight * pricePerGram;
    }

    // Method to display cake details
    public void displayDetails() {
        System.out.println("Cake Name: " + name);
        System.out.println("Weight: " + weight + " grams");
        System.out.printf("Total Price: %.2f%n", calculateTotalPrice());
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the cake details
        String name = sc.nextLine();
        int weight = sc.nextInt();
        double pricePerGram = sc.nextDouble();

        // Create a Cake object
        Cake cake = new Cake(name, weight, pricePerGram);

        // Display the cake details
        cake.displayDetails();

        // Close the scanner
        sc.close();
    }
}
