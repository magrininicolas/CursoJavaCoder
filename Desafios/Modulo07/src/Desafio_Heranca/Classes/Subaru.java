package Desafio_Heranca.Classes;

public class Subaru extends Carro {

  public Subaru() {
    super("Subaru Impreza", 255);
  }

  public Subaru(String modelo, int velocidadeMaxima) {
    super(modelo, velocidadeMaxima);
  }

  public void acelerar() {
    if(velocidadeAtual < VELOCIDADE_MAXIMA) {
      velocidadeAtual += getDelta() * 3;
    }
  }

  public void desacelerar() {
    if(velocidadeAtual > 0) {
      velocidadeAtual -= getDelta() * 3;
    } else { 
      velocidadeAtual = 0;
    }
  }
}
