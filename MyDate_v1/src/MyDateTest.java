import java.util.Scanner;

public class MyDateTest
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);

    System.out.print("Day: ");
    int day = keyboard.nextInt();

    System.out.print("Month: ");
    int month = keyboard.nextInt();

    System.out.print("Year: ");
    int year = keyboard.nextInt();

    System.out.println();

    MyDate myDate1 = new MyDate(day, month, year);

    System.out.println("The date is: ");

    System.out.println(myDate1);

    System.out.println();

    System.out.println("Day: " + myDate1.getDay());

    System.out.println("Month: " + myDate1.getMonth());

    System.out.println("Year: " + myDate1.getYear());

    System.out.println();

    myDate1.set(10,10,2025);

    System.out.println("In a little over a year, the date will be: ");

    System.out.println(myDate1);

    System.out.println();

    System.out.println("Day: " + myDate1.getDay());

    System.out.println("Month: " + myDate1.getMonth());

    System.out.println("Year: " + myDate1.getYear());

  }
}
