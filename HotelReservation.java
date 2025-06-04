import java.util.*;

public class HotelReservation
{
	private static Map<Integer, Boolean> rooms = new HashMap<>();
	
	private static void viewAvailableRooms() {
        System.out.println("\nAvailable Rooms:");
        for (Map.Entry<Integer, Boolean> entry : rooms.entrySet()) {
            if (entry.getValue()) {
                System.out.println("Room " + entry.getKey());
            }
        }
    }
}

class Reservation
{
	
}