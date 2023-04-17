import BusTicketSystem.*;

public class Test {
	
	public static void main(String[] args) {
		Passenger passenger = new Passenger("Ali1", "Yılmaz", Gender.MALE,3);	
		Passenger passenger2 = new Passenger("Ayşe2", "Demir", Gender.FEMALE, 3);
		Passenger passenger3 = new Passenger("Ahmet3", "Demir", Gender.MALE, 3);
		Passenger passenger4 = new Passenger("Selen4", "Demir", Gender.FEMALE, 3);
		Passenger passenger5 = new Passenger("ersin5", "Demir", Gender.MALE, 3);
		Passenger passenger6 = new Passenger("Aylin6", "Demir", Gender.FEMALE, 3);
		Passenger passenger7 = new Passenger("Aras7", "Yek", Gender.MALE,3);
		
		BusType1 bus1 = new BusType1("Single", "06 ANK 5214", 40, new Seat[3][14]);
		BusType2 bus2 = new BusType2("Double", "11 BLC 9380", 46, new Seat[4][12]);
		
		bus1.createSeatLayout();
		System.out.println(bus1.toString());
		System.out.println();
		bus2.createSeatLayout();
	
		System.out.println(bus1.getSeatLayout()[0][3].getSeatNumber());
		System.out.println(bus1.getSeatLayout()[0][3].isSeatFree());
		bus1.getSeatLayout()[0][3].setTicket(12, passenger);
		System.out.println(bus1.getSeatLayout()[0][3].isSeatFree());
		System.out.println(bus1.getSeatLayout()[0][3].getGender());
		System.out.println(bus1.getSeatLayout()[0][3].getTicket());
		
		System.out.println(bus1.getSeatLayout()[1][3].setTicket(11, passenger2));
		System.out.println(bus1.getSeatLayout()[1][3].getGender().haveSameGender(passenger2));
		System.out.println(bus1.getSeatLayout()[0][3].getGender().haveSameGender(passenger2));
		System.out.println(bus1.getSeatLayout()[0][3].getNextSeat().getSeatNumber());
		bus1.makeSeatFree(11);
		System.out.println(bus1.getSeatLayout()[1][3].getSeatNumber());
		System.out.println(bus1.getSeatLayout()[1][3].isSeatFree());
//		bus1.sellSeat(passenger, 0);
//		Passenger[] passengerArr = {};
//		bus1.sellSeat(passengerArr, 0);
		System.out.println(bus1.toString());
		Passenger[] passengerArr1 = {passenger, passenger4, passenger5, passenger6, passenger7,passenger2, passenger3};
		bus1.sellSeat(passengerArr1, 0.8);
		System.out.println(bus1.toString());
	}
}
