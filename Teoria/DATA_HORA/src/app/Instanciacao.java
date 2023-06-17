package app;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Instanciacao {
  public static void main(String[] args) {

    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

    LocalDate d01 = LocalDate.now();
    LocalDateTime d02 = LocalDateTime.now();
    Instant d03 = Instant.now();

    LocalDate d04 = LocalDate.parse("2023-06-12");
    LocalDateTime d05 = LocalDateTime.parse("2023-06-12T01:30:26");
    Instant d06 = Instant.parse("2023-06-13T01:30:26Z");
    Instant d07 = Instant.parse("2023-06-13T01:30:26-03:00");

    LocalDate d08 = LocalDate.parse("12/06/2023", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    LocalDateTime d09 = LocalDateTime.parse("12/06/2023 10:13", fmt);

    LocalDate d10 = LocalDate.of(2023, 06, 13);
    LocalDateTime d11 = LocalDateTime.of(2023, 06, 13, 10, 18);

    System.out.println(d01);
    System.out.println(d02);
    System.out.println(d03);
    System.out.println(d04);
    System.out.println(d05);
    System.out.println(d06);
    System.out.println(d07);
    System.out.println(d08);
    System.out.println(d09);
    System.out.println(d10);
    System.out.println(d11);
  }
}