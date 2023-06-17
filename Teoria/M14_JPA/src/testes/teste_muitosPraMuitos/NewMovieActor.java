package testes.teste_muitosPraMuitos;

import infra.DAO;
import modelo.muitosPraMuitos.Actor;
import modelo.muitosPraMuitos.Movie;

public class NewMovieActor {

  public static void main(String[] args) {

    Movie movieA = new Movie("StarWars EP.4", 8.7);
    Movie movieB = new Movie("Raiders of the Lost Ark", 9.0);

    Actor actorA = new Actor("Harrison Ford");
    Actor actressA = new Actor("Carrie Fisher");

    movieA.addActor(actorA);
    movieA.addActor(actressA);

    movieB.addActor(actorA);

    DAO<Movie> daoMovie = new DAO<>();

    daoMovie.openTransaction().include(movieA).closeTransaction();

    daoMovie.close();

  }
}
