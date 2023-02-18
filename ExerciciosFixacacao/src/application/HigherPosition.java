package application;

import java.util.Locale;
import java.util.Scanner;

public class HigherPosition {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantos numeros voce vai digitar? ");
        int amountOfNumbers = scanner.nextInt();
        double[] numbers = new double[amountOfNumbers];
        for (int i = 0; i < amountOfNumbers; i++) {
            System.out.print("Digite um numero: ");
            numbers[i] = scanner.nextFloat();
        }

        double higherNumber = numbers[0];
        int highestValuePosition = 0;
        for (int i = 0; i < amountOfNumbers; i++) {
            if (i != 0 && numbers[i] > higherNumber) {
                higherNumber = numbers[i];
                highestValuePosition = i;
            }
        }

        System.out.printf("\nMAIOR VALOR = %f\n", higherNumber);
        System.out.printf("POSICAO DO MAIOR VALOR = %d", highestValuePosition);

        scanner.close();
    }
}
