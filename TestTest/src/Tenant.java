public class Tenant
{
  private String name;
  private MyDate rentedFrom;

  public Tenant(String name) {
    this.name = name;
    this.rentedFrom = new MyDate();
  }

  public String getName()
  {
    return name;
  }

  public MyDate getRentedFrom() {
    return rentedFrom.copy();
  }

  public void setRentedFrom(MyDate date) {
    rentedFrom = date.copy();
  }

  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Tenant tenant = (Tenant)obj;
    return name.equals(tenant.name) && rentedFrom.equals(tenant.rentedFrom);
  }

  public String toString() {
    return name + " (" + rentedFrom + ")";
  }
}
