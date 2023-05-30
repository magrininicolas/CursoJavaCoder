package Basico;

public class Aluno {
  
  public String name;
  public double grade;

  public Aluno(String name, double grade) {
    this.name = name;
    this.grade = grade;
  }

  @Override
  public String toString() {
    return name + " tem nota " + grade;
  }
}
