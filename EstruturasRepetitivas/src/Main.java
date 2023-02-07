import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int soma = 0;
        while (x != 0) {
            x = scanner.nextInt();
            soma += x;
        }

        scanner.close();
        System.out.printf("A soma dos números é: %d", soma);
    }
}