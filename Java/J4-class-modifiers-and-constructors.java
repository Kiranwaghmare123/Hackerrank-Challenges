import java.util.Scanner;

class Employee {
    // Instance variables for employee details
    private String name;
    private int id;
    private String department;

    // Final and Static variables
    private static final String companyName = "GlobalTech";  // Company name remains the same for all employees
    private static int employeeCount = 0;  // Shared among all employees, keeps track of number of employees

    // Constructor to initialize employee details and increase employee count
    public Employee(String name, int id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
        employeeCount++;  // Increment employee count every time a new employee is created
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee Name: " + this.name);
        System.out.println("Employee ID: " + this.id);
        System.out.println("Department: " + this.department);
        System.out.println("Company Name: " + companyName);
    }

    // Static method to display total employee count
    public static void displayEmployeeCount() {
        System.out.println("Total Employees: " + employeeCount);
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read input for first employee
        String name1 = sc.nextLine();
        int id1 = sc.nextInt();
        sc.nextLine(); // To consume the newline character
        String department1 = sc.nextLine();

        // Create first employee object
        Employee emp1 = new Employee(name1, id1, department1);
        
        // Read input for second employee
        String name2 = sc.nextLine();
        int id2 = sc.nextInt();
        sc.nextLine(); // To consume the newline character
        String department2 = sc.nextLine();

        // Create second employee object
        Employee emp2 = new Employee(name2, id2, department2);

        // Display details of both employees
        emp1.displayDetails();
        emp2.displayDetails();

        // Display the total number of employees created
        Employee.displayEmployeeCount();

        // Close the scanner
        sc.close();
    }
}
