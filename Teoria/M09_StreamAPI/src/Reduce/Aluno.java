package Reduce;

public class Aluno {

  final String name;
  final double grade;
  final boolean bomComportamento;

  public Aluno(String name, double grade) {
    this(name, grade, true);
  }

  public Aluno(String name, double grade, boolean bomComportamento) {
    this.name = name;
    this.grade = grade;
    this.bomComportamento = bomComportamento;
  }

  
}
