public class EqualsTemplate
  {
    private int x; // primitive type
    private String s; // object reference
    private Person p; // object reference of a class we implement ourselves

    //...

    public boolean equals(Object obj)
    {
      if (obj == null || getClass() != obj.getClass())
    {
      return false;
    }
      EqualsTemplate other = (EqualsTemplate) obj;
      return x == other.x         // use == for primitive types
          && s.equals(other.s)    // se .equals for objects
          && p.equals(other.p);
    }
}
