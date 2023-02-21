package application;

import java.util.Scanner;

public class ExerciseTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter row quantity: ");
        int rows = scanner.nextInt();
        System.out.print("Enter column quantity: ");
        int columns = scanner.nextInt();

        int[][] matrix = new int[rows][columns];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = i * j;
            }
        }

        for (int[] matrixRow : matrix) {
            for (int matrixColumn : matrixRow) {
                System.out.print(matrixColumn + " ");
            }
            System.out.println();
        }


        System.out.print("Enter the number to search for nearby numbers: ");
        int numberToSearch = scanner.nextInt();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == numberToSearch) {
                    System.out.printf("Posicao: %d, %d", i + 1, j + 1);
                    if (j - 1 < 0) {
                        System.out.println("Nao ha numero na esquerda");
                    } else {
                        System.out.printf("\nnumero da esquerda = %d\n", matrix[i][j - 1]);
                    }
                    if (i - 1 < 0) {
                        System.out.println("Nao ha numero em cima");
                    } else {
                        System.out.printf("numero de cima = %d\n", matrix[i - 1][j]);
                    }
                    if (j + 1 >= matrix[i].length) {
                        System.out.println("Nao ha numero na direita");
                    } else {
                        System.out.printf("numero da direita = %d\n", matrix[i][j + 1]);
                    }
                    if (i + 1 >= matrix.length) {
                        System.out.println("Nao ha numero em baixo");
                    } else {
                        System.out.printf("numero de baixo = %d\n", matrix[i + 1][j]);
                    }
                }
            }
        }

        scanner.close();
    }
}
