package Desafio_Polimorfismo.Teste;

import Desafio_Polimorfismo.Classes.Arroz;
import Desafio_Polimorfismo.Classes.Feijao;
import Desafio_Polimorfismo.Classes.Pessoa;
import Desafio_Polimorfismo.Classes.Sorvete;

public class Jantar {
  public static void main(String[] args) {
    
    Pessoa convidado = new Pessoa("Nicolas", 99.65);

    Arroz ingrediente1 = new Arroz(0.2);
    Feijao ingredinte2 = new Feijao(0.1);
    Sorvete sobremesa = new Sorvete(0.05);

    convidado.comer(ingrediente1);
    convidado.comer(ingredinte2);
    convidado.comer(sobremesa);

    System.out.println(convidado);
    
  }
}
