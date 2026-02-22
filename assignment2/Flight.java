package assignment2;
public class Flight {
    private String flightNumber;
    private String destination;
    private int availableSeats;
    private int totalSeats;

    public Flight(String flightNumber, String destination, int totalSeats) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.totalSeats = totalSeats;
        this.availableSeats = totalSeats;
    }

    
    public String getFlightNumber() {
        return flightNumber;
    }



    public String getDestination() {
        return destination;
    }



    public boolean hasAvailableSeats() {
        return availableSeats > 0;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public int getTotalSeats() {
        return totalSeats;
    }





    @Override
    public String toString() {
        return "Flight " + flightNumber + ":  -> " + destination + 
               " | Seats: " + availableSeats + "/" + totalSeats;
    }
}
