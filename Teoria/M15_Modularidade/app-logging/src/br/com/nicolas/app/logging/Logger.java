package br.com.nicolas.app.logging;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {

  public static void info(String msg) {
    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    LocalDateTime d01 = LocalDateTime.now();
    System.out.println("INFO: " + d01.format(fmt) + " - " + msg);
  }

}
