package Filter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class App {
  public static void main(String[] args) {

    final int ANO_ATUAL = 2023; 
    
    Banda b1 = new Banda("Iron Maiden", 1976, Banda.MusicGenre.METAL);
    Banda b2 = new Banda("Scorpions", 1965, Banda.MusicGenre.METAL);
    Banda b3 = new Banda("Black Sabbath", 1968, Banda.MusicGenre.METAL);
    Banda b4 = new Banda("Kiss", 1973, Banda.MusicGenre.ROCK);
    Banda b5 = new Banda("Pink Floyd", 1965, Banda.MusicGenre.ROCK);
    Banda b6 = new Banda("Deep Purple", 1968, Banda.MusicGenre.ROCK);
    Banda b7 = new Banda("Deftones", 1988, Banda.MusicGenre.NUMETAL);
    Banda b8 = new Banda("Linkin Park", 1994, Banda.MusicGenre.NUMETAL);
    Banda b9 = new Banda("Slipknot", 1995, Banda.MusicGenre.NUMETAL);
    Banda b10 = new Banda("Arctic Monkeys", 2002, Banda.MusicGenre.INDIE);
    Banda b11 = new Banda("The Smiths", 1982, Banda.MusicGenre.INDIE);
    Banda b12 = new Banda("Joy Division", 1976, Banda.MusicGenre.INDIE);

    List<Banda> bands = Arrays.asList(b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12);

    Predicate<Banda> ageGreater30 = band -> ANO_ATUAL - band.yearOfCreation >= 40;
    Predicate<Banda> genre = band -> band.genre == Banda.MusicGenre.INDIE;
    Function<Banda, String> toUpper = band -> String.format("A banda %s foi criada a mais de 40 anos.", band.bandsName.toUpperCase());

    bands.stream()
       .filter(ageGreater30)
       .filter(genre)
       .map(toUpper)
       .forEach(System.out::println);
  } 
}
