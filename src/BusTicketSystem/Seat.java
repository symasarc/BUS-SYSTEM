//Seyma Sarcan & Betul Eser
package BusTicketSystem;

public class Seat {
	private int seatNumber;
	private Seat nextSeat;
	private Ticket ticket;

	public Seat(int seatNumber) {
		this.seatNumber = seatNumber;
	}

	public int getSeatNumber() {
		return seatNumber;
	}

	public Ticket setTicket(int seatNum, Passenger passenger) {
		this.ticket = new Ticket(seatNum, passenger);
		return this.ticket;
	}
	
	public Ticket setTicket(Ticket ticket) {
		this.ticket = ticket;
		return this.ticket;
	}
	

	public Seat getNextSeat() {
		return nextSeat;
	}

	public void setNextSeat(Seat nextSeat) {
		this.nextSeat = nextSeat;
	}

	public Ticket getTicket() {
		return ticket;
	}

	public boolean isSeatFree() {
		return this.seatNumber !=0 && this.ticket == null;
	}

	public Gender getGender() {
		return ticket.getPassenger().getGender();
	}
	
}
