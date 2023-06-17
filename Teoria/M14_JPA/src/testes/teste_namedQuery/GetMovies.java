package testes.teste_namedQuery;


import java.util.List;

import infra.DAO;
import modelo.muitosPraMuitos.Movie;

public class GetMovies {
  
  public static void main(String[] args) {
    
    DAO<Movie> dao = new DAO<>(Movie.class);
    List<Movie> movies = dao.consult("moviesNoteGreaterThan", "note", 8.5);

    for (Movie movie : movies) {
      System.out.println("Movie: " + movie.getName() + ", Note: " + movie.getNote());
    }
  }
}
