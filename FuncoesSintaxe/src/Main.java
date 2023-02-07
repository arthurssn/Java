import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();


        int higher = max(a, b, c);
        showResult(higher);
    }

    public static int max(int number1, int number2, int number3) {
        if (number1 >= number2 && number1 >= number3) {
            return number1;
        }
        if (number2 >= number1 && number2 >= number3) {
            return number2;
        }
        return number3;
    }

    public static void showResult(int higherValue) {
        System.out.println("THE HIGHER VALUE IS: " + higherValue);
    }
}