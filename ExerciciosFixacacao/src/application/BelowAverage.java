package application;

import java.util.Locale;
import java.util.Scanner;

public class BelowAverage {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int amountOfElements = scanner.nextInt();
        double[] numbers = new double[amountOfElements];
        double sum = 0;
        for (int i = 0; i < amountOfElements; i++) {
            System.out.print("Digite um numero: ");
            numbers[i] = scanner.nextDouble();
            sum += numbers[i];
        }

        double avg = sum / amountOfElements;

        System.out.printf("MEDIA DO VETOR = %.3f\n", avg);
        System.out.println("ELEMENTOS ABAIXO DA MEDIA");
        for (double number : numbers
        ) {
            if (number < avg) {
                System.out.printf("%.1f%n", number);
            }
        }

        scanner.close();
    }
}
