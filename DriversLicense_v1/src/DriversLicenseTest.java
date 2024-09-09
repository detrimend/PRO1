public class DriversLicenseTest
{
  public static void main(String[] args)
  {
    int number = 123123123;

    boolean permitForTruck = true;

    boolean permitForBus = false;

    boolean truckAndBus = true;

    DriversLicense driversLicense1 = new DriversLicense(number, permitForTruck, permitForBus);

    System.out.println(driversLicense1.toString());

  }
}
