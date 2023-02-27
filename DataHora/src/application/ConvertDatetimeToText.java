package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class ConvertDatetimeToText {
    public static void main(String[] args) {
        LocalDate d04 = LocalDate.parse("2023-02-26");
        LocalDateTime d05 = LocalDateTime.parse("2023-02-26T01:30:00");
        Instant d06 = Instant.parse("2023-02-26T01:30:00Z");


        DateTimeFormatter fmt1 = DateTimeFormatter
                .ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter
                .ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt3 = DateTimeFormatter
                .ofPattern("dd/MM/yyyy HH:mm")
                .withZone(ZoneId.systemDefault());
        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;

        System.out.println("d04 = " + fmt1.format(d04));
        System.out.println("d05 = " + fmt2.format(d05));
        System.out.println("d05 = " + fmt4.format(d05));
        System.out.println("d06 = " + fmt3.format(d06));

    }
}
