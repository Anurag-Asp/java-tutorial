// Employee.java (Class definition)
class Employee {
    // Fields of the Employee class
    private int eid;       // Employee ID
    private String name;   // Employee Name
    private double salary; // Employee Salary

    // Constructor to initialize the fields
    public Employee(int eid, String name, double salary) {
        this.eid = eid;
        this.name = name;
        this.salary = salary;
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + eid);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: $" + salary);
    }
}

public class EmployeeMain {
    public static void main(String[] args) {
        Employee emp = new Employee(101, "John Doe", 50000.0);

        System.out.println("Employee Details:");
        emp.displayEmployeeDetails();
    }
}