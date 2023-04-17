package BusTicketSystem;

public class BusType2 extends Bus{

	public BusType2(String busType, String plateNumber, int numberOfSeats, Seat[][] seatLayout) {
		super(busType, plateNumber, numberOfSeats, seatLayout);
	}

	@Override
	public void createSeatLayout() {
		int count = 1;
		for (int i = 0; i < 12; i++) {
			for (int j = 3; j >= 0; j--) {
				if (i == 7 && (j == 1 || j == 0)) {
					this.seatLayout[j][i] = new Seat(0);
				} else {
					this.seatLayout[j][i] = new Seat(count++);
					if (j == 1) {
						this.seatLayout[j][i].setNextSeat(seatLayout[j - 1][i]);
					}
					if (j == 0) {
						this.seatLayout[j][i].setNextSeat(seatLayout[j + 1][i]);
					}
				}
			}
		}
		
	}
	
//againn
	public boolean checkSeat(Seat seat, Passenger passenger) {
		if (seat.isSeatFree() && seat.getNextSeat() == null) {
			seat.setTicket(seat.getSeatNumber(), passenger);
			System.out.println(seat.getTicket());
			return true;
		} else if (seat.isSeatFree() && seat.getNextSeat() != null && seat.getNextSeat().getTicket() == null) {
			seat.setTicket(seat.getSeatNumber(), passenger);
			System.out.println(seat.getTicket());
			return true;
		} else if (seat.isSeatFree() && seat.getNextSeat() != null) {
			if (passenger.getGroupID() == seat.getNextSeat().getTicket().getPassenger().getGroupID()) {
				seat.setTicket(seat.getSeatNumber(), passenger);
				System.out.println(seat.getTicket());
				return true;
			} else {
				if (seat.getNextSeat().getGender().haveSameGender(passenger)) {
					seat.setTicket(seat.getSeatNumber(), passenger);
					System.out.println(seat.getTicket());
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public void sellSeat(Passenger passenger, double rowReplacement) { 
		if (this.numberOfFreeSeats != this.numberOfSeats) {
			if (rowReplacement == 0) {
				for (int i = 0; i < 12; i++) {
					for (int j = 3; j >= 0; j--) {
						if (checkSeat(seatLayout[j][i], passenger)) {
							return;
						}
					}
				}
				System.out.println("There is no suitable seat for the " + passenger.toString());
			} else {
				if (rowReplacement < 0 || rowReplacement > 1) {
					System.out.println("Your rowReplacement value must be between 0 and 1.");
				} else {
					int row = (int) (12 * rowReplacement);
					for (int i = 3; i >= 0; i--) {
						Seat seat = seatLayout[i][row - 1];
						if (checkSeat(seat, passenger)) {
							return;
						}
					}
					if (checkNearestRow(row - 1, passenger, 1, true)) {
						return;
					} else {
						System.out.println("There is no suitable seat for the " + passenger.toString());
					}
				}
			}
		} else {
			System.out.println("There is no available seat!");
		}
	}


    @Override
	public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 12; i++) {
            for (int j = 3; j >= 0; j--) {
                if (seatLayout[j][i].getSeatNumber() == 0) {
                    continue;
                }
                if (seatLayout[j][i].isSeatFree()) {
                    if (seatLayout[j][i].getSeatNumber() < 10) {
                        sb.append("[ " + seatLayout[j][i].getSeatNumber() + "  ]");
                    } else {
                        sb.append("[ " + seatLayout[j][i].getSeatNumber() + " ]");
                    }
                } else {
                    sb.append("[ " + seatLayout[j][i].getGender().genderSymbol() + "  ]");
                }
                if (j == 2) {
                    sb.append("\t\t ");
                }
            }
            sb.append("\n");
        }
        return sb.toString();
    }

	@Override
	boolean checkNearestRow(int row, Passenger passenger, int count, boolean flag) {
		// TODO Auto-generated method stub
		return false;
	}



	

}
