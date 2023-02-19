package application;

import java.util.Locale;
import java.util.Scanner;

public class EvenAverage {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantos elementos vai ter o vetor? ");
        int vectorLength = scanner.nextInt();

        int[] numbers = new int[vectorLength];
        int amountOfEvenNumbers = 0;
        int sum = 0;
        for (int i = 0; i < vectorLength; i++) {
            System.out.print("Digite um numero: ");
            numbers[i] = scanner.nextInt();
            if (numberIsEven(numbers[i])) {
                amountOfEvenNumbers++;
                sum += numbers[i];
            }
        }

        double avg = (double) sum / (double) amountOfEvenNumbers;
        if (amountOfEvenNumbers == 0) {
            System.out.println("NENHUM NUMERO PAR");
        } else {
            System.out.printf("MEDIA DOS PARES = %.1f", avg);
        }
        scanner.close();
    }

    public static boolean numberIsEven(int number) {
        return (number % 2) == 0;
    }
}
