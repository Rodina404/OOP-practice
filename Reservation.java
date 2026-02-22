import java.util.ArrayList;

public class Reservation {
    // Use ArrayList instead of a fixed-size array
    private ArrayList<String> passengerNames;

    public Reservation() {
        this.passengerNames = new ArrayList<>();
    }

    public void bookSeat(Flight flight, String passengerName) {
        if (flight.hasAvailableSeats()) {
            flight.setAvailableSeats(flight.getAvailableSeats() - 1);
            // .add() automatically handles the resizing for you
            passengerNames.add(passengerName); 
            System.out.println("Seat booked for " + passengerName + " on flight " + flight.getFlightNumber());
        } else {
            System.out.println("Flight " + flight.getFlightNumber() + " is full");
        }
    }

    public void cancelBooking(Flight flight, String passengerName) {
        // Check if the passenger actually has a booking in THIS reservation
        if (passengerNames.contains(passengerName)) {
            flight.setAvailableSeats(flight.getAvailableSeats() + 1);
            passengerNames.remove(passengerName);
            System.out.println("Booking cancelled for " + passengerName);
        } else {
            System.out.println(passengerName + " not found in this reservation.");
        }
    }

    public void displayPassengers(Flight flight) {
        if (passengerNames.isEmpty()) {
            System.out.println("No passengers in this reservation.");
        } else {
            System.out.println("Flight Details: \n"+"Flight Number: "+flight.getFlightNumber()+"\nDestination: "+flight.getDestination()+"\nTotal Seats: "+flight.getTotalSeats()+"\nAvailable Seats: "+flight.getAvailableSeats());
            // Print the Numbered Passenger List
            System.out.println("\nPassengers:");
            for (int i = 0; i < passengerNames.size(); i++) {
                // (i + 1) ensures we start counting at 1 instead of 0
                System.out.println((i + 1) + ". " + passengerNames.get(i));
            }
        }
    }
}