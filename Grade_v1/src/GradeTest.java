import java.util.Scanner;

public class GradeTest
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter grade: ");
    int grade = input.nextInt();

    System.out.println();

    Grade grade1 = new Grade(grade);

    System.out.println("Grade: " + grade1.getGrade());
    System.out.println("ECTS: " + grade1.getEctsGrade());

    System.out.println(grade1);


  }
}
