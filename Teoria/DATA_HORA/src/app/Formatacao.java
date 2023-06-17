package app;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Formatacao {

  public static void main(String[] args) {

    LocalDate d01 = LocalDate.parse("2023-06-13");
    LocalDateTime d02 = LocalDateTime.parse("2023-06-13T01:30:26");
    Instant d03 = Instant.parse("2023-06-13T14:41:26Z");

    DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
    DateTimeFormatter fmt2 = DateTimeFormatter
        .ofPattern("dd/MM/yyy HH:mm")
        .withZone(ZoneId.systemDefault());
    DateTimeFormatter fmt3 = DateTimeFormatter.ISO_INSTANT;

    System.out.println("LocalDate: " + d01.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    System.out.println("LocalDateTime: " + d02.format(fmt1));
    System.out.println("Instant: " + fmt2.format(d03));
    System.out.println("Instant: " + fmt3.format(d03));
    System.out.println("Instant: " + d03);

  }
}
