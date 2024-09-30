public class HotelTest
{
  public static void main(String[] args)
  {
    HotelRoom[] rooms = new HotelRoom[4];
    rooms[0] = new HotelRoom(100, HotelRoom.SINGLE);
    rooms[1] = new HotelRoom(201, HotelRoom.DOUBLE);
    rooms[2] = new HotelRoom(202, HotelRoom.SINGLE);
    rooms[3] = new HotelRoom(607, HotelRoom.FAMILY);

    Hotel mitHotel = new Hotel("Mit Hotel", rooms);

  }
}
