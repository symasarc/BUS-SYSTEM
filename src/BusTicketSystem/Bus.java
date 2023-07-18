package BusTicketSystem;

public abstract class Bus {

	protected String busType;
	protected String plateNumber;
	protected int numberOfSeats;
	protected int numberOfFreeSeats;
	protected Seat[][] seatLayout;

	public Bus(String busType, String plateNumber, int numberOfSeats, Seat[][] seatLayout) {
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
		for (Seat[] row : seatLayout) {
			for (Seat seat : row) {
				if (seat.getSeatNumber() != 0 && seat.isSeatFree()) {
					numberOfFreeSeats++;
				}
			}
		}
		return numberOfFreeSeats;
	}

	public void makeSeatFree(int seatNum) { // For single passenger
		if (seatNum < 1 || seatNum > numberOfSeats) {
			System.out.println("Invalid number!");
		} else {
			for (Seat[] seats : seatLayout) {
				for (Seat seat : seats) {
					if (seat.getSeatNumber() == seatNum) {
						seat.setTicket(null);
						;
						return;
					}
				}
			}
		}
	}

	public void makeSeatFree(int[] seatNums) { // For multiple passengers
		for (int seatNum : seatNums) {
			makeSeatFree(seatNum);
		}
	}

	public void makeAllFree() {
		for (Seat[] seats : seatLayout) {
			for (Seat seat : seats) {
				if (!seat.isSeatFree()) {
					seat.setTicket(null);
				}
			}
		}
	}

	public void sellSeat(Passenger[] passengers, double rowReplacement) { // Selling multiple seat
		for (Passenger passenger : passengers) {
			sellSeat(passenger, rowReplacement);
		}
	}

	public Seat[][] getSeatLayout() {
		return seatLayout;
	}

	abstract void createSeatLayout();

	abstract boolean checkSeat(Seat seat, Passenger passenger);

	abstract boolean checkRow(int row, Passenger passenger, int count);

	abstract void sellSeat(Passenger passenger, double rowReplacement);

}
