public class Bicycle extends Vehicle
{
  private int gears;

  public Bicycle(String owner, double price, int numberOfGears)
  {
    super(owner, price);
    this.gears = numberOfGears;
  }

  public void setGears(int numberOfGears)
  {
    this.gears = numberOfGears;
  }

  public int getGears()
  {
    return gears;
  }

  public String toString()
  {
    return super.toString() + ", number of gears: " + gears;
  }

  public boolean equals(Object obj)
  {
    if (obj == null || getClass() != obj.getClass())
    {
      return false;
    }
    Bicycle other = (Bicycle)obj;
    return super.equals(obj) && (gears == other.gears);
  }


}
