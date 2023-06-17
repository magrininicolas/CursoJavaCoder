package app;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CalculoHora {
  public static void main(String[] args) {
    
    LocalDate d01 = LocalDate.parse("2023-06-13");
    LocalDateTime d02 = LocalDateTime.parse("2023-06-13T13:35");
    Instant d03 = Instant.parse("2023-06-13T13:35:30Z");

    LocalDate pastWeekLocalDate = d01.minusDays(7);
    LocalDate nextWeekLocalDate = d01.plusDays(7);
    
    LocalDateTime pastWeekLocalDateTime = d02.minusDays(7);
    LocalDateTime nextWeekLocalDateTime = d02.plusDays(7);

    Instant pastWeekInstant = d03.minus(7, ChronoUnit.DAYS);
    Instant nextWeekInstant = d03.plus(7, ChronoUnit.DAYS);

    Duration d1 = Duration.between(pastWeekLocalDateTime, d02);

    System.out.println("Past Week LocalDate: " + pastWeekLocalDate);
    System.out.println("Next Week LocalDate: " + nextWeekLocalDate);
    System.out.println("Past Week LocalDateTime: " + pastWeekLocalDateTime);
    System.out.println("Next Week LocalDateTime: " + nextWeekLocalDateTime);
    System.out.println("Past Week Instant: " + pastWeekInstant);
    System.out.println("Next Week Instant: " + nextWeekInstant);
    System.out.println(d1.toDays());

  }
}
