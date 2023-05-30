package Composicao.Muitos_pra_Muitos;

import java.util.ArrayList;

public class Aluno {

  String nome;
  final ArrayList<Curso> cursos = new ArrayList<>();

  Aluno(String nome) {
    this.nome = nome;
  }

  void addCurso(Curso curso) {
    this.cursos.add(curso);
  }

}
