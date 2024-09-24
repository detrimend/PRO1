public class GradeList
{
  private int[] grades;
  private int actualNumberOfGrades;
  public static final int[] LEGAL_GRADES = {12, 10, 7, 4, 2, 0, -3};

  public GradeList(int maxNumberOfGrades)
  {
    grades = new int[maxNumberOfGrades];
    this.actualNumberOfGrades = 0;
  }

  public static boolean isLegalGrade(int grade)
  {
    for (int i = 0; i < LEGAL_GRADES.length; i++)
    {
      if (grade == LEGAL_GRADES[i])
      {
        return true;
      }
    }
    return false;
  }

  public int size()
  {
    return actualNumberOfGrades;
  }

  public void addGrade(int grade)
  {
    if (size() > grades.length)
    {
      if (!isLegalGrade(grade))
      {
        grade = -3;
      }
      grades[size()] = grade;
      actualNumberOfGrades++;
    }
  }

  public int getGrade(int index)
  {
    return grades[index];
  }

  public int getMaxGrade()
  {
    int maxGrade = -3;
    for (int i = 0; i < grades.length; i++)
    {
      if (grades[i] > maxGrade)
      {
        maxGrade = grades[i];
      }
    }
    return maxGrade;
  }

  public int getMinGrade()
  {
    int minGrade = 12;
    for (int i = 0; i < grades.length; i++)
    {
      if (grades[i] < minGrade)
      {
        minGrade = grades[i];
      }
    }
    return minGrade;
  }

  public double getAverage()
  {
    double sum = 0.0;
    for (int i = 0; i < grades.length; i++)
    {
      sum += grades[i];
    }
    return sum / actualNumberOfGrades;
  }

}
