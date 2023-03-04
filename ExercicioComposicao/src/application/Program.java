package application;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Enter department's name: ");
        String departmentName = scanner.nextLine();
        Department department = new Department(departmentName);
        System.out.println("Enter worker data: ");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.println(WorkerLevel.JUNIOR);
        System.out.println(WorkerLevel.MID_LEVEL);
        System.out.println(WorkerLevel.SENIOR);
        System.out.print("Level: ");
        WorkerLevel level = WorkerLevel.valueOf(scanner.nextLine());
        System.out.print("Base salary: ");
        double baseSalary = scanner.nextDouble();


        Worker worker = new Worker(name, level, baseSalary, department);

        System.out.print("How many contracts to this worker: ");
        int numContracts = scanner.nextInt();


        for (int i = 0; i < numContracts; i++) {
            scanner.nextLine();
            System.out.printf("Enter contract #%d data: \n", i + 1);
            System.out.print("Date (DD/MM/YYYY): ");
            String date = scanner.nextLine();
            LocalDate localDate = LocalDate.parse(date, formatter);
            System.out.print("Value per hour: ");
            double valuePerHour = scanner.nextDouble();
            System.out.print("Duration (hours): ");
            int durationInHours = scanner.nextInt();
            HourContract hourContract = new HourContract(localDate, valuePerHour, durationInHours);
            worker.addContract(hourContract);
        }
        scanner.nextLine();
        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String dateToSearch = scanner.nextLine();
        LocalDate localDateSearch = LocalDate.parse("01/" + dateToSearch, formatter);

        double income = worker.income(
                localDateSearch.getYear(),
                localDateSearch.getMonthValue()
        );
        System.out.printf("Name : %s\n" +
                        "Department: %s\n" +
                        "Income for %s: %.2f",
                worker.getName(),
                worker.getDepartment().getName(),
                dateToSearch,
                income
        );


        scanner.close();
    }
}
