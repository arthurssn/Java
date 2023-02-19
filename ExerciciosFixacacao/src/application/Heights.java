package application;

import entities.Person;

import java.util.Locale;
import java.util.Scanner;

public class Heights {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantas pessoas serao digitadas? ");
        int amountOfPeople = scanner.nextInt();
        Person[] people = new Person[amountOfPeople];
        double totalHeight = 0;
        int peopleUnder16YearsOld = 0;
        for (int i = 0; i < amountOfPeople; i++) {
            System.out.printf("Dados da %da pessoa: \n", i + 1);
            System.out.print("Nome: ");
            scanner.nextLine();
            String name = scanner.nextLine();
            System.out.print("Idade: ");
            int age = scanner.nextInt();
            System.out.print("Altura: ");
            double height = scanner.nextDouble();
            totalHeight += height;
            people[i] = new Person(name, age, height);
            if (age < 16) {
                peopleUnder16YearsOld++;
            }
        }
        double avg = totalHeight / amountOfPeople;
        System.out.printf("Altura média: %.2f\n", avg);

        double percentageOfPeopleUnder16 = (100 * peopleUnder16YearsOld) / (double) amountOfPeople;

        System.out.printf("Pessoas com menos de 16 anos: %.2f%% \n", percentageOfPeopleUnder16);
        for (Person person : people) {
            if (person.getAge() < 16) {
                System.out.println(person.getName());
            }
        }

        scanner.close();
    }
}
