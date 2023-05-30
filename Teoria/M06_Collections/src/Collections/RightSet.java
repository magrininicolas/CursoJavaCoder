package Collections;

import java.util.Set;
import java.util.LinkedHashSet;

public class RightSet {

  public static void main(String[] args) {
    //Set<String> listaAprovados = new HashSet<>();
    Set<String> listaAprovados = new LinkedHashSet<>(); //Garante a ordem de insercao

    listaAprovados.add("Nicolas");
    listaAprovados.add("Rodson");
    listaAprovados.add("Luzia");
    listaAprovados.add("Lucas");

    for (String candidato : listaAprovados) {
      System.out.println(candidato);
    }

  }
}
