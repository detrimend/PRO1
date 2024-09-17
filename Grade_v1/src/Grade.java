public class Grade
{
  private int grade;

  public Grade (int grade)
  {
    this.grade = grade;

    if (getEctsGrade().equals("Illegal grade"))
    {
      this.grade = -3;
    }
  }

  public Grade (String ectsGrade)
  {
    switch (ectsGrade)
    {
      case "F" : grade = -3;break;
      case "Fx" : grade = 0;break;
      case "E" : grade = 2;break;
      case "D" : grade = 4;break;
      case "C" : grade = 7;break;
      case "B" : grade = 10;break;
      case "A" : grade = 12;break;
      default : grade = -3;break;
    }
  }

  public int getGrade()
  {
    return grade;
  }

  public String getEctsGrade()
  {
    String ects = "Illegal grade";
    switch (grade)
    {
      case -3 : ects = "F";break;
      case 0 : ects = "Fx";break;
      case 2 : ects = "E";break;
      case 4 : ects = "D";break;
      case 7 : ects = "C";break;
      case 10 : ects = "B";break;
      case 12 : ects = "A";break;
    }
    return ects;
  }

  public String toString()
  {
    return grade + " (" + getEctsGrade() + ")";
  }
}
