package application;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class StudentProgram {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Student student = new Student();
        Scanner scanner = new Scanner(System.in);

        student.firstQuarterNote = scanner.nextDouble();
        student.secondQuarterNote = scanner.nextDouble();
        student.thirdQuarterNote = scanner.nextDouble();

        System.out.println(student.returnStudentStatus());

        scanner.close();
    }

}
