package Reduce;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce03 {
  public static void main(String[] args) {

    Aluno a1 = new Aluno("Ana", 7.1);
    Aluno a2 = new Aluno("Luna", 6.1);
    Aluno a3 = new Aluno("Gui", 8.1);
    Aluno a4 = new Aluno("Gabi", 10);

    List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);

    Predicate<Aluno> aprovado = a -> a.grade >= 7;
    Function<Aluno, Double> getGrade = a -> a.grade;
    BiFunction<Media, Double, Media> notaAlunos = (media, grade) -> {
      media.add(grade);
      return media;
    };
    BinaryOperator<Media> combinarNotas = (m1, m2) -> Media.combine(m1, m2);

    Media media = alunos.stream()
        .filter(aprovado)
        .map(getGrade) 
        .reduce(new Media(), notaAlunos, combinarNotas);

    System.out.println("A média da turma é: " + media.calculaMedia());
  }
}
