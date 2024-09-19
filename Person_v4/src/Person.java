public class Person
{
  private Name name;
  private MyDate birthday;
  private char gender;

  public Person(Name name, MyDate birthday, char gender)
  {
    this.name = name;
    this.birthday = birthday.copy();
    this.gender = gender;
  }

  public Name getName()
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

  public void set(Name name, MyDate birthday, char gender)
  {
    this.name = name;
    this.birthday = birthday;
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

  public String getStatus()
  {
    String s = "";
    if (gender == 'M' || gender == 'm')
    {
      if (age < 18)
      {
        s = "Boy";
      }
      else
      {
        s = "Man";
      }
    }
    else if (gender == 'F' || gender == 'f')
    {
      if (age < 18)
      {
        s = "Girl";
      }
      else
      {
        s = "Woman";
      }
    }
    else
    {
      s = "N/A";
    }
    return s;
  }


}
