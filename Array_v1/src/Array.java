import java.util.Scanner;

public class Array
{
  public static void main(String[] args)
  {
    String[] stringList;
    stringList = new String[8];

    Scanner input = new Scanner(System.in);

    System.out.print("Enter string 1: ");
    stringList[0] = input.nextLine();

    System.out.print("Enter string 2: ");
    stringList[1] = input.nextLine();

    System.out.print("Enter string 3: ");
    stringList[2] = input.nextLine();

    System.out.print("Enter string 4: ");
    stringList[3] = input.nextLine();

    System.out.print("Enter string 5: ");
    stringList[4] = input.nextLine();

    System.out.print("Enter string 6: ");
    stringList[5] = input.nextLine();

    System.out.print("Enter string 7: ");
    stringList[6] = input.nextLine();

    System.out.println();
    for (int i=0; i< stringList.length; i++)
    {
      System.out.print(stringList[i] + " ");
    }
    System.out.println();

    System.out.print("Enter a new string: ");
    String userString = input.nextLine();

    System.out.print("Enter an index for the new string: ");
    int userIndex = input.nextInt();

    System.out.println(userString + userIndex);

    for (int i = 7; i > userIndex; i--)
    {
      stringList[i] = stringList[i-1];
    }

    stringList[userIndex] = userString;

    System.out.println();
    for (int i=0; i< stringList.length; i++)
    {
      System.out.print(stringList[i] + " ");
    }
    System.out.println();



  }
}
