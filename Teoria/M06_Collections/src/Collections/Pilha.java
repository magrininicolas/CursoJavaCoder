package Collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
  
  public static void main(String[] args) {

    Deque<String> livros = new ArrayDeque<>();

    livros.push("O Hobbit");
    livros.push("Senhor dos Anéis");
    livros.push("Diário de um Banana");

    System.out.println(livros.peek());
    System.err.println(livros.element());

    System.out.println(livros.pop());
    System.out.println(livros.poll());
    System.out.println(livros.pop());

  }
}
