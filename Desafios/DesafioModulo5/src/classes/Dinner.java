package classes;

public class Dinner {

  public static void main(String[] args) {
    
    Food f1 = new Food("Frango", 0.25);
    Food f2 = new Food("Pizza", 0.5);

    Person p1 = new Person("Nicolas", 100.5);
    System.out.println(p1);
    p1.Eat(f1);
    System.out.println(p1);
    p1.Eat(f2);
    System.out.println(p1);
  }
}
