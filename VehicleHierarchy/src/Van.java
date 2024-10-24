public class Van extends Car
{
  private int maxLoad;

  public Van(String owner, double price, String regNo, int maxLoad)
  {
    super(owner, price, regNo);
    this.maxLoad = maxLoad;
  }

  public int getMaxLoad()
  {
    return maxLoad;
  }

  public String toString()
  {
    return super.toString() + ", max load: " + maxLoad;
  }

  public boolean equals(Object obj)
  {
    if (obj == null || getClass() != obj.getClass())
    {
      return false;
    }
    Van other = (Van)obj;
    return super.equals(obj) && (maxLoad == other.maxLoad);
  }
}
