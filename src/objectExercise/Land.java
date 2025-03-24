package objectExercise;

public class Land extends Property {
	private String extent;
	
	Land(String propertyName, String owner, String classification, String prices, String extent){
		super(propertyName, owner, classification, prices);
		this.extent = extent;
	}
	
	public void information() {
		super.information();
		System.out.println("広さ：" + this.extent);
	}
	public String getExtent() {
		return this.extent;
	}
	
	public void setExtent(String extent) {
		this.extent = extent;
	}
	
}
