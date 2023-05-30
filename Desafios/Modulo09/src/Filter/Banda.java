package Filter;


public class Banda {

  enum MusicGenre {
    METAL, NUMETAL, ROCK, INDIE, MusicGenre; 
  }

  public String bandsName;
  public int yearOfCreation;
  public MusicGenre genre;

  public Banda(String bandsName, int yearOfCreation, MusicGenre genre) {
    this.bandsName = bandsName;
    this.yearOfCreation = yearOfCreation;
    this.genre = genre;
  }
}
