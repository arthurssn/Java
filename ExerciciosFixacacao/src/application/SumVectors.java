package application;

import java.util.Scanner;

public class SumVectors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos valores vai ter cada vetor? ");
        int vectorsLength = scanner.nextInt();

        int[] vectorA = new int[vectorsLength];
        int[] vectorB = new int[vectorsLength];
        int[] vectorC = new int[vectorsLength];

        System.out.println("Digite os valores do vetor A");

        for (int i = 0; i < vectorsLength; i++) {
            vectorA[i] = scanner.nextInt();
        }

        System.out.println("Digite os valores do vetor A");

        for (int j = 0; j < vectorsLength; j++) {
            vectorB[j] = scanner.nextInt();
        }


        for (int i = 0; i < vectorsLength; i++) {
            vectorC[i] = vectorA[i] + vectorB[i];
        }

        System.out.println("VETOR RESULTANTE");
        for (int number : vectorC
        ) {
            System.out.println(number);
        }

        scanner.close();
    }

}
