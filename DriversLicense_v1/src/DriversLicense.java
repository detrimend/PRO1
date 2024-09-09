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
    this(number,truckAndBus,truckAndBus);
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
    return permitForTruck;
  }

  public boolean hasPermitForDrivingBus()
  {
    return permitForBus;
  }

  public String toString()
  {
    return "License number: " + number + ". " + "Truck permit: " + permitForTruck + ". " + "Bus permit: " + permitForBus + ".";
  }


}
