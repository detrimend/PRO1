import java.util.ArrayList;

public class ApartmentComplex
{
  private String address;
  private ArrayList<Apartment> apartments;

  public ApartmentComplex(String address)
  {
    this.address = address;
    apartments = new ArrayList<>();
  }

  public int getNumberOfApartments()
  {
    return apartments.size();
  }

  public void add(Apartment apartment)
  {
    apartments.add(apartment);
  }

  public Apartment getApartment(int index)
  {
    return apartments.get(index);
  }

  public Apartment getApartmentByNumber(int number)
  {
    for (Apartment apartment : apartments)
    {
      if (apartment.getNumber() == number)
      {
        return apartment;
      }
    }
    return null;
  }

  public Apartment getApartmentByTenant(Tenant tenant)
  {
    for (int i = 0; i < apartments.size(); i++)
    {
      if (tenant != null && tenant.equals(apartments.get(i).getTenant()))
      {
        return apartments.get(i);
      }
    }
    return null;
  }

  public Apartment getFirstAvailableApartment()
  {
    for (Apartment apartment : apartments)
    {
      if (apartment.isAvailable())
      {
        return apartment;
      }
    }
    return null;
  }

  public String toString()
  {
    String string = "";
    for (Apartment apartment : apartments)
    {
      string += apartment.toString() + ", ";
    }
    return string.substring(0,string.length()-2);
  }
}
