public class Person
{
  private String name;
  private int age;
  private char gender;

  public Person(String name, int age, char gender)
  {
    set(name,age,gender);
  }

  public Person(String name, char gender)
  {
    this(name,0,gender);
  }

  public Person(char gender)
  {
    this(null,0,gender);
  }

  public String getName()
  {
    return name;
  }

  public int getAge()
  {
    return age;
  }

  public char getGender()
  {
    return gender;
  }

  public void set(String name, int age, char gender)
  {
    this.name = name;
    this.age = age;
    this.gender = gender;
  }

  public String toString()
  {
    String all = name + ", age = " + age + ", gender = '" + gender + "'.";
    return all;
  }

  public String getAgeStatus()
  {
    String s = "";
    if (age < 0)
    {
      s = "Error";
    }
    else if (age <= 12)
    {
      s = "Child";
    }
    else if (age <= 19)
    {
      s = "Teen";
    }
    else if (age <= 65)
    {
      s = "Adult";
    }
    else if (age > 65)
    {
      s = "Senior Citizen";
    }
    return s;
  }


}
