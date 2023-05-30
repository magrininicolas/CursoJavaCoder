package Composicao.Um_pra_Um;

public class Carro{
  
  Motor motor;

  Carro() {
    this.motor = new Motor();
  }

  void acelerar() {
    if(motor.fatorInjecao < 2.6 && estaLigado()) {
      motor.fatorInjecao += 0.4;
    }
  }

  void frear() {
    if(motor.fatorInjecao > 0.5 && estaLigado()) {
      motor.fatorInjecao -= 0.4;
    }
  }

  void ligar() {
    motor.ligado = true;
  }

  void desligar() {
    motor.ligado = false;
  }

  boolean estaLigado() {
    return motor.ligado;
  }


}
