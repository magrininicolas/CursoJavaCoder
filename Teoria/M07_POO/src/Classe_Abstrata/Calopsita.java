package Classe_Abstrata;

public class Calopsita extends Ave {
  
  @Override
  public String alimentacao() {
    return "Come sementes, frutas e insetos";
  }

  @Override
  public String mover() {
    return "Usando as asas";
  }
}
