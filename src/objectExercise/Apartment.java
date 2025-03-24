package objectExercise;

public class Apartment extends Property {
	private String arrangementOfRooms;
	
	Apartment(String propertyName, String owner, String classification, String prices, String arrangementOfRooms){
		super(propertyName, owner, classification, prices);
		this.arrangementOfRooms = arrangementOfRooms;
	}
	
	public void information() {
		super.information();
		System.out.println("間取り：" + this.arrangementOfRooms);
	}
	
	public String getArrangementOfRooms() {
		return this.arrangementOfRooms;
	}
	
	public void setArrangementOfRooms(String arrangementOfRooms) {
		this.arrangementOfRooms = arrangementOfRooms;
	}
}
