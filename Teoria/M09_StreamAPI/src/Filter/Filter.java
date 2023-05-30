package Filter;

import java.util.Arrays;
import java.util.List;

public class Filter {
  public static void main(String[] args) {

    Aluno a1 = new Aluno("Ana", 7.8);
    Aluno a2 = new Aluno("Bia", 5.8);
    Aluno a3 = new Aluno("Daniel", 8.8);
    Aluno a4 = new Aluno("Gui", 9.8);
    Aluno a5 = new Aluno("Rebeca", 6.8);
    Aluno a6 = new Aluno("Pedro", 7.1);

    List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);

    alunos.stream()
        .filter(a -> a.grade >= 7.0)
        .map(a -> String.format("Parabéns, %s! Você foi aprovado(a)!", a.name))
        .forEach(System.out::println);
  }
}
