public class Course
{
  private String title;
  private Instructor instructor;
  private TextBook primaryTextBook;
  private TextBook secondaryTextBook;

  public Course(String title, Instructor instructor, TextBook primaryTextBook)
  {
    this.title = title;
    this.instructor = instructor;
    this.primaryTextBook = primaryTextBook;
  }

  public String getTitle()
  {
    return title;
  }

  public Instructor getInstructor()
  {
    return instructor;
  }

  public String getInstructorName()
  {
    return instructor.getName();
  }

  public TextBook getPrimaryTextBook()
  {
    return primaryTextBook;
  }

  public TextBook getSecondaryTextBook()
  {
    return secondaryTextBook;
  }

  public void setSecondaryTextBook(TextBook secondaryTextBook)
  {
    this.secondaryTextBook = secondaryTextBook;
  }


}
