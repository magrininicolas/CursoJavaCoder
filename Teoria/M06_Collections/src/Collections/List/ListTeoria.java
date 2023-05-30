package Collections.List;

import java.util.ArrayList;
import java.util.List;

public class ListTeoria {

  public static void main(String[] args) {
    
    List<User> lista = new ArrayList<>();

    lista.add(new User("Nicolas"));
    lista.add(new User("Rodson"));
    lista.add(new User("Luzia"));
    lista.add(new User("Lucas"));

    System.out.println(lista.get(1));

    System.out.println(lista.remove(3));

    System.out.println(lista.contains(2));

    for(User u: lista) {
      System.out.println(u);
    }
  }

}
