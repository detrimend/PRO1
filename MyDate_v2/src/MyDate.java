public class MyDate
{
  private int day;
  private int month;
  private int year;

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
    if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0))
    {
      return true;
    }
    else
    {
      return false;
    }
  }

  public int numberOfDaysInMonth()
  {
    int n = 0;
    if (month == 2)
    {
      if (isLeapYear())
      {
        n = 29;
      }
      else
      {
        n = 28;
      }
    }
    else if (month == 4 || month == 6 || month == 9 || month == 11)
    {
      n = 30;
    }
    else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8
        || month == 10 || month == 12)
    {
      n = 31;
    }
    return n;
  }

  public String getMonthName()
  {
    String s = "";
    if (month == 1)
    {
      s = "January";
    }
    else if (month == 2)
    {
      s = "February";
    }
    else if (month == 3)
    {
      s = "March";
    }
    else if (month == 4)
    {
      s = "April";
    }
    else if (month == 5)
    {
      s = "May";
    }
    else if (month == 6)
    {
      s = "June";
    }
    else if (month == 7)
    {
      s = "July";
    }
    else if (month == 8)
    {
      s = "August";
    }
    else if (month == 9)
    {
      s = "September";
    }
    else if (month == 10)
    {
      s = "October";
    }
    else if (month == 11)
    {
      s = "November";
    }
    else if (month == 12)
    {
      s = "December";
    }
    else
    {
      s = "null";
    }
    return s;
  }

  public void stepForwardOneDay()
  {
    day++;
    if (month == 4 || month == 6 || month == 9 || month == 11)
    {
      if (day > 30)
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
    if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8
        || month == 10 || month == 12)
    {
      if (day > 31)
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
    if (month == 2)
    {
      if (isLeapYear())
      {
        if (day > 29)
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
      else
      {
        if (day > 28)
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
    }
  }

 
  public String toString()
  {
    String all = day + "/" + month + "/" + year;
    return all;
  }
}
