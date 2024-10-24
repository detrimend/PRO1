import java.util.ArrayList;

public class VehicleList
{
  private ArrayList<Vehicle> list;

  public VehicleList()
  {
    this.list = new ArrayList<>();
  }

  public int size()
  {
    return list.size();
  }

  public void add(Vehicle vehicle)
  {
    list.add(vehicle);
  }

  public void remove(Vehicle vehicle)
  {
    list.remove(vehicle);
  }

  public Vehicle get(int index)
  {
    return list.get(index);
  }

  public int getNumberOfVehiclesByOwner(String owner)
  {
    int ownedVehicles = 0;
    for (int i = 0; i < list.size(); i++)
    {
      if ((list.get(i) != null) && list.get(i).getOwner().equals(owner))
      {
        ownedVehicles++;
      }
    }
    return ownedVehicles;
  }

  public ArrayList<Vehicle> getVehiclesByPrice(double maxPrice)
  {
    ArrayList<Vehicle> listByPrice = new ArrayList<>();
    for (int i = 0; i < list.size(); i++)
    {
      if (list.get(i).getPrice() < maxPrice)
      {
        listByPrice.add(list.get(i));
      }
    }
    return listByPrice;
  }

  public int getNumberOfCars()
  {
    int numberOfCars = 0;
    for (int i = 0; i < list.size(); i++)
    {
      if (list.get(i).getClass().equals(Car.class))
      {
        numberOfCars++;
      }
    }
    return numberOfCars;
  }


}
