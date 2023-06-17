package app;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class GlobalToLocal {
  public static void main(String[] args) {
    
    LocalDateTime d02 = LocalDateTime.parse("2023-06-13T11:50");
    Instant d03 = Instant.parse("2023-06-13T11:50:27Z");

    LocalDateTime r1 = LocalDateTime.ofInstant(d03, ZoneId.systemDefault());
    LocalDateTime r2 = LocalDateTime.ofInstant(d03, ZoneId.of("Portugal"));

    System.out.println("R1: " + r1);
    System.out.println("R2: " + r2);

    System.out.println("D02 dia: " + d02.getDayOfMonth());
    System.out.println("D02 mês: " + d02.getMonthValue());
    System.out.println("D02 ano: " + d02.getYear());
    System.out.println("D02 mês extenso: " + d02.getMonth());

  }
}
