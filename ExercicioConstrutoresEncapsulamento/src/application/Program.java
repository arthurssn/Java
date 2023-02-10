package application;

import entities.Account;
import entities.Holder;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter account number: ");
        String accNumber = scanner.next();
        scanner.nextLine();
        System.out.print("Enter account holder: ");
        String accHolder = scanner.nextLine();
        Holder holder = new Holder(accHolder);

        System.out.print("Is there na initial deposit (y\\n)? ");
        char isThereNaInitialDeposit = scanner.next().charAt(0);
        Account account = new Account(holder, accNumber);
        if (selectedOptionIsValid(isThereNaInitialDeposit) && isThereNaInitialDeposit == 'y') {
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = scanner.nextDouble();
            account.depositMoney(initialDeposit);
        }

        System.out.println("\nAccount data:");
        System.out.print(account);

        System.out.print("\n\nEnter a deposit value: ");
        double amountToDeposit = scanner.nextDouble();
        account.depositMoney(amountToDeposit);
        System.out.println("\nUpdated account data:");
        System.out.print(account);

        System.out.print("\n\nEnter a withdraw value: ");
        double amountToWithdraw = scanner.nextDouble();
        account.withdrawMoney(amountToWithdraw);
        System.out.println("\nUpdated account data:");
        System.out.print(account);

        /*
         *  o exemplo diz que será permitido alterar o nome do titular:
         *  owner.setName("novo nome");
         */

        scanner.close();
    }

    public static boolean selectedOptionIsValid(char option) {

        return option == 'y' || option == 'n';
    }
}
