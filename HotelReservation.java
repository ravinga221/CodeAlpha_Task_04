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
	
	private static void makeReservation() 
	{
        System.out.print("\nEnter room number: ");
        int roomNumber = scanner.nextInt();
        scanner.nextLine(); 

        if (!rooms.containsKey(roomNumber))
		{
            System.out.println("Invalid room number.");
            return;
        }

        if (!rooms.get(roomNumber)) 
		{
            System.out.println("Room " + roomNumber + " is already booked.");
            return;
        }

        System.out.print("Enter guest name: ");
        String guestName = scanner.nextLine();


        System.out.print("Enter number of nights: ");
        int nights = scanner.nextInt();
        scanner.nextLine(); 

        double price = nights * 100.0;

        
        rooms.put(roomNumber, false);

        
        Reservation reservation = new Reservation(
            nextReservationId++,
            guestName,
            roomNumber,
            nights,
            price
        );

        reservations.add(reservation);

        System.out.println("\nReservation successful!");
        System.out.println("Reservation ID: " + reservation.id);
        System.out.println("Total price: $" + reservation.price);
    }
	
	private static void viewReservations() 
	{
        if (reservations.isEmpty()) 
		{
            System.out.println("\nNo reservations found.");
            return;
        }

        System.out.println("\nAll Reservations:");
        for (Reservation r : reservations) {
            System.out.println("ID: " + r.id);
            System.out.println("Guest: " + r.guestName);
            System.out.println("Room: " + r.roomNumber);
            System.out.println("Nights: " + r.nights);
            System.out.println("Price: $" + r.price);
            System.out.println("-------------------");
        }
    }
}

class Reservation
{
	int id;
    String guestName;
    int roomNumber;
    int nights;
    double price;
	
	public Reservation(int id, String guestName, int roomNumber, int nights, double price)
	{
		this.id = id;
        this.guestName = guestName;
        this.roomNumber = roomNumber;
        this.nights = nights;
        this.price = price;
	}
}