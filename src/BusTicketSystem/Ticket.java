package BusTicketSystem;

public class Ticket {
	private int seatNum;
	private Passenger passenger;
	private double price = 200;
	
	public Ticket(int seat, Passenger passenger) {
        this.seatNum = seat;
        this.passenger = passenger;
	}

	public Passenger getPassenger() {
		return passenger;
	}
	
	@Override
	public String toString() {
		return "Ticket [seat=" + seatNum + ", " + passenger.toString() + " Price= " + this.price + "]";
	}
	
}
