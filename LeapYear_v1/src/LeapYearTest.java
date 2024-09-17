public class LeapYearTest
{
  public static void main(String[] args)
  {
    MyDate year1 = new MyDate(1,1,1582);

    int nYears = 0;
    for (int i = year1.getYear(); i <= 2024; i++)
    {
      if (i == isLeapYear);
      {
        nYears++;
      }
    }
    System.out.println(nYears);
  }
}
