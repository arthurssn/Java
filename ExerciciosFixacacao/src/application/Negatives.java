package application;

import java.util.Scanner;

public class Negatives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int number = scanner.nextInt();
        int[] numbers = new int[number];
        for (int i = 0; i < number; i++) {
            System.out.print("Enter a integer number: ");
            numbers[i] = scanner.nextInt();
        }
        System.out.println("Negative numbers: ");
        for (int num : numbers
        ) {
            if (num < 0) {
                System.out.println(num);
            }
        }

    }
}
