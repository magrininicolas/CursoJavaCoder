package Array;

import java.util.Locale;
import java.util.Scanner;

public class Array {
  public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.print("Quantas notas você vai digitar? ");
    int n = sc.nextInt();
    double[] notas = new double[n];

    for (int i = 0; i < notas.length; i++) {
      System.out.printf("Digite a nota %d: ", i + 1);
      notas[i] = sc.nextDouble();
    }

    double total = 0;
    for (double nota : notas) {
      total += nota;
    }

    double media = total / notas.length;
    System.out.println(String.format("Média do aluno: %.2f", media));

    sc.close();
  }
}
