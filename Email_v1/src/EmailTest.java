import java.util.Scanner;

public class EmailTest
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);

    System.out.print("Enter user: ");
    String user = keyboard.nextLine();

    System.out.print("Enter host: ");
    String host = keyboard.nextLine();

    System.out.print("Enter domain: ");
    String domain = keyboard.nextLine();

    Email email1 = new Email(user, host, domain);

    System.out.println("User: " + email1.getUser());
    System.out.println("Host: " + email1.getHost());
    System.out.println("Domain: " + email1.getDomain());
    System.out.println("Email address: " + email1.toString());

  }
}
