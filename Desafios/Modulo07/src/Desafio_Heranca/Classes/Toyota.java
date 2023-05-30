package Desafio_Heranca.Classes;

import Desafio_Heranca.Interfaces.Esportivo;
import Desafio_Heranca.Interfaces.Luxo;

public class Toyota extends Carro implements Esportivo, Luxo {

  int multiplicadorVelocidade;
  private boolean ligarTurbo;
  private boolean ligarAr;

  public Toyota() {
    this("Toyota Supra MK4", 315);
  }

  public Toyota(String modelo, int velocidadeMaxima) {
    super(modelo, velocidadeMaxima);
    multiplicadorVelocidade = 5;
  }

  public void acelerar() {
    if (velocidadeAtual < (VELOCIDADE_MAXIMA + getDelta())) {
      velocidadeAtual += getDelta() * multiplicadorVelocidade;
    }
  }

  public void desacelerar() {
    if (velocidadeAtual > getDelta()) {
      velocidadeAtual -= getDelta() * multiplicadorVelocidade;
    } else {
      velocidadeAtual = 0;
    }
  }

  @Override
  public void ligarTurbo() {
    ligarTurbo = true;
  }

  @Override
  public void desligarTurbo() {
    ligarTurbo = false;
  }

  @Override
  public void ligarAr() {
    ligarAr = true;
  }

  @Override
  public void desligarAr() {
    ligarAr = false;
  } 

  @Override
  public int getDelta() {
    if(ligarTurbo && !ligarAr) { 
      multiplicadorVelocidade = 8;
    } else if (ligarTurbo && ligarAr) {
      multiplicadorVelocidade = 6;
    } else {
      multiplicadorVelocidade = 5;
    }
    return multiplicadorVelocidade;
  }
}
