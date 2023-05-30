package Chave_Valor_Generics;

public class ParesTeste{
  public static void main(String[] args) {
    
    Pares<Integer, String> resultadoConcurso = new Pares<>();

    resultadoConcurso.add(1, "Maria");
    resultadoConcurso.add(2, "Pedro");
    resultadoConcurso.add(3, "Gui");
    resultadoConcurso.add(4, "Ana");
    resultadoConcurso.add(2, "Rebeca");

    System.out.println(resultadoConcurso.getValor(1));
    System.out.println(resultadoConcurso.getValor(4));
    System.out.println(resultadoConcurso.getValor(2));
  }
}
