import java.time.LocalDate;

public class MyDate
{
  private int day;
  private int month;
  private int year;

  public MyDate(int day, int month, int year) {
    set(day,month,year);
  }

  public MyDate() {
    LocalDate dato = LocalDate.now();
    set(dato.getDayOfMonth(), dato.getMonthValue(), dato.getYear());
  }

  public int getDay() {
    return this.day;
  }

  public int getMonth() {
    return this.month;
  }

  public int getYear() {
    return this.year;
  }

  public void set(int day, int month, int year) {
    this.day = day;
    this.month = month;
    this.year = year;
  }

  public MyDate copy() {
    return new MyDate(this.day, this.month, this.year);
  }

  @Override
  public boolean equals(Object object) {
    if (object instanceof MyDate) {
      MyDate dato = (MyDate) object;
      return dato.day == this.day && dato.month == this.month && dato.year == this.year;
    }
    return false;
  }

  @Override
  public String toString() {
    return String.format("%02d/%02d/%02d", this.day, this.month, this.year);
  }

}
