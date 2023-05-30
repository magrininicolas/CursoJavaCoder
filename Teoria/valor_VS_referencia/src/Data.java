public class Data {
  int day;
  int month;
  int year;

  Data() {
    day = 01;
    month = 01;
    year = 1970;
  }

  Data(int day, int month, int year) {
    this.day = day;
    this.month = month;
    this.year = year;
  }

  String obterDataFormatada() {
    return String.format("%d/%d/%d", day, month, year);
    // Pode ser assim também: return "%d/%d/%d".formatted(Day, Month, Year);
  }
}
