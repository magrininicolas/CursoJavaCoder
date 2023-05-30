package Heranca.Teste;

import Heranca.Classes.Heroi;
import Heranca.Classes.Vilao;
import Heranca.Enums.Ataque;

public class Jogo{
  public static void main(String[] args) {
    
    Heroi heroi = new Heroi(10, 11);

    Vilao vilao = new Vilao(10, 10);

    heroi.atacar(vilao, Ataque.NORMAL);
    vilao.atacar(heroi, Ataque.RAPIDO);
    System.out.println(vilao.vida);
    System.out.println(heroi.vida);

    
  }
}
