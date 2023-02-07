package application;

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class EmployeeProgram {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Employee employee = new Employee();
        System.out.println("Enter the employee data: ");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name: ");
        employee.name = scanner.nextLine();
        System.out.print("Gross salary: ");
        employee.grossSalary = scanner.nextDouble();
        System.out.print("Tax: ");
        employee.tax = scanner.nextDouble();

        System.out.println("\nEmployee: " + employee);

        System.out.print("Which percentage to increase salary? ");
        double increaseSalary = scanner.nextDouble();
        employee.increaseSalary(increaseSalary);

        System.out.print("\nUpdated data: " + employee);
        scanner.close();
    }
}
