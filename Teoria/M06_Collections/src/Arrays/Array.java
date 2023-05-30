package Arrays;

import java.util.Arrays;

public class Array {
  public static void main(String[] args) {

    double[] notasAlunoA = new double[4];

    
    notasAlunoA[0] = 7.9;
    notasAlunoA[1] = 8;
    notasAlunoA[2] = 6.7;
    notasAlunoA[3] = 9.7;

    double total = 0;
    for(int i = 0; i < notasAlunoA.length; i++){
      total += notasAlunoA[i];
    }

    System.out.println(total/notasAlunoA.length);

    double[] notasAlunoB = { 6.9, 8.9, 5.5, 10 };
    total = 0;
    for(int i = 0; i < notasAlunoB.length; i++){
      total += notasAlunoB[i];
    }

    System.out.println(total/notasAlunoB.length);
  }
}
