public class Cd
{
  private String title;
  private String artist;
  private Song[] songs;

  public Cd(String title, String artist, Song[] songs)
  {
    this.title = title;
    this.artist = artist;
    this.songs = songs;
  }

  public String getTitle()
  {
    return title;
  }

  public String getArtist()
  {
    return artist;
  }

  public Time getLength()
  {
    int lengthInSeconds = 0;
    for (int i = 0; i < songs.length; i++)
    {
      lengthInSeconds += songs[i].getLength().getTimeInSeconds();
    }
    Time length = new Time(lengthInSeconds);
    return length;
  }

  public Song getSong(int index)
  {
    return songs[index];
  }

  public int getNumberOfSongs()
  {
    return songs.length;
  }

  public String toString()
  {
    return "'" + title + "' by " + artist;
  }

}
