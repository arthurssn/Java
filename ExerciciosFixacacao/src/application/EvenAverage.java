package application;

import java.util.Scanner;

public class EvenAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantos elementos vai ter o vetor? ");
        int vectorLength = scanner.nextInt();

        int[] numbers = new int[vectorLength];
        int amountOfEvenNumbers = 0;
        for (int i = 0; i < vectorLength; i++) {
            System.out.print("Digite um numero: ");
            numbers[i] = scanner.nextInt();
            if (numberIsEven(numbers[i])) {
                amountOfEvenNumbers++;
            }
        }
        int[] evenNumbers = new int[amountOfEvenNumbers];
        int sum = 0;
        for (int i = 0; i < amountOfEvenNumbers; i++) {
            if (numberIsEven(numbers[i])) {
                evenNumbers[i] = numbers[i];
                sum += evenNumbers[i];
            }
        }

        if (evenNumbers.length == 0) {
            System.out.println("NENHUM NUMERO PAR");
        } else {
            double avg = (double) sum / amountOfEvenNumbers;
            System.out.printf("MEDIA DOS PARES = %.1f", avg);
        }

        scanner.close();
    }

    public static boolean numberIsEven(int number) {
        return (number % 2) == 0;
    }
}
