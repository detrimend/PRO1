public class MyDate
{
  private int day;
  private int month;
  private int year;

  private static int[] DaysInMonthNonLeapYear = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
  private static int[] DaysInMonthLeapYear = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
  private static String[] MonthNames = { "January", "Februrary", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" };

  public MyDate(int day, int month, int year)
  {
    set(day, month, year);
  }

  public void set(int day, int month, int year)
  {
    this.day = day;
    this.month = month;
    this.year = year;
  }

  public int getDay() {
    return day;
  }

  public int getMonth() {
    return month;
  }

  public int getYear() {
    return year;
  }

  public boolean isLeapYear()
  {
    return ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
  }

  public int numberOfDaysInMonth()
  {
    return isLeapYear() ? DaysInMonthLeapYear[month - 1] : DaysInMonthNonLeapYear[month - 1];
  }

  public String getMonthName() {
    return (month >= 1 && month <= 12) ? MonthNames[month - 1] : "Invalid month";
  }

  public void stepForwardOneDay()
  {
    day++;
    if (day > numberOfDaysInMonth()) {
      day = 1;
      month++;
      if (month > 12) {
        month = 1;
        year++;
      }
    }
  }

  public String toString()
  {
    return String.format("%02d/%02d/%d", day, month, year);
  }
}
