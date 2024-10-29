package model;

public class CdModelManager implements CdModel
{
  private CdList cds;

  public CdModelManager()
  {
    cds = new CdList();
  }

  @Override public Cd getCd(int index)
  {
    return cds.getCd(index);
  }

  @Override public CdList getCdsByTitle(String title)
  {
    return cds.getCdsByTitle(title);
  }

  @Override public int getNumberOfCds()
  {
    return cds.getNumberOfCds();
  }

  @Override public void addCd(Cd cd)
  {
    cds.addCd(cd);
  }

  @Override public Cd removeFirstCdByTitle(String title)
  {
    return cds.removeFirstCdByTitle(title);
  }

  @Override public void clear()
  {
    cds = new CdList();
  }
}
