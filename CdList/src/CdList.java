import java.util.ArrayList;

public class CdList
{
  private ArrayList<Cd> cds;

  public CdList()
  {
    this.cds = new ArrayList<>();
  }

  public Cd getCd(int index)
  {
    return cds.get(index);
  }

  // I UML diagrammet står der at et CdList objekt skal returneres
  // indtil videre virker det ikke, så returnerer ny ArrayList i stedet
  public ArrayList<Cd> getCdsByTitle(String title)
  {
    ArrayList<Cd> cdsByTitle = new ArrayList<>();
    for (int i = 0; i < cds.size(); i++)
    {
      if (cds.get(i).getTitle().equals(title))
      {
        cdsByTitle.add(cds.get(i));
      }
    }
    return cdsByTitle;
  }

  public int getNumberOfCds()
  {
    return cds.size();
  }

  public void addCd(Cd cd)
  {
    cds.add(cd);
  }

  public void removeCdByIndex(int index)
  {
    cds.remove(index);
  }

  // Står til at returnere et Cd objekt efter et er fjernet på listen?
  // ændres til void for nu
  public void removeFirstCdByTitle(String title)
  {
    for (int i = 0; i < cds.size(); i++)
    {
      if (cds.get(i).getTitle().equals(title))
      {
        cds.remove(i);
        break;
      }
    }
  }

  // Måske forkert?
  public String toString()
  {
    String string = "";
    for (Cd cd : cds)
    {
      string += cd.toString() + ", ";
    }
    return string.substring(0, string.length() - 2);
  }

}
