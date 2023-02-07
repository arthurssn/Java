package application;

import util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double dollarPrice = scanner.nextDouble();

        System.out.print("How many dollars will be bought? ");
        double howManyDollars = scanner.nextDouble();

        System.out.printf("Amount to be paid in real = %.2f ",
                CurrencyConverter.amountToBePaidInReal(dollarPrice, howManyDollars)
        );
    }
}
