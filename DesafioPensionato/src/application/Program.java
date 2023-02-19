package application;

import entities.Bedroom;
import entities.Client;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Bedroom[] boardingHouse = new Bedroom[10];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < boardingHouse.length; i++) {
            boardingHouse[i] = new Bedroom(i);
        }

        System.out.print("Quantos estudantes irao alugar quartos? ");
        int quantityClient = scanner.nextInt();
        int i = 0;
        while (i < quantityClient) {
            System.out.printf("#%d%n", (i + 1));
            System.out.print("Qual quarto deseja alugar? ");
            int numBedroom = scanner.nextInt();
            if (numBedroom > 9 || numBedroom < 0) {
                System.out.println("Quarto inexistente");
            } else {
                Bedroom roomNumber = boardingHouse[numBedroom];
                if (!roomNumber.isAvailable()) {
                    System.out.println("Quarto indisponivel");
                } else {
                    scanner.nextLine();
                    System.out.print("Informe seu nome: ");
                    String name = scanner.nextLine();
                    System.out.print("Informe seu email: ");
                    String email = scanner.nextLine();
                    Client client = new Client(name, email);
                    roomNumber.rentRoom(client);
                    i++;
                }
            }
        }
        System.out.println("Quartos alugados: ");
        for (Bedroom bedroom : boardingHouse) {
            if (!bedroom.isAvailable()) {
                System.out.printf("Quarto %d alugado por: %s, %s\n",
                        bedroom.getNumBedroom(),
                        bedroom.getClient().getName(),
                        bedroom.getClient().getEmail()
                );
            }
        }

        scanner.close();
    }
}
