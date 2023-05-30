package Collections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
  
  public static void main(String[] args) {
    
    Queue<String> fila = new LinkedList<>();
    
    
    fila.add("Nicolas"); // faz uma excecao caso a fila esteja cheia
    fila.offer("Rodson"); // retorna false caso a fila esteja cheia
    fila.add("Luzia");
    fila.offer("Lucas");


    // Peek e element tem a mesma funcao (obter o proximo elemento da fila sem remove-lo)
    System.out.println(fila.peek()); //retorna null caso a fila esteja vazia
    System.out.println(fila.element()); //faz uma excecao caso a fila esteja vazia
    
    // Pool e remove (obter o proximo elemento removendo-o)
    System.out.println(fila.poll()); // retorna null
    System.out.println(fila.remove()); // lanca excecao
  }
}
