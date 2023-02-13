package application;

import java.util.Locale;
import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of people: ");
        int peopleQuantity = scanner.nextInt();

        double[] peopleHeight = new double[peopleQuantity];

        double sumHeight = 0.0;

        for (int i = 0; i < peopleQuantity; i++) {
            System.out.printf("Enter height of person %d: ", i + 1);
            peopleHeight[i] = scanner.nextDouble();
        }

        for (double height : peopleHeight) {
            sumHeight += height;
        }

        double averageHeight = sumHeight / peopleQuantity;
        System.out.printf("Average: %.2f" + averageHeight);

    }
}
