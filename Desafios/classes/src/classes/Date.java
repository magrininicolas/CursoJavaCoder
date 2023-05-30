package classes;

public class Date {
  int day;
  int month;
  int year;

  Date() {
    this(1, 1, 1970);
  }

  Date(int day, int month, int year) {
    this.day = day;
    this.month = month;
    this.year = year;
  }

  String obterDataFormatada() {
    return String.format("%d/%d/%d", day, month, year);
    // Pode ser assim também: return "%d/%d/%d".formatted(Day, Month, Year);
  }
}
