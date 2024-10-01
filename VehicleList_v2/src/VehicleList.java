import java.util.ArrayList;

public class VehicleList
{
  private ArrayList<Car> list;

  public VehicleList()
  {
    this.list = new ArrayList<>();
  }

  public int size()
  {
    return list.size();
  }

  public boolean isFull()
  {
    return false;
  }

  public void add(Car vehicle)
  {
    list.add(vehicle);
  }

  public void remove(Car vehicle)
  {
    list.remove(vehicle);
  }

  public Car get(int index)
  {
    return list.get(index);
  }

  public int getNumberOfCarsByMake(String make)
  {
    int count = 0;
    for (int i = 0; i < list.size(); i++)
    {
      if (make.equals(list.get(i).getMake()))
      {
        count++;
      }
    }
    return count;
  }

  public int getNumberOfCarsWithManualGear()
  {
    int count = 0;
    for (int i = 0; i < list.size(); i++)
    {
      if (list.get(i).hasManualGear())
      {
        count++;
      }
    }
    return count;
  }

  public int getNumberOfDieselCars()
  {
    int count = 0;
    for (int i = 0; i < list.size(); i++)
    {
      if (list.get(i).getEngine().isDiesel())
      {
        count++;
      }
    }
    return count;
  }

  public Car[] getCarsByMake(String make)
  {
    Car[] carsByMake = new Car[getNumberOfCarsByMake(make)];
    int index = 0;
    for (int i = 0; i < list.size(); i++)
    {
      if (make.equals(list.get(i).getMake()))
      {
        carsByMake[index] = list.get(i);
        index++;
      }
    }
    return carsByMake;
  }

  public Car[] getCarsByGearType(boolean manualGear)
  {
    ArrayList<Car> carsByGear = new ArrayList<>();
    for (int i = 0; i < list.size(); i++)
    {
      if (list.get(i).hasManualGear() == manualGear)
      {
        carsByGear.add(list.get(i));
      }
    }
    Car[] array = new Car[carsByGear.size()];
    carsByGear.toArray(array);
    return array;
  }

  public Car getFirstCarByHorsepower(int minHorsepower)
  {
    for (int i = 0; i < list.size(); i++)
    {
      if (list.get(i).getEngine().getHorsePower() >= minHorsepower)
      {
        return list.get(i);
      }
    }
    return null;
  }



}
