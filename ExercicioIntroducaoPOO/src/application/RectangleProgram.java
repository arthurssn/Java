package application;

import entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class RectangleProgram {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Rectangle rectangle = new Rectangle();

        System.out.println("Enter the measures of rectangle: ");

        Scanner scanner = new Scanner(System.in);

        rectangle.height = scanner.nextDouble();

        rectangle.width = scanner.nextDouble();
        scanner.close();
        System.out.println(rectangle);
    }
}
