public class Address
{
  private String town;
  private String street;
  private int number;
  private char letter;
  private int floor;
  private String door;

  public Address(String town, String street, int number, char letter, int floor,
      String door)
  {
    this.town = town;
    this.street = street;
    this.number = number;
    this.letter = letter;
    this.floor = floor;
    this.door = door;
  }

  public Address(String town, String street, int number, char letter, int floor)
  {
    this.town = town;
    this.street = street;
    this.number = number;
    this.letter = letter;
    this.floor = floor;
  }

  public Address(String town, String street, int number, int floor, String door)
  {
    this.town = town;
    this.street = street;
    this.number = number;
    this.floor = floor;
    this.door = door;
  }

  public Address(String town, String street, int number, int floor)
  {
    this.town = town;
    this.street = street;
    this.number = number;
    this.floor = floor;
  }

  public Address(String town, String street, int number)
  {
    this.town = town;
    this.street = street;
    this.number = number;
  }

  public Address(String town, String street, int number, char letter)
  {
    this.town = town;
    this.street = street;
    this.number = number;
    this.letter = letter;
  }

  public Address(String town, String street, int number, char letter,
      String door)
  {
    this.town = town;
    this.street = street;
    this.number = number;
    this.letter = letter;
    this.door = door;
  }

  public Address(String town, String street, int number, String door)
  {
    this.town = town;
    this.street = street;
    this.number = number;
    this.door = door;
  }

  public String getTown()
  {
    return town;
  }

  public String getStreet()
  {
    return street;
  }

  public int getNumber()
  {
    return number;
  }

  public char getLetter()
  {
    return letter;
  }

  public int getFloor()
  {
    return floor;
  }

  public String getDoor()
  {
    return door;
  }

  public boolean isApartment()
  {
    if (floor != Integer.MIN_VALUE)
    {
      return false;
    }
    else
    {
      return true;
    }
  }

  public String getFullNumber()
  {
    String s = "";
    if (letter == '-')
    {
      if (!isApartment())
      {
        s = number + ", " + door;
      }
      else
      {
        s = number + ", " + floor + door;
      }
    }
    else
    {
      if (!isApartment())
      {
        s = number + "" + letter + ", " + door;
      }
      else
      {
        s = number + "" + letter + ", " + floor + door;
      }
    }
    return s;
  }


  public String toString()
  {
    return street + " " + getFullNumber() + ", " + town;
  }
}
