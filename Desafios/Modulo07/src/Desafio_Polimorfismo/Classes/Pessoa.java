package Desafio_Polimorfismo.Classes;

public class Pessoa {
  
  private String nome;
  private double peso;

  public Pessoa(String nome, double peso) {
    this.setNome(nome);
    this.setPeso(peso);
  }

  public void comer(Comida comida) {
    this.peso += comida.getPeso();
  }

  public double getPeso() {
    return peso;
  }

  public void setPeso(double peso) {
    if(!(peso < 0)) {
      this.peso = peso;
    }
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    if(nome != null) {
      this.nome = nome;
    }
  }
  
  @Override
  public String toString() {
    return String.format("Oi, meu nome é %s e peso %.2f quilos", getNome(), getPeso());
  }

}
