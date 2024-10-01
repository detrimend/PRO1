public class HotelRoom
{
  private int number;
  private String type;
  private double price;
  private Guest guest;
  private static final double SINGLE_PRICE = 59.50;
  private static final double DOUBLE_PRICE = 68.50;
  private static final double FAMILY_PRICE = 99.25;
  public static final String SINGLE = "Single";
  public static final String DOUBLE = "Double";
  public static final String FAMILY = "Family";


  public HotelRoom(int number, String type)
  {
    this.number = number;
    this.type = type;
  }

  public int getNumber()
  {
    return number;
  }

  public String getType()
  {
    return type;
  }

  public double getPrice()
  {
    return price;
  }

  public Guest getGuest()
  {
    return guest;
  }

  public int getFloor()
  {
    return number / 100;
  }

  public boolean isOccupied()
  {
    if (guest != null)
    {
      return true;
    }
    return false;
  }

  public void registerGuest(Guest guest)
  {
    this.guest = guest;
  }

  public void vacate(Guest guest)
  {
    this.guest = null;
  }

  public String toString()
  {
    if (isOccupied())
    {
      return "Occupied. " + guest.toString() + " Room: " + getNumber()
          + ". Type: " + getType();
    }
    else
    {
      return "Available.";
    }
  }

  public static double getRoomPrice(String type)
  {
    return switch (type)
    {
      case SINGLE -> SINGLE_PRICE;
      case DOUBLE -> DOUBLE_PRICE;
      default -> FAMILY_PRICE;
    };
  }

}
