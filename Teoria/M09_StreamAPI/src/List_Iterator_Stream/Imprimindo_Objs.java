package List_Iterator_Stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class Imprimindo_Objs {
  public static void main(String[] args) {
    
    List<String> aprovados = Arrays.asList("Lu", "Gui", "Luca", "Ana");

    System.out.println("Usando ForEach");
    for(String nome: aprovados) {
      System.out.println(nome);
    }

    System.out.println("\nUsando Iterator");
    Iterator<String> it = aprovados.iterator();
    while(it.hasNext()) {
      System.out.println(it.next());
    }

    System.out.println("\nUsando Streams");
    Stream<String> st = aprovados.stream();
    st.forEach(System.out::println);
  }
}
