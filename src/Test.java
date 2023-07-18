import BusTicketSystem.*;

public class Test {

	public static void main(String[] args) {
		// Passengers
		Passenger passenger = new Passenger("Ahmet", "Top", Gender.MALE, 1);
		Passenger passenger2 = new Passenger("Esad", "Top", Gender.MALE, 1);
		Passenger passenger3 = new Passenger("Ahmet", "Demir", Gender.MALE, 2);
		Passenger passenger4 = new Passenger("Selen", "Bakir", Gender.FEMALE, 2);
		Passenger passenger5 = new Passenger("Ersin", "Milenyum", Gender.MALE, 2);
		Passenger passenger6 = new Passenger("Aylin", "Gümüs", Gender.FEMALE, 2);
		Passenger passenger7 = new Passenger("Aras", "Yek", Gender.MALE, 2);
		Passenger passenger8 = new Passenger("Arda", "Demir", Gender.MALE, 2);
		Passenger passenger9 = new Passenger("Yusuf", "Gunaydin", Gender.MALE, 1);
		Passenger passenger10 = new Passenger("Sevki", "Gunaydin", Gender.MALE, 1);
		Passenger passenger11 = new Passenger("Nisa", "Mercimek", Gender.FEMALE, 1);
		Passenger passenger12 = new Passenger("Nur", "Muhurdaroglu", Gender.FEMALE, 1);
		Passenger passenger13 = new Passenger("Fatih", "Nar", Gender.MALE, 1);
		Passenger passenger14 = new Passenger("Elif", "Sanlialp", Gender.FEMALE, 1);
		Passenger passenger15 = new Passenger("Osman", "Gedik", Gender.MALE, 3);
		Passenger passenger16 = new Passenger("Ali", "Yilmaz", Gender.MALE, 4);
		Passenger passenger17 = new Passenger("Serdar", "Gedik", Gender.MALE, 8);
		Passenger passenger18 = new Passenger("Fatih", "Demirci", Gender.MALE, 8);
		Passenger passenger19 = new Passenger("Fatma", "Kucuk", Gender.FEMALE, 8);
		Passenger passenger20 = new Passenger("Abdullah", "Bulbul", Gender.MALE, 8);
		Passenger passenger21 = new Passenger("Fahreddin", "Torun", Gender.MALE, 8);
		Passenger passenger22 = new Passenger("Sukru", "Torun", Gender.MALE, 8);
		Passenger passenger23 = new Passenger("Betul", "Eser", Gender.FEMALE, 13);
		Passenger passenger24 = new Passenger("Seyma", "Sarcan", Gender.FEMALE, 13);
		Passenger passenger25 = new Passenger("Evren", "Aykac", Gender.MALE, 8);
		Passenger passenger26 = new Passenger("Yusuf", "Aykac", Gender.MALE, 8);
		Passenger passenger27 = new Passenger("Simge", "Kaplan", Gender.FEMALE, 13);
		Passenger passenger28 = new Passenger("Hellin", "Ozyurt", Gender.FEMALE, 13);
		Passenger passenger29 = new Passenger("Beyza", "Sumer", Gender.FEMALE, 13);
		Passenger passenger30 = new Passenger("Elif", "Erdogdu", Gender.FEMALE, 13);
		Passenger passenger31 = new Passenger("Gulnihal", "Meral", Gender.FEMALE, 8);
		Passenger passenger32 = new Passenger("Sevda", "Gur", Gender.FEMALE, 18);
		Passenger passenger33 = new Passenger("Fadi", "Yilmaz", Gender.MALE, 8);
		Passenger passenger34 = new Passenger("Remzi", "Yildirim", Gender.MALE, 8);
		Passenger passenger35 = new Passenger("Ezgi", "Yildiz", Gender.FEMALE, 13);
		Passenger passenger36 = new Passenger("Merve", "Aykul", Gender.FEMALE, 13);
		Passenger passenger37 = new Passenger("Furkan", "Erdem", Gender.MALE, 13);
		Passenger passenger38 = new Passenger("Cagri", "Cal", Gender.MALE, 13);
		Passenger passenger39 = new Passenger("Tolga", "Gulbahar", Gender.MALE, 13);
		Passenger passenger40 = new Passenger("Bera", "Demir", Gender.MALE, 13);
		Passenger passenger41 = new Passenger("Sera", "Ak", Gender.FEMALE, 13);
		Passenger passenger42 = new Passenger("Seray", "Kara", Gender.FEMALE, 5);
		Passenger passenger43 = new Passenger("Eray", "Kara", Gender.MALE, 6);
		Passenger passenger44 = new Passenger("Sadi", "Yilmaz", Gender.MALE, 8);
		Passenger passenger45 = new Passenger("Burhan", "Yildirim", Gender.MALE, 7);
		Passenger passenger46 = new Passenger("Melek", "Yildiz", Gender.FEMALE, 7);
		Passenger passenger47 = new Passenger("Melodi", "Aykul", Gender.FEMALE, 7);
		Passenger passenger48 = new Passenger("Sinan", "Erdem", Gender.MALE, 7);
		Passenger passenger49 = new Passenger("Can", "Cal", Gender.MALE, 7);
		Passenger passenger50 = new Passenger("Timur", "Gulbahar", Gender.MALE, 7);
		Passenger passenger51 = new Passenger("Timur", "Gulbahar", Gender.MALE, 7);

		// Buses
		BusType1 bus1 = new BusType1("Luxury", "06 ANK 5214", 40, new Seat[3][14]);
		BusType2 bus2 = new BusType2("Classic", "11 BLC 9380", 46, new Seat[4][12]);

		// SeatLayout Printed
		System.out.println("Luxury Bus: ");
		System.out.println();
		System.out.println(bus1.toString());
		System.out.println();
		System.out.println("Classic Bus: ");
		System.out.println();
		System.out.println(bus2.toString());
		System.out.println();

		Passenger[] group1 = { passenger, passenger2, passenger9, passenger10, passenger11, passenger12, passenger13,
				passenger14 };
		System.out.println("Group1");
		bus1.sellSeat(group1, 0);
		System.out.println();
		System.out.println("Sale Completed for Group1: ");
		System.out.println();
		System.out.println(bus1.toString());

		Passenger[] group2 = { passenger3, passenger4, passenger5, passenger6, passenger7, passenger8 };
		System.out.println("Group2");
		bus1.sellSeat(group2, 0.5);
		System.out.println();
		System.out.println("Sale Completed for Group2: ");
		System.out.println();
		System.out.println(bus1.toString());

		bus1.sellSeat(passenger15, 0.3);
		System.out.println();
		System.out.println("Sale Completed for " + passenger15.toString() + ": ");
		System.out.println();
		System.out.println(bus1.toString());

		bus1.sellSeat(passenger16, 0.3);
		System.out.println();
		System.out.println("Sale Completed for " + passenger16.toString() + ": ");
		System.out.println();
		System.out.println(bus1.toString());

		bus1.sellSeat(passenger32, 0.3);
		System.out.println();
		System.out.println("Sale Completed for " + passenger32.toString() + ": ");
		System.out.println();
		System.out.println(bus1.toString());

		int[] makeFreeList = { 3, 11 };
		bus1.makeSeatFree(makeFreeList);
		System.out.println();
		System.out.println("Make free(3, 11): ");
		System.out.println();
		System.out.println(bus1.toString());

		Passenger[] group3 = { passenger17, passenger18, passenger19, passenger20, passenger21, passenger22,
				passenger25, passenger26, passenger31, passenger33, passenger34 };
		System.out.println("Group3");
		bus1.sellSeat(group3, 1);
		System.out.println();
		System.out.println("Sale Completed for Group3: ");
		System.out.println();
		System.out.println(bus1.toString());

		Passenger[] group4 = { passenger23, passenger24, passenger27, passenger28, passenger29, passenger30,
				passenger35, passenger36, passenger37, passenger38, passenger39, passenger40, passenger41 };
		System.out.println("Group4");
		bus1.sellSeat(group4, 0);
		System.out.println();
		System.out.println("Sale after Group4: ");
		System.out.println();
		System.out.println(bus1.toString());

		bus1.sellSeat(passenger42, 0.8);
		System.out.println();
		System.out.println("Sale after " + passenger42.toString() + ": ");
		System.out.println();
		System.out.println(bus1.toString());

		bus1.sellSeat(passenger43, 0.5);
		System.out.println();
		System.out.println("Sale after " + passenger43.toString() + ": ");
		System.out.println();
		System.out.println(bus1.toString());

		bus1.sellSeat(passenger44, 0.9);
		System.out.println();
		System.out.println("Sale after " + passenger44.toString() + ": ");
		System.out.println();
		System.out.println(bus1.toString());

		bus1.makeAllFree();
		System.out.println("Make All Free: ");
		System.out.println();
		System.out.println(bus1.toString());

		System.out.println("Group1");
		bus2.sellSeat(group1, 0);
		System.out.println();
		System.out.println("Sale Completed for Group1: ");
		System.out.println();
		System.out.println(bus2.toString());

		System.out.println("Group2");
		bus2.sellSeat(group2, 0.5);
		System.out.println();
		System.out.println("Sale Completed for Group2: ");
		System.out.println();
		System.out.println(bus2.toString());

		bus2.sellSeat(passenger15, 0.35);
		System.out.println();
		System.out.println("Sale Completed for " + passenger15.toString() + ": ");
		System.out.println();
		System.out.println(bus2.toString());

		bus2.sellSeat(passenger32, 0.35);
		System.out.println();
		System.out.println("Sale Completed for " + passenger32.toString() + ": ");
		System.out.println();
		System.out.println(bus2.toString());

		bus2.sellSeat(passenger16, 0.35);
		System.out.println();
		System.out.println("Sale Completed for " + passenger16.toString() + ": ");
		System.out.println();
		System.out.println(bus2.toString());

		int[] makeFreeList2 = { 3, 12, 13 };
		bus2.makeSeatFree(makeFreeList2);
		System.out.println();
		System.out.println("Make free(3, 12, 13): ");
		System.out.println();
		System.out.println(bus2.toString());

		System.out.println("Group3");
		bus2.sellSeat(group3, 1);
		System.out.println();
		System.out.println("Sale Completed for Group3: ");
		System.out.println();
		System.out.println(bus2.toString());

		System.out.println("Group4");
		bus2.sellSeat(group4, 0);
		System.out.println();
		System.out.println("Sale after Group4: ");
		System.out.println();
		System.out.println(bus2.toString());

		bus2.sellSeat(passenger42, 0.8);
		System.out.println();
		System.out.println("Sale after " + passenger42.toString() + ": ");
		System.out.println();
		System.out.println(bus2.toString());

		bus2.sellSeat(passenger43, 0.7);
		System.out.println();
		System.out.println("Sale after " + passenger43.toString() + ": ");
		System.out.println();
		System.out.println(bus2.toString());

		Passenger[] group5 = { passenger44, passenger45, passenger46, passenger47, passenger48, passenger49,
				passenger50 };
		System.out.println("Group5");
		bus2.sellSeat(group5, 0.6);
		System.out.println();
		System.out.println("Sale Completed for Group5: ");
		System.out.println();
		System.out.println(bus2.toString());

		bus2.makeAllFree();
		System.out.println("Make All Free: ");
		System.out.println();
		System.out.println(bus2.toString());
	}
}
