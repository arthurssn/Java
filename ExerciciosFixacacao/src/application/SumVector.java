package application;

import java.util.Locale;
import java.util.Scanner;

public class SumVector {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantos numeros você vai digitar? ");
        int amountOfNumbers = scanner.nextInt();
        double[] numbers = new double[amountOfNumbers];
        for (int i = 0; i < amountOfNumbers; i++) {
            System.out.print("Digite um número: ");
            numbers[i] = scanner.nextDouble();
        }
        double sum = 0;
        System.out.print("\nVALORES = ");
        for (double number : numbers) {
            System.out.print(number + " ");
            sum += number;
        }
        double avg = sum / amountOfNumbers;
        System.out.printf("\nSOMA = %.2f", sum);
        System.out.printf("\nMEDIA = %.2f", avg);

        scanner.close();
    }
}
