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

    myDate1.set(30,12,2024);

    System.out.println("New, manually set date:");

    System.out.println(myDate1);

    System.out.println();

    System.out.println("Day: " + myDate1.getDay());

    System.out.println("Month: " + myDate1.getMonth());

    System.out.println("Year: " + myDate1.getYear());

    System.out.println();

    System.out.println("Leap year: " + myDate1.isLeapYear());

    System.out.println();

    System.out.println("Days in month: " + myDate1.numberOfDaysInMonth());

    System.out.println();

    System.out.println("Month name: " + myDate1.getMonthName());

    myDate1.stepForwardOneDay();
    System.out.println(myDate1);
    myDate1.stepForwardOneDay();
    System.out.println(myDate1);
    myDate1.stepForwardOneDay();
    System.out.println(myDate1);
    myDate1.stepForwardOneDay();
    System.out.println(myDate1);


  }
}
