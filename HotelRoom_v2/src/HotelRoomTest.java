public class HotelRoomTest
{
  public static void main(String[] args)
  {
    Guest guest1 = new Guest("Rasmus Duus", 30439697);

    HotelRoom room1 = new HotelRoom(666, "Double");

    System.out.println("V2");
    System.out.println();

    System.out.println(room1.toString());
    System.out.println();

    room1.registerGuest(guest1);

    System.out.println(room1.toString());
    System.out.println();

    System.out.println("Floor: " + room1.getFloor());
    System.out.println();

    System.out.println("Price for room type " + room1.getType() + ": "
        + HotelRoom.getRoomPrice(room1.getType()));
    System.out.println();

    System.out.println("Price for single: " + HotelRoom.getRoomPrice("Single"));
    System.out.println("Price for family: " + HotelRoom.getRoomPrice("Family"));

  }
}
