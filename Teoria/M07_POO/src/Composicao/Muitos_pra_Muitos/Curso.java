package Composicao.Muitos_pra_Muitos;

import java.util.ArrayList;

public class Curso {

  String nome;
  final ArrayList<Aluno> alunos = new ArrayList<>();

  Curso(String nome) {
    this.nome = nome;
  }

  void addAluno(Aluno aluno) {
    this.alunos.add(aluno);
  }
}
