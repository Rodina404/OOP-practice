package assignment2;
public class Main {
    public static void main(String[] args) {
        Flight flight1 = new Flight("EK201", "Dubai", 100);
        
        // Create ONE reservation manager for this flight
        Reservation system = new Reservation();

        system.bookSeat(flight1, "Zaid");
        System.out.println();
        system.bookSeat(flight1, "Rou");
        System.out.println();
        system.bookSeat(flight1, "Ayoyo");
        System.out.println();
        
        system.displayPassengers(flight1); // Displays all three
        
        system.cancelBooking(flight1, "Rou");
        system.displayPassengers(flight1); // "Rou" is now gone
    }
}