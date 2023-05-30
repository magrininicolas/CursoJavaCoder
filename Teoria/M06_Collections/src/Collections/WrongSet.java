package Collections;

import java.util.HashSet;

public class WrongSet {
  
  @SuppressWarnings({"rawtypes", "unchecked"})
  
  public static void main(String[] args) {
    
    HashSet conjunto = new HashSet();

    conjunto.add(1.2);
    conjunto.add(true);
    conjunto.add("Teste");
    conjunto.add(1);
    conjunto.add('x');

    System.out.println("Tamanho: " + conjunto.size());

    HashSet nums = new HashSet();

    nums.add(1);
    nums.add(2);
    nums.add(3);

    System.out.println(nums);
    System.out.println(conjunto);

    /* conjunto.addAll(nums);
    System.out.println(conjunto); União */
    
    /* conjunto.retainAll(nums);
    System.out.println(conjunto); Interseccao */


  }
}
