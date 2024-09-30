public class Hotel
{
  private String name;
  private HotelRoom[] rooms;

  public Hotel(String name, HotelRoom[] rooms)
  {
    this.name = name;
    this.rooms = rooms;
  }

  public String getName()
  {
    return name;
  }

  public int getNumberOfRooms()
  {
    return rooms.length;
  }

  public int getNumberOfAvailableRooms()
  {
    int numberOfAvailableRooms = 0;
    for (int i = 0; i < rooms.length; i++)
    {
      if (!rooms[i].isOccupied())
      {
        numberOfAvailableRooms += 1;
      }
    }
    return numberOfAvailableRooms;
  }

  public int getNumberOfAvailableRooms(String type)
  {
    int numberOfAvailableRooms = 0;
    for (int i = 0; i < rooms.length; i++)
    {
      if (rooms[i].getType().equals(type) && !rooms[i].isOccupied())
      {
        numberOfAvailableRooms++;
      }
    }
    return numberOfAvailableRooms;
  }

  public HotelRoom getFirstAvailableRoom()
  {
    for (int i = 0; i < rooms.length; i++)
    {
      if (!rooms[i].isOccupied())
      {
        return rooms[i];
      }
    }
    return null;
  }

  public HotelRoom getFirstAvailableRoom(double maxPrice)
  {
    for (int i = 0; i < rooms.length; i++)
    {
      if (!rooms[i].isOccupied() && rooms[i].getPrice() <= maxPrice)
      {
        return rooms[i];
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
      if (rooms[i].getType().equals(type) && !rooms[i].isOccupied())
      {
        availableRooms[index] = rooms[i];
        index++;
      }
    }
    return availableRooms;
  }

  public boolean hasGuest(Guest guest)
  {
    for (int i = 0; i < rooms.length; i++)
    {
      if (rooms[i].isOccupied() && rooms[i].getGuest().equals(guest))
      {
        return true;
      }
    }
    return false;
  }

  public HotelRoom getGuest(Guest guest)
  {
    for (int i = 0; i < rooms.length; i++)
    {
      if (rooms[i].isOccupied() && rooms[i].getGuest().equals(guest))
      {
        return rooms[i];
      }
    }
    return null;
  }

}

