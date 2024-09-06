import java.util.Scanner;

class Student {
    // Instance variables for student's name, age, and marks
    private String name;
    private int age;
    private int mark1, mark2, mark3;

    // Constructor to initialize the student details
    public Student(String name, int age, int mark1, int mark2, int mark3) {
        this.name = name;
        this.age = age;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    // Method to calculate the average of the three marks
    public double calculateAverage() {
        return (mark1 + mark2 + mark3) / 3.0;
    }

    // Method to determine if the student has passed or failed
    public String getResult() {
        double average = calculateAverage();
        return average >= 40 ? "Pass" : "Fail";
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Average Marks: " + calculateAverage());
        System.out.println("Result: " + getResult());
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the student's name, age, and marks
        String name = sc.nextLine();
        int age = sc.nextInt();
        int mark1 = sc.nextInt();
        int mark2 = sc.nextInt();
        int mark3 = sc.nextInt();

        // Create a Student object
        Student student = new Student(name, age, mark1, mark2, mark3);

        // Display the student's details
        student.displayDetails();

        // Close the scanner
        sc.close();
    }
}
