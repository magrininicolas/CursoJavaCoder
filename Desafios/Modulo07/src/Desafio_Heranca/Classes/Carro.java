package Desafio_Heranca.Classes;

public abstract class Carro {

  public final int VELOCIDADE_MAXIMA;
  protected String modelo;
  protected int velocidadeAtual;
  private int delta = 3;
  boolean ligado = false;

  public Carro(String modelo, int velocidadeMaxima){ 
    this.modelo = modelo;
    this.VELOCIDADE_MAXIMA = velocidadeMaxima;
    this.velocidadeAtual = 0;
  }
  
  public boolean ligar() {
    if(!ligado) {
      ligado = true;
      return ligado;
    }
    return false;
  }

  public boolean desligar() { 
    if(ligado) {
      ligado = false;
      return ligado;
    }
    return true;
  }

  protected void acelerar() {
    if(!(velocidadeAtual + getDelta() > VELOCIDADE_MAXIMA) && ligado) {
      velocidadeAtual += getDelta();
    }
  }

  protected void desacelerar() {
    if(!(velocidadeAtual < 0) && ligado) {
      velocidadeAtual -= getDelta();
    } else {
      velocidadeAtual = 0;
    }
  }

  @Override
  public String toString() {
    return String.format("Velocidade atual do %s é de %dkm/h", modelo, velocidadeAtual);
  }

  public int getVELOCIDADE_MAXIMA() {
    return VELOCIDADE_MAXIMA;
  }

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public int getVelocidadeAtual() {
    return velocidadeAtual;
  }

  public void setVelocidadeAtual(int velocidadeAtual) {
    this.velocidadeAtual = velocidadeAtual;
  }

  public int getDelta() {
    return delta;
  }

  public void setDelta(int delta) {
    this.delta = delta;
  }

  public boolean isLigado() {
    return ligado;
  }

  public void setLigado(boolean ligado) {
    this.ligado = ligado;
  }
}