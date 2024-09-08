public class Address
{
  private String town;
  private String street;
  private int number;
  private char letter;
  private int floor;
  private String door;

  public Address(String town, String street, int number, char letter, int floor, String door)
  {
    this.town = town;
    this.street = street;
    this.number = number;
    this.letter = letter;
    this.floor = floor;
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

  public String getFullNumber()
  {
    return number + "" + letter + ", " + floor + door; // tomme citation tegn for at adskille
  }

  public String toString()
  {
    return street + " " + getFullNumber() + ", " + town;
  }
}
