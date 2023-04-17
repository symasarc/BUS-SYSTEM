import BusTicketSystem.*;

public class Test {
	
	public static void main(String[] args) {
		//Passengers
		Passenger passenger = new Passenger("Ahmet", "Top", Gender.MALE,1);	
		Passenger passenger2 = new Passenger("Esad", "Top", Gender.MALE, 1);
		Passenger passenger3 = new Passenger("Ahmet", "Demir", Gender.MALE, 2);
		Passenger passenger4 = new Passenger("Selen", "Bakir", Gender.FEMALE, 2);
		Passenger passenger5 = new Passenger("Ersin", "Milenyum", Gender.MALE, 2);
		Passenger passenger6 = new Passenger("Aylin", "Gümüs", Gender.FEMALE, 2);
		Passenger passenger7 = new Passenger("Aras", "Yek", Gender.MALE,2);
		Passenger passenger8 = new Passenger("Arda", "Demir", Gender.MALE, 2);
		Passenger passenger9 = new Passenger("Yusuf", "Gunaydin", Gender.MALE,1);
		Passenger passenger10 = new Passenger("Sevki", "Gunaydin", Gender.MALE, 1);
		Passenger passenger11 = new Passenger("Nisa", "Mercimek", Gender.FEMALE, 1);
		Passenger passenger12 = new Passenger("Nur", "Muhurdaroglu", Gender.FEMALE, 1);
		Passenger passenger13= new Passenger("Fatih", "Nar", Gender.MALE,1);
		Passenger passenger14 = new Passenger("Elif", "Sanlıalp", Gender.FEMALE, 1);
		Passenger passenger15= new Passenger("Osman", "Gedik", Gender.MALE,3);
		Passenger passenger16 = new Passenger("Ali", "Yilmaz", Gender.MALE,4);	
		Passenger passenger17 = new Passenger("Serdar", "Gedik", Gender.MALE, 8);
		Passenger passenger18 = new Passenger("Fatih", "Demirci", Gender.MALE, 8);
		Passenger passenger19 = new Passenger("Fatma", "Kucuk", Gender.FEMALE, 8);
		Passenger passenger20 = new Passenger("Abdullah", "Bulbul", Gender.MALE, 8);
		Passenger passenger21 = new Passenger("Fahreddin", "Torun", Gender.MALE, 8);
		Passenger passenger22= new Passenger("Sukru", "Torun", Gender.MALE,8);
		Passenger passenger23= new Passenger("Betul", "Eser", Gender.FEMALE, 13);
		Passenger passenger24= new Passenger("Seyma", "Sarcan", Gender.FEMALE,13);
		Passenger passenger25 = new Passenger("Evren", "Aykac", Gender.MALE, 8);
		Passenger passenger26= new Passenger("Yusuf", "Aykac", Gender.MALE, 8);
		Passenger passenger27 = new Passenger("Simge", "Kaplan", Gender.FEMALE, 13);
		Passenger passenger28= new Passenger("Hellin", "Ozyurt", Gender.FEMALE,13);
		Passenger passenger29 = new Passenger("Beyza", "Sumer", Gender.FEMALE, 13);
		Passenger passenger30= new Passenger("Elif", "Erdogdu", Gender.FEMALE,13);
		Passenger passenger31 = new Passenger("Gulnihal", "Meral", Gender.FEMALE,8);	
		Passenger passenger32 = new Passenger("Sevda", "Gur", Gender.FEMALE, 18);
		Passenger passenger33 = new Passenger("Fadi", "Yilmaz", Gender.MALE, 8);
		Passenger passenger34 = new Passenger("Remzi", "Yildirim", Gender.MALE, 8);
		Passenger passenger35 = new Passenger("Ezgi", "Yildiz", Gender.FEMALE, 13);
		Passenger passenger36 = new Passenger("Merve", "Aykul", Gender.FEMALE, 13);
		Passenger passenger37= new Passenger("Furkan", "Erdem", Gender.MALE,13);
		Passenger passenger38= new Passenger("Cagri", "Cal", Gender.MALE, 13);
		Passenger passenger39= new Passenger("Tolga", "Gulbahar", Gender.MALE,13);
		Passenger passenger40 = new Passenger("Bera", "Demir", Gender.MALE, 13);
		Passenger passenger41 = new Passenger("Sera", "Ak", Gender.FEMALE, 13);
		Passenger passenger42 = new Passenger("Seray", "Kara", Gender.FEMALE, 5);
		
		//Buses
		BusType1 bus1 = new BusType1("Single", "06 ANK 5214", 40, new Seat[3][14]);
		BusType2 bus2 = new BusType2("Double", "11 BLC 9380", 46, new Seat[4][12]);
		//SeatLayout Printed
		System.out.println("Single Bus: ");
		System.out.println();
		System.out.println(bus1.toString());
		System.out.println();
		System.out.println("Double Bus: ");
		System.out.println();
		System.out.println(bus2.toString());
		System.out.println();
		
		
		Passenger[] group1 = {passenger, passenger2, passenger9, passenger10, passenger11,passenger12, passenger13, passenger14};
		bus1.sellSeat(group1, 0);
		System.out.println("Sale Completed for group1!");
		System.out.println(bus1.toString());
		
		Passenger[] group2 = {passenger3, passenger4, passenger5, passenger6, passenger7,passenger8};
		bus1.sellSeat(group2, 0.5);
		System.out.println("Sale Completed for group2!");
		System.out.println(bus1.toString());
		
		bus1.sellSeat(passenger15, 0.3);
		System.out.println("Sale Completed for Male passenger15!");
		System.out.println(bus1.toString());
		
		bus1.sellSeat(passenger16, 0.3);
		System.out.println("Sale Completed for Male passenger16!");
		System.out.println(bus1.toString());
		
		bus1.sellSeat(passenger32, 0.3);
		System.out.println("Sale Completed for Female passenger32!");
		System.out.println(bus1.toString());

		int[] makeFreeList = {3, 12, 13};
		bus1.makeSeatFree(makeFreeList);
		System.out.println("Make free: ");
		System.out.println(bus1.toString());
		
        Passenger[] group3= {passenger17, passenger18, passenger19, passenger20, passenger21, passenger22, passenger25, passenger26, passenger31,passenger33,passenger34};
		bus1.sellSeat(group3, 1);
		System.out.println("Sale Completed for group3!");
		System.out.println(bus1.toString());
		
        Passenger[] group4 = {passenger23, passenger24,passenger27, passenger28, passenger29, passenger30, passenger35, passenger36, passenger37,passenger38, passenger39, passenger40, passenger41};
		bus1.sellSeat(group4, 0);
		System.out.println("Sale after group4!");
		System.out.println(bus1.toString());
		
		bus1.sellSeat(passenger42, 0.3);
		System.out.println("Sale after passenger42!");
		System.out.println(bus1.toString());
//        bus1.makeAllFree();
//        System.out.println(bus1.toString());

}
}
