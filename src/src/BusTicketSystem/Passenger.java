//Betul Eser & Seyma Sarcan
package BusTicketSystem;

public class Passenger {
	private String name;
	private String surname;
	private Gender gender;
	private int groupID;

	public Passenger(String name, String surname, Gender gender, int groupID) {
		this.name = name;
		this.surname = surname;
		this.gender = gender;
		this.groupID = groupID;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public Gender getGender() {
		return gender;
	}
	
	public int getGroupID() {
		return groupID;
	}

	@Override
	public String toString() {
		return "Passenger [name= " + name + ", surname= " + surname + ", gender= " + gender.genderSymbol() + "]";
	}

}
