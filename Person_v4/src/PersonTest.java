import java.util.Scanner;

public class PersonTest
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);

    System.out.print("First name: ");
    String firstName = keyboard.nextLine();

    System.out.print("Last name: ");
    String lastName = keyboard.nextLine();

    System.out.print("Birthday: ");
    int age = keyboard.nextInt();

    keyboard.nextLine();

    System.out.print("Gender: ");
    String line = keyboard.nextLine();
    char gender = line.charAt(0);

    Name name1 = new Name(firstName, lastName);

    Person person1 = new Person(name1, age, gender);

    System.out.println("Name: " + person1.getName());

    System.out.println("Age: " + person1.getAge());

    System.out.println("Gender: " + person1.getGender());

    System.out.println(person1);

    System.out.println();

    System.out.println(person1.getAgeStatus());

    System.out.println();

    System.out.println("Person 2:");

    System.out.print("First name: ");
    String firstName2 = keyboard.nextLine();

    System.out.print("First name: ");
    String lastName2 = keyboard.nextLine();

    System.out.print("Gender: ");
    line = keyboard.nextLine();
    gender = line.charAt(0);

    System.out.println();

    Name name2 = new Name(firstName2, lastName2);

    Person person2 = new Person(name2, gender);

    System.out.println("Name: " + person2.getName());

    System.out.println("Gender: "+ person2.getGender());

    System.out.println(person2);

    System.out.println();

    System.out.println(person2.getAgeStatus());

    System.out.println();

    System.out.println(person2.getStatus());

  }
}
