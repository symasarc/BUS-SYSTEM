package BusTicketSystem;

public enum Gender {
	MALE, FEMALE;

	String genderSymbol() {
		switch (this) {
		case MALE: {
			return "M";
		}
		case FEMALE: {
			return "F";
		}
		default:
			return " ";
		}
	}

	public boolean haveSameGender(Passenger passenger) {
		return this == passenger.getGender();
	}
}



