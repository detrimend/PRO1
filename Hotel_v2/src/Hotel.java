import java.util.ArrayList;

public class Hotel
{
  private String name;
  private ArrayList<HotelRoom> rooms;

  public Hotel(String name)
  {
    this.name = name;
    this.rooms = new ArrayList<>();
  }

  public String getName()
  {
    return name;
  }

  public int getNumberOfRooms()
  {
    return rooms.size();
  }

  public int getNumberOfAvailableRooms()
  {
    int numberOfAvailableRooms = 0;
    for (int i = 0; i < rooms.size(); i++)
    {
      if (!rooms.get(i).isOccupied())
      {
        numberOfAvailableRooms++;
      }
    }
    return numberOfAvailableRooms;
  }

  public int getNumberOfAvailableRooms(String type)
  {
    int numberOfAvailableRooms = 0;
    for (int i = 0; i < rooms.size(); i++)
    {
      if (rooms.get(i).getType().equals(type) && !rooms.get(i).isOccupied())
      {
        numberOfAvailableRooms++;
      }
    }
    return numberOfAvailableRooms;
  }

  public HotelRoom getFirstAvailableRoom()
  {
    for (int i = 0; i < rooms.size(); i++)
    {
      if (!rooms.get(i).isOccupied())
      {
        return rooms.get(i);
      }
    }
    return null;
  }

  public HotelRoom getFirstAvailableRoom(double maxPrice)
  {
    for (int i = 0; i < rooms.size(); i++)
    {
      if (!rooms.get(i).isOccupied() && rooms.get(i).getPrice() <= maxPrice)
      {
        return rooms.get(i);
      }
    }
    return null;
  }

  public HotelRoom[] getAllAvailableRooms(String type)
  {
    HotelRoom[] availableRooms = new HotelRoom[getNumberOfAvailableRooms(type)];

    int index = 0;
    for (int i = 0; i < availableRooms.length; i++)
    {
      if (rooms.get(i).getType().equals(type) && !rooms.get(i).isOccupied())
      {
        availableRooms[index] = rooms.get(i);
        index++;
      }
    }
    return availableRooms;
  }

  public boolean hasGuest(Guest guest)
  {
    for (int i = 0; i < rooms.size(); i++)
    {
      if (rooms.get(i).isOccupied() && rooms.get(i).getGuest().equals(guest))
      {
        return true;
      }
    }
    return false;
  }

  public HotelRoom getGuest(Guest guest)
  {
    for (int i = 0; i < rooms.size(); i++)
    {
      if (rooms.get(i).isOccupied() && rooms.get(i).getGuest().equals(guest))
      {
        return rooms.get(i);
      }
    }
    return null;
  }

}

