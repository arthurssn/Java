package application;

import entitites.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many employees will be registered? ");
        int quantityEmployees = scanner.nextInt();
        List<Employee> employees = new ArrayList<>();
        for (int i = 0; i < quantityEmployees; i++) {
            System.out.printf("Employee #%d\n", i + 1);
            System.out.print("Id: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Salary: ");
            double salary = scanner.nextDouble();
            employees.add(new Employee(id, name, salary));
        }
        System.out.print("Enter the employee id that will have salary increase: ");
        int idEmployeeToIncrease = scanner.nextInt();

        Employee employeeToIncreaseSalary = employees.stream()
                .filter(employee -> employee.getId() == idEmployeeToIncrease)
                .findFirst()
                .orElse(null);

        if (employeeToIncreaseSalary != null) {
            System.out.print("Enter the percentage: ");
            double percentageToIncrease = scanner.nextDouble();
            employeeToIncreaseSalary.increaseSalary(percentageToIncrease);
        } else {
            System.out.println("This id does not exist!");
        }
        System.out.println("List of employees:");
        for (Employee employee : employees) {
            System.out.printf("%d, %s, %.2f\n", employee.getId(), employee.getName(), employee.getSalary());
        }

        scanner.close();
    }
}
