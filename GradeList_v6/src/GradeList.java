import java.util.ArrayList;
import java.util.Objects;

/**
 * A class that represents a list of grades, providing functionality for managing and analyzing grades.
 *
 * @author Rasmus Duus
 * @version 1.0 (18/11-2024)
 */
public class GradeList {
  private ArrayList<Grade> grades;

  /**
   * Constructs a new, empty GradeList.
   */
  public GradeList() {
    this.grades = new ArrayList<>();
  }

  /**
   * Returns the number of grades in the list.
   *
   * @return the size of the grade list.
   */
  public int size() {
    return grades.size();
  }

  /**
   * Adds a grade to the list if it is legal.
   *
   * @param grade the grade to add.
   */
  public void addGrade(Grade grade) {
    if (Grade.isLegalGrade(grade.getGrade())) {
      grades.add(grade);
    }
  }

  /**
   * Adds a grade at a specific index in the list if it is legal.
   *
   * @param index the index at which to add the grade.
   * @param grade the grade to add.
   * @throws IndexOutOfBoundsException if the index is out of range.
   */
  public void addGrade(int index, Grade grade) {
    if (Grade.isLegalGrade(grade.getGrade())) {
      grades.add(index, grade);
    }
  }

  /**
   * Removes the grade at the specified index.
   *
   * @param index the index of the grade to remove.
   * @throws IndexOutOfBoundsException if the index is out of range.
   */
  public void removeGrade(int index) {
    grades.remove(index);
  }

  /**
   * Retrieves the grade at the specified index.
   *
   * @param index the index of the grade to retrieve.
   * @return the grade at the specified index.
   * @throws IndexOutOfBoundsException if the index is out of range.
   */
  public Grade getGrade(int index) {
    return grades.get(index);
  }

  /**
   * Finds and returns the highest grade in the list.
   *
   * @return the maximum grade.
   */
  public Grade getMaxGrade() {
    int maxGrade = -3;
    String maxCourse = "";
    for (int i = 0; i < grades.size(); i++) { // Fixed range issue
      if (grades.get(i).getGrade() > maxGrade) {
        maxGrade = grades.get(i).getGrade();
        maxCourse = grades.get(i).getCourse();
      }
    }
    return new Grade(maxGrade, maxCourse);
  }

  /**
   * Finds and returns the lowest grade in the list.
   *
   * @return the minimum grade.
   */
  public Grade getMinGrade() {
    int minGrade = 12;
    String minCourse = "";
    for (int i = 0; i < grades.size(); i++) { // Fixed range issue
      if (grades.get(i).getGrade() < minGrade) {
        minGrade = grades.get(i).getGrade();
        minCourse = grades.get(i).getCourse();
      }
    }
    return new Grade(minGrade, minCourse);
  }

  /**
   * Calculates and returns the average of all grades.
   *
   * @return the average grade.
   */
  public double getAverage() {
    double sum = 0.0;
    for (int i = 0; i < grades.size(); i++) { // Fixed range issue
      sum += grades.get(i).getGrade();
    }
    return sum / grades.size();
  }

  /**
   * Counts the number of occurrences of a specific grade.
   *
   * @param grade the grade to count.
   * @return the number of occurrences of the specified grade.
   */
  public int getGradeCount(int grade) {
    int count = 0;
    for (int i = 0; i < grades.size(); i++) { // Fixed range issue
      if (grades.get(i).getGrade() == grade) {
        count++;
      }
    }
    return count;
  }

  /**
   * Generates a distribution summary of grades in the list.
   *
   * @return a string representing the grade distribution.
   */
  public String getGradeDistribution() {
    int count12 = 0;
    int count10 = 0;
    int count7 = 0;
    int count4 = 0;
    int count2 = 0;
    int count0 = 0;
    int countNeg3 = 0;
    for (int i = 0; i < grades.size(); i++) { // Fixed range issue
      int grade = grades.get(i).getGrade();
      switch (grade) {
        case 12:
          count12++;
          break;
        case 10:
          count10++;
          break;
        case 7:
          count7++;
          break;
        case 4:
          count4++;
          break;
        case 2:
          count2++;
          break;
        case 0:
          count0++;
          break;
        case -3:
          countNeg3++;
          break;
      }
    }
    return "Grade 12 count: " + count12 + "\n"
        + "Grade 10 count: " + count10 + "\n"
        + "Grade 7 count: " + count7 + "\n"
        + "Grade 4 count: " + count4 + "\n"
        + "Grade 2 count: " + count2 + "\n"
        + "Grade 0 count: " + count0 + "\n"
        + "Grade -3 count: " + countNeg3 + "\n";
  }

  /**
   * Returns a string representation of the grade list.
   *
   * @see Object#toString()
   */
  @Override
  public String toString() {
    return grades.toString();
  }

  /**
   * Compares this GradeList with another object for equality.
   *
   * @param o the object to compare with.
   * @return true if the objects are equal, false otherwise.
   * @see Object#equals(Object)
   */
  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    GradeList gradeList = (GradeList) o;
    return Objects.equals(grades, gradeList.grades);
  }
}

