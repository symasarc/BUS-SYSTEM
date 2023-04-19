//Betul Eser & Seyma Sarcan
package BusTicketSystem;

public class Ticket {
	    //private Bus bus;
		private Passenger passenger;
		private int seatNum;
		private double price = 200;
		
		public Ticket(int seat, Passenger passenger) {
	        this.seatNum = seat;
	        this.passenger = passenger;
		}

		public Passenger getPassenger() {
			return passenger;
		}
		
		/*public double getPrice() {
			if(bus.getBusType()=="Luxury")
				price=500.0;
			else if(bus.getBusType()=="Classic")
				price=200.0;
			else
				System.out.println("Bus type is invalid!");
			return price;
		}*/
		
		

		@Override
		public String toString() {
			return "Ticket [seat= " + seatNum + ", " + passenger.toString() + " Price= " + this.price + "]";
		}
		
	}


