public class SportsCar extends Car
{
  private int maxVelocity;

  public SportsCar(String owner, double price, String regNo, int maxVelocity)
  {
    super(owner, price, regNo);
    this.maxVelocity = maxVelocity;
  }

  public int getMaxVelocity()
  {
    return maxVelocity;
  }

  public String toString()
  {
    return super.toString() + ", maximum velocity: " + maxVelocity;
  }

  public boolean equals(Object obj)
  {
    if (obj == null || getClass() != obj.getClass())
    {
      return false;
    }
    SportsCar other = (SportsCar)obj;
    return super.equals(obj) && (maxVelocity == other.maxVelocity);
  }
}
