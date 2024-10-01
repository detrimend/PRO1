import java.util.ArrayList;
import java.util.Scanner;

public class Array
{
  public static void main(String[] args)
  {
    ArrayList<String> stringList;
    stringList = new ArrayList<>();

    Scanner input = new Scanner(System.in);

    System.out.print("Enter string 1: ");
    stringList.add(input.nextLine());

    System.out.print("Enter string 2: ");
    stringList.add(input.nextLine());

    System.out.print("Enter string 3: ");
    stringList.add(input.nextLine());

    System.out.print("Enter string 4: ");
    stringList.add(input.nextLine());

    System.out.print("Enter string 5: ");
    stringList.add(input.nextLine());

    System.out.print("Enter string 6: ");
    stringList.add(input.nextLine());

    System.out.print("Enter string 7: ");
    stringList.add(input.nextLine());

    System.out.println();
    for (int i=0; i< stringList.size(); i++)
    {
      System.out.print(stringList.get(i) + " ");
    }
    System.out.println();

    System.out.print("Enter a new string: ");
    String userString = input.nextLine();

    System.out.print("Enter an index for the new string: ");
    int userIndex = input.nextInt();

    System.out.println(userString + userIndex);

    stringList.add(userIndex, userString);


    System.out.println();
    for (int i=0; i< stringList.size(); i++)
    {
      System.out.print(stringList.get(i) + " ");
    }
    System.out.println();

    System.out.println(stringList.toString());



  }
}
