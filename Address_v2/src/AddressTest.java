import java.util.Scanner;

public class AddressTest
{
  public static void main(String[] args)
  {
    Scanner keyboard  = new Scanner(System.in);

    System.out.print("Town: ");
    String town = keyboard.nextLine();

    System.out.print("Street: ");
    String street = keyboard.nextLine();

    System.out.print("Number: ");
    int number = keyboard.nextInt();

    keyboard.nextLine();

    System.out.print("Letter: ");
    String line = keyboard.nextLine();
    char letter = line.charAt(0);

    System.out.print("Floor: ");
    int floor = keyboard.nextInt();

    keyboard.nextLine();

    System.out.print("Door: ");
    String door = keyboard.nextLine();

    Address address1 = new Address(town, street, number, letter, floor, door);

    System.out.println("Town: " + address1.getTown());
    System.out.println("Street: " + address1.getStreet());
    System.out.println("Number: " + address1.getNumber());
    System.out.println("Letter: " + address1.getLetter());
    System.out.println("Floor: " + address1.getFloor());
    System.out.println("Door: " + address1.getDoor());

    System.out.println("Full number: " + address1.getFullNumber());

    System.out.println("Full address: " + address1.toString());


  }
}
