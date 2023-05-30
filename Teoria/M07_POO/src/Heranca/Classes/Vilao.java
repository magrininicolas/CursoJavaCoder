package Heranca.Classes;

import Heranca.Enums.Ataque;

public class Vilao extends Jogador {
  
  public Vilao(int x, int y) {
    super(x, y);
  }
  
  public boolean atacar(Jogador oponente, Ataque tipo) {
    if(tipo == Ataque.RAPIDO && super.atacar(oponente)) {
      oponente.vida += 5;
      return true;
    } else if (tipo == Ataque.FORTE && super.atacar(oponente)){
      oponente.vida -= 15;
      return true;
    }
    return false;
  }
}
