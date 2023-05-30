package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

  public static void main(String[] args) {

    Map<Integer, String> users = new HashMap<>();
    users.put(1, "Nicolas");
    users.put(2, "Rodson");
    users.put(3, "Luzia");
    users.put(4, "Lucas");

    System.out.println(users.size());

    System.out.println(users.keySet());
    System.out.println(users.values());
    System.out.println(users.entrySet());

    System.out.println(users.containsKey(3));
    System.out.println(users.containsValue("Nicolas"));

    System.out.println(users.get(4));

    for(int chave: users.keySet()) {
      System.out.println(chave);
    }

    for(Entry<Integer, String> registro: users.entrySet()) {
      System.out.print(registro.getKey() + " ===> ");
      System.out.println(registro.getValue());
    }
    
  }
}
