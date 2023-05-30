package Checado_VS_NChecado;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class App {
  public static void main(String[] args) {
    try {
      geraErro01();
    } catch (RuntimeException e) {
      System.out.println(e.getMessage());
    }
    try {
      geraErro02();
    } catch (Throwable e) {
      System.out.println(e.getMessage());
    }
    
    readFile("myFile.txt");

    printLength(null);


    System.out.println("Fim");
  }

  static void geraErro01() {
    throw new RuntimeException("Ocorreu um erro #01");
  }

  static void geraErro02() throws Exception {
    throw new Exception("Ocorreu um erro #02");
  }

  static void readFile(String fileName) {
    try {
      FileReader reader = new FileReader(fileName);
    } catch (FileNotFoundException e) {
      System.out.printf("Vai rodar não, fio, ó o erro ae: %s\n", e.getMessage());
    }
  }

  static void printLength(String myString) {
    try{
      System.out.println(myString.length());
    } catch (NullPointerException e) {
      System.out.println("A string não pode ser nula");
    }
  }
}
