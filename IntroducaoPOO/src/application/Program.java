package application;

import entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Triangle x, y;

        x = new Triangle();
        y = new Triangle();

        System.out.println("Enter the measures of triangle X: \n");
        x.a = scanner.nextDouble();
        x.b = scanner.nextDouble();
        x.c = scanner.nextDouble();

        System.out.println("Enter the measures of triangle Y: \n");
        y.a = scanner.nextDouble();
        y.b = scanner.nextDouble();
        y.c = scanner.nextDouble();

        scanner.close();
        
        System.out.println("TRIANGLE AREA X: " + x.triangleArea());
        System.out.println("TRIANGLE AREA Y: " + y.triangleArea());
    }
}
