import java.util.Scanner;

public class NameTest
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);

    System.out.print("Enter your first name: ");
    String firstName = keyboard.nextLine();

    System.out.print("Enter your last name: ");
    String lastName = keyboard.nextLine();

    Name name1 = new Name(firstName, lastName);

    System.out.println("First name: " + name1.getFirstName());
    System.out.println("Last name: " + name1.getLastName());
    System.out.println("Full name: " + name1.getFullName());
    System.out.println("Formal name: " + name1.getFormalName());

  }
}
