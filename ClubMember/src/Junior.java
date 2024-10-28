public class Junior extends ClubMember
{
  private char gender;

  public Junior(String name, int age, char gender)
  {
    super(name,age);
    this.gender = gender;
  }

  public char getGender()
  {
    return gender;
  }

  public String toString()
  {
    if (gender == 'F' || gender == 'f')
    {
      return super.toString() + ", gender: female";
    }
    return super.toString() + ", gender: male";
  }

  @Override public double getMembershipFee()
  {
    if (gender == 'F' || gender == 'f')
    {
      return 300;
    }
    return 400;
  }
}
