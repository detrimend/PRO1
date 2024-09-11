import java.util.Scanner;

public class ClockTest
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);

    System.out.print("Hour: ");
    int hour = input.nextInt();

    System.out.print("Minute: ");
    int minute = input.nextInt();

    System.out.print("Second: ");
    int second = input.nextInt();

    System.out.println();

    Clock clock1 = new Clock(hour, minute, second);
    System.out.println("Hour: " + clock1.getHour());
    System.out.println("Minute: " + clock1.getMinute());
    System.out.println("Second: " + clock1.getSecond());

    System.out.println();

    System.out.println(clock1);

    System.out.println();

    System.out.println("Time in seconds: " + clock1.getTimeInSeconds());

    System.out.println();

    System.out.println("Simple time: " + clock1.getSimpleTime());

    System.out.println();

    // total seconds

    clock1.set(7259); // override til 7259 sekunder
    System.out.println(clock1);

    clock1.tic();
    System.out.println(clock1);
    clock1.tic();
    System.out.println(clock1);


  }
}
