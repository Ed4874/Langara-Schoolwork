import java.util.ArrayList;
import java.awt.Color;
/**
 * Builds a house and computes the area of the house by adding up the areas
 * of the rooms.
 */
public class House {
    /**
     * Build a house with 6 rooms (5 bedrooms and 2 kitchens) and calculate
     * the area of the house by calculating the area of the rooms: when
     * calculating the area, something could go wrong so an error message
     * is printed and that room's area is ignored.
     * @param args line arguments -- ignored
     */
    public static void main(String args[]) {

        ArrayList<Room> house = buildHouse( );

        // calculate the area of the house which is the sum of tiny rooms
        int houseArea = 0;
        int tinyRooms = 0;
        Room aRoom;
        for (Room room : house) {
            try {
                int area = room.getArea();
                System.out.println("area = " + area + " for " + room);
                houseArea += area;
            }
            catch (Exception e) {
                System.out.print("\ncould not get area of " + room + " because ");
                System.out.println(e.getMessage() + "\n");
                tinyRooms++;
            }
        }
        System.out.print("house area = " + houseArea);
        if (tinyRooms > 0) {
            System.out.print(" but at least " + tinyRooms + " were faulty");
        }
        System.out.println("\n");


        for (int i = 1; i < house.size(); i++) {
            aRoom = house.get(i-1);
            if (aRoom.equals(house.get(i)))
                System.out.println(aRoom + " same as " + house.get(i));
            else
                System.out.println(aRoom + "is different from " + house.get(i));
        }

        if(house.get(0).equals(house.get(house.size()-1)))
            System.out.println("The first room and the last room in the house are the same");
        else
            System.out.println("The first room and the last room in the house are different");

    }

    /**
     * Builds the house with 5 bedrooms and 2 kitchens.
     * @return a list of rooms (comprising a house)
     */
    public static ArrayList<Room> buildHouse() {
        Room aRoom;
        ArrayList<Room> rooms = new ArrayList<Room>();
        aRoom = new Bedroom(true);
        aRoom.setColor(Color.BLUE);
        rooms.add(aRoom);
        rooms.add(new Bedroom(true));
        rooms.add(new Bedroom(false));
        rooms.add(new Bedroom(false));

        rooms.add(new Kitchen(6, 6));
        rooms.add(new Kitchen(2, 3));

        aRoom = new Bedroom(true);
        aRoom.setColor(Color.BLUE);
        rooms.add(aRoom);
        return rooms;
    }
}
