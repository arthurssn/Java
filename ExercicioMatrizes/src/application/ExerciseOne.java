package application;

import java.util.Scanner;

public class ExerciseOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int matrixLength = scanner.nextInt();
        int[][] matrix = new int[matrixLength][matrixLength];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        for (int[] matrixRow : matrix) {
            for (int matrixColumn : matrixRow) {
                System.out.print(matrixColumn + " ");
            }
            System.out.println();
        }
        System.out.println("Main diagonal: ");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][i] + " ");
        }
        int negativeCount = 0;
        for (int[] matrixRow : matrix) {
            for (int matrixColumn : matrixRow) {
                if (matrixColumn < 0) negativeCount++;
            }
        }
        System.out.println("\nNegative numbers = " + negativeCount);

        scanner.close();
    }
}
