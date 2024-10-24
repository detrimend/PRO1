public class Car extends Vehicle
{
  private String regNo;

  public Car(String owner, double price, String regNo)
  {
    super(owner, price);
    this.regNo = regNo;
  }

  public String getRegistrationNumber()
  {
    return regNo;
  }

  public void setRegistrationNumber(String registrationNumber)
  {
    this.regNo = registrationNumber;
  }

  public String toString()
  {
    return super.toString() + ", registration number: " + regNo;
  }

  public boolean equals(Object obj)
  {
    if (obj == null || getClass() != obj.getClass())
    {
      return false;
    }
    Car other = (Car)obj;
    return super.equals(obj) && regNo.equals(other.regNo);
  }
}
