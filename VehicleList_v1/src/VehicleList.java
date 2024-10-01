import java.util.ArrayList;

public class VehicleList
{
  private int size;
  private Car[] list;

  public VehicleList(int maxSize)
  {
    this.list = new Car[maxSize];
    this.size = 0;
  }

  public int size()
  {
    return size;
  }

  public boolean isFull()
  {
    return size >= list.length;
  }

  public void add(Car vehicle)
  {
    if (!isFull())
    {
      list[size] = vehicle;
      size++;
    }
  }

  public void remove(Car vehicle)
  {
    for (int i = 0; i < size; i++)
    {
      if (vehicle.equals(list[i]))
      {
        for (int j = i; j < size - 1; j++)
        {
          list[j] = list[j + 1];
        }
        list[size - 1] = null;
        size--;
        break;
      }
    }
  }

  public Car get(int index)
  {
    return list[index];
  }

  public int getNumberOfCarsByMake(String make)
  {
    int count = 0;
    for (int i = 0; i < size; i++)
    {
      if (make.equals(list[i].getMake()))
      {
        count++;
      }
    }
    return count;
  }

  public int getNumberOfCarsWithManualGear()
  {
    int count = 0;
    for (int i = 0; i < size; i++)
    {
      if (list[i].hasManualGear())
      {
        count++;
      }
    }
    return count;
  }

  public int getNumberOfDieselCars()
  {
    int count = 0;
    for (int i = 0; i < size; i++)
    {
      if (list[i].getEngine().isDiesel())
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
    for (int i = 0; i < size; i++)
    {
      if (make.equals(list[i].getMake()))
      {
        carsByMake[index] = list[i];
        index++;
      }
    }
    return carsByMake;
  }

  public Car[] getCarsByGearType(boolean manualGear)
  {
    ArrayList<Car> carsByGear = new ArrayList<>();
    for (int i = 0; i < size; i++)
    {
      if (list[i].hasManualGear() == manualGear)
      {
        carsByGear.add(list[i]);
      }
    }
    Car[] array = new Car[carsByGear.size()];
    carsByGear.toArray(array);
    return array;
  }

  public Car getFirstCarByHorsepower(int minHorsepower)
  {
    for (int i = 0; i < size; i++)
    {
      if (list[i].getEngine().getHorsePower() >= minHorsepower)
      {
        return list[i];
      }
    }
    return null;
  }

}
