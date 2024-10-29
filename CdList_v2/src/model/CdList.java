package model;

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

  public CdList getCdsByTitle(String title)
  {
    CdList cdsByTitle = new CdList();
    for (Cd cd : cds)
    {
      if (cd.getTitle().equals(title))
      {
        cdsByTitle.addCd(cd);
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
  public Cd removeFirstCdByTitle(String title)
  {
    for (int i = 0; i < cds.size(); i++)
    {
      if (cds.get(i).getTitle().equals(title))
      {
        return cds.remove(i);
      }
    }
    return null;
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
