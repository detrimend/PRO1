public class ApartmentComplexTest
{
  public static void main(String[] args)
  {
    ApartmentComplex apartmentComplex = new ApartmentComplex("VIA Apartments");
    Apartment apartment1 = new Apartment(201);
    Apartment apartment2 = new Apartment(202);
    Apartment apartment3 = new Apartment(203);

    apartmentComplex.add(apartment1);
    apartmentComplex.add(apartment2);
    apartmentComplex.add(apartment3);

    Tenant tenant1 = new Tenant("Bob");
    apartmentComplex.getApartment(0).rentTo(tenant1, new MyDate());

    System.out.println(apartmentComplex);

    System.out.println(apartmentComplex.getApartmentByTenant(tenant1));
  }
}
