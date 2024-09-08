import java.sql.Driver;

public class DriversLicense
{
  private int number;
  private boolean permitForTruck;
  private boolean permitForBus;

  public DriversLicense(int number, boolean permitForTruck, boolean permitForBus)
  {
    this.number = number;
    this.permitForTruck = permitForTruck;
    this.permitForBus = permitForBus;
  }

  public DriversLicense(int number, boolean truckAndBus)
  {
    this.number = number;
    this.? = truckAndBus;
  }

  public DriversLicense(int number)
  {
    this.number = number;
  }

  public int getNumber()
  {
    return number;
  }

  public boolean hasPermitForDrivingTruck()
  {
    return ?
  }

  public boolean hasPermitForDrivingBus()
  {
    return ?
  }

  public String toString()
  {
    return
  }


}
