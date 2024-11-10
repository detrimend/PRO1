import java.time.LocalDate;

public class MyDate
{
  private int day;
  private int month;
  private int year;

  public MyDate()
  {
    LocalDate now = LocalDate.now();
    set(now.getDayOfMonth(), now.getMonthValue(), now.getYear());
  }

  public MyDate(int day, int month, int year)
  {
    set(day, month, year);
  }

  public void set(int day, int month, int year)
  {
    if (year < 0)
    {
      year = -year;
    }
    this.year = year;

    if (month < 1)
    {
      month = 1;
    }
    else if (month > 12)
    {
      month = 12;
    }
    this.month = month;

    if (day < 1)
    {
      day = 1;
    }
    else if (day > numberOfDaysInMonth())
    {
      day = numberOfDaysInMonth();
    }
     this.day = day;
  }

  public int getDay()
  {
    return day;
  }

  public int getMonth()
  {
    return month;
  }

  public int getYear()
  {
    return year;
  }

  public boolean isLeapYear()
  {
    return (year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0));
  }

  public String getMonthName()
  {
    switch (month)
    {
      case 1:
        return "January";
      case 2:
        return "February";
      case 3:
        return "March";
      case 4:
        return "April";
      case 5:
        return "May";
      case 6:
        return "June";
      case 7:
        return "July";
      case 8:
        return "August";
      case 9:
        return "September";
      case 10:
        return "October";
      case 11:
        return "November";
      case 12:
        return "December";
      default:
        return "Error";
    }
  }

  public void stepForwardOneDay()
  {
    day++;
    if (day > numberOfDaysInMonth())
    {
      day = 1;
      month++;
      if (month > 12)
      {
        month = 1;
        year++;
      }
    }
  }

  public int numberOfDaysInMonth()
  {
    switch (month)
    {
      case 2:
        if (isLeapYear())
        {
          return 29;
        }
        return 28;
      case 4:
      case 6:
      case 9:
      case 11:
        return 30;
      default:
        return 31;
    }
  }

  public boolean isBefore(MyDate other)
  {
    int dummyDaysOfThis = year * 400 + month * 31 + day;
    int dummyDaysOfOther = other.year * 400 + other.month * 31 + other.day;
    return dummyDaysOfThis < dummyDaysOfOther;
  }

  public int yearsBetween(MyDate other)
  {
    int years = 0;
    if (isBefore(other))
    {
      years = other.year - this.year;
      if (this.month > other.month || (this.month == other.month
          && this.day > other.day))
      {
        years--;
      }
    }
    else
    {
      years = this.year - other.year;
      if (other.month > this.month || (other.month == this.month
          && other.day > this.day))
      {
        years--;
      }
    }
    return years;
  }

  public MyDate copy()
  {
    return new MyDate(this.day, this.month, this.year);
  }

  @Override public String toString()
  {
    String s = "";
    if (day < 10)
    {
      s += "0";
    }
    s += day + "/";
    if (month < 10)
    {
      s += "0";
    }
    s += month + "/" + year;
    return s;
  }

  @Override public boolean equals(Object obj)
  {
    if (obj == null || getClass() != obj.getClass())
    {
      return false;
    }
    MyDate other = (MyDate) obj;
    return day == other.day && month == other.month && year == other.year;
  }
}
