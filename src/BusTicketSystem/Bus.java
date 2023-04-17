package BusTicketSystem;

public abstract class Bus {
	
	protected String busType;
	protected String plateNumber;
	protected int numberOfSeats;
	protected int numberOfFreeSeats;
	protected Seat[][] seatLayout;
	
	
	public Bus(String busType, String plateNumber, int numberOfSeats, Seat[][] seatLayout) {
		super();
		this.busType = busType;
		this.plateNumber = plateNumber;
		this.numberOfSeats = numberOfSeats;
		this.seatLayout = seatLayout;
	}

	public String getBusType() {
		return busType;
	}

	public String getPlateNumber() {
		return plateNumber;
	}

	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	public int getNumberOfFreeSeats() {
		numberOfFreeSeats = 0;
		for(Seat[] row: seatLayout) {
			for(Seat seat: row) {
				if(seat.getSeatNumber() != 0 && seat.isSeatFree()) {
					numberOfFreeSeats++;
				}
			}
		}
		return numberOfFreeSeats;
	}
	
	public void makeSeatFree(int seatNum) {
		for (Seat[] seats : seatLayout) {
			for (Seat seat : seats) {
				if (seat.getSeatNumber() == seatNum) {
					seat.setTicket(null);
					;
					return;
				}
			}
		}
		System.out.println("Invalid number!");

	}
	
	public void sellSeat(Passenger[] passengers, double rowReplacement) {
		if (this.numberOfFreeSeats != this.numberOfSeats) {
			for (Passenger passenger : passengers) {
				sellSeat(passenger, rowReplacement);
			}
		}
	}

	public Seat[][] getSeatLayout() {
		return seatLayout;
	}

	abstract void createSeatLayout();
	abstract void sellSeat(Passenger passenger, double rowReplacement);	
	public abstract String toString();
	abstract boolean checkNearestRow(int row, Passenger passenger, int count, boolean flag);
	abstract boolean checkSeat(Seat seat, Passenger passenger);


	
	
}
