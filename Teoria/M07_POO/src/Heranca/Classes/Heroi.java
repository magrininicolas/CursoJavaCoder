package Heranca.Classes;

import Heranca.Enums.Ataque;

public class Heroi extends Jogador {

  public Heroi(int x, int y) {
    super(x, y);
  }

  public boolean atacar(Jogador oponente, Ataque tipo) {
    if(tipo == Ataque.FORTE && super.atacar(oponente)) {
      oponente.vida -= 15;
      return true;
    } else if (tipo == Ataque.NORMAL){
      super.atacar(oponente);
      return true;
    }
    return false;
  }
}
