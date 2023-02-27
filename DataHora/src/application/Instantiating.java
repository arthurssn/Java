package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Instantiating {
    public static void main(String[] args) {

        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();
        LocalDate d04 = LocalDate.parse("2023-02-26");
        LocalDateTime d05 = LocalDateTime.parse("2023-02-26T17:46:19.702257");
        Instant d06 = Instant.parse("2023-02-26T20:46:19.702296Z");
        LocalDate d07 = LocalDate.parse("26/02/2023",
                DateTimeFormatter.ofPattern("dd/MM/yyyy")
        );
        LocalDateTime d08 = LocalDateTime.parse("26/02/2023 01:30",
                DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")
        );
        LocalDate d09 = LocalDate.of(2023, 2, 26);
        LocalDateTime d10 = LocalDateTime.of(2023, 2, 26, 18, 4, 10);
        System.out.println("d01 = " + d01);
        System.out.println("d02 = " + d02);
        System.out.println("d03 = " + d03.toString());
        System.out.println("d04 = " + d04.toString());
        System.out.println("d05 = " + d05);
        System.out.println("d06 = " + d06.toString());
        System.out.println("d07 = " + d07.toString());
        System.out.println("d08 = " + d08);
        System.out.println("d09 = " + d09);
        System.out.println("d10 = " + d10);
    }
}
