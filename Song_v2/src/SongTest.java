public class SongTest
{
  public static void main(String[] args)
  {
    int hour;
    int minute;
    int second;

    Time length = new Time(193);

    length.set(0,3,44);

    length.setTimeInSeconds(194);

    Song song1 = new Song("Call Me Maybe", "Carly Rae Jepsen", length);

    System.out.println("Title: " + song1.getTitle());
    System.out.println();

    System.out.println("Artist: " + song1.getArtist());
    System.out.println();

    System.out.println("Length: " + song1.getLength());
    System.out.println();

    System.out.println(song1.toString());
  }
}
