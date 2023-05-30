package Equals;

public class Equals {
  
  public static void main(String[] args) {
    
    Usuario u1 = new Usuario();
    u1.name = "Nicolas Gustavo";
    u1.email = "magrininicolas@outlook.com";
    
    Usuario u2 = new Usuario();
    u2.name = "Nicolas Gustavo";
    u2.email = "magrininicolas@outlook.com";

    System.out.println(u1 == u2);
    System.out.println(u1.equals(u2));
    System.out.println(u2.equals(u1));

  }
}
