import java.util.Objects;

/**
 * A class representing a Grade.
 *
 * @author Rasmus Duus
 * @version 1.0 - November 2024
 */

public class Grade
{
  private int grade;
  private String course;
  public static final int[] LEGAL_GRADES = {12, 10, 7, 4, 2, 0, -3};

  /**
   * Two-argument constructor.
   * @param grade
   *              a grade represented by an integer
   * @param course
   *              a course represented by a string
   */

  public Grade(int grade, String course)
  {
    this.grade = grade;
    this.course = course;
  }

  /**
   * Returns a grade
   * @return the grade as an integer.
   */

  public int getGrade()
  {
    return grade;
  }

  /**
   * Returns a course
   * @return the course as a String.
   */

  public String getCourse()
  {
    return course;
  }

  /**
   * Returns whether the grade is legal or not.
   * @param grade
   *              the grade represented as an integer
   * @return true if the grade is legal. Otherwise returns false.
   */

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

  /**
   * Returning whether the grade object is equal to another object.
   * @param obj
   *            the other object being compared against the grade object
   * @return true if the compared objects are equal,
   *          or if the parameters for each object are equal.
   *          Otherwise returns false.
   * @see Object#equals(Object)
   */

  @Override public boolean equals(Object obj)
  {
    if (this == obj)
      return true;
    if (obj == null || getClass() != obj.getClass())
      return false;
    Grade grade1 = (Grade) obj;
    return grade == grade1.grade && Objects.equals(course, grade1.course);
  }

  /**
   * Format the parameters of a grade to a string.
   * @return the parameters of the grade object as a formatted string.
   */

  @Override public String toString()
  {
    return "Grade{" + "grade=" + grade + ", course='" + course + '\'' + '}';
  }
}
