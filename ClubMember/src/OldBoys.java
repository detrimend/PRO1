public class OldBoys extends ClubMember
{
  private int yearsOfMembership;

  public OldBoys(String name, int age, int yearsOfMembership)
  {
    super(name,age);
    this.yearsOfMembership = yearsOfMembership;
  }

  public int getYearsOfMembership()
  {
    return yearsOfMembership;
  }

  public void setYearsOfMembership(int years)
  {
    this.yearsOfMembership = years;
  }

  public String toString()
  {
    return super.toString() + ", years of membership: " + yearsOfMembership;
  }

  @Override public double getMembershipFee()
  {
    if (yearsOfMembership < 5)
    {
      return 300;
    }
    if (yearsOfMembership >= 5 && yearsOfMembership <= 9)
    {
      return 200;
    }
    return 100;
  }
}
