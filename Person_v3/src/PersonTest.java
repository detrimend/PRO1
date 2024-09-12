import java.util.Scanner;

public class PersonTest
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);

    System.out.print("Name: ");
    String name = keyboard.nextLine();

    System.out.print("Age: ");
    int age = keyboard.nextInt();

    keyboard.nextLine();

    System.out.print("Gender: ");
    String line = keyboard.nextLine();
    char gender = line.charAt(0);

    Person person1 = new Person(name, age, gender);

    System.out.println("Name: " + person1.getName());

    System.out.println("Age: " + person1.getAge());

    System.out.println("Gender: " + person1.getGender());

    System.out.println(person1);

    System.out.println();

    System.out.println(person1.getAgeStatus());

    System.out.println();

    System.out.println("Person 2:");

    System.out.print("Name: ");
    name = keyboard.nextLine();

    System.out.print("Gender: ");
    line = keyboard.nextLine();
    gender = line.charAt(0);

    System.out.println();

    Person person2 = new Person(name, gender);

    System.out.println("Name: " + person2.getName());

    System.out.println("Gender: "+ person2.getGender());

    System.out.println(person2);

    System.out.println();

    System.out.println(person2.getAgeStatus());

    System.out.println();

    System.out.println(person1.getStatus());

  }
}
