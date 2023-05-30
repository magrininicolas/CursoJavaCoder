package classes;

public class Person {

  String name;
  double weight;

  Person(String name, double weight) {
    this.name = name;
    this.weight = weight;
  }

  void Eat(Food food) {
    if (food != null) {
      weight += food.calories;
    }
  }

  @Override
  public String toString() {
    return "Hi, my name is " + this.name + " and my weight is " + this.weight;
  }
}
