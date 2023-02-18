package application;

import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantos numeros voce vai digitar? ");
        int amountOfNumbers = scanner.nextInt();
        int[] numbers = new int[amountOfNumbers];
        for (int i = 0; i < amountOfNumbers; i++) {
            System.out.print("Digite um numero: ");
            numbers[i] = scanner.nextInt();
        }
        int amountOfPairNumbers = 0;
        System.out.println("NUMEROS PARES: ");
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.print(number + " ");
                amountOfPairNumbers++;
            }
        }
        System.out.printf("QUANTIDADE DE PARES = %d", amountOfPairNumbers);

        scanner.close();
    }
}
