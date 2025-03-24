package objectExercise;

public class Property {
	protected String propertyName;
	protected String owner;
	protected String classification;
	protected String prices;
	
	Property(String propertyName, String owner, String classification, String prices){
		this.propertyName = propertyName;
		this.owner = owner;
		this.classification = classification;
		this.prices = prices;
	}
	
	public void information() {
		System.out.println("物件名：" + this.propertyName);
		System.out.println("物件所有者名：" + this.owner);
		System.out.println("物件種別：" + this.classification);
		System.out.println("物件価格：" + this.prices);
	}
	
	public String getPropertyName() {
		return this.propertyName;
	}
	
	public String getOwner() {
		return this.owner;
	}
	
	public String getClassification() {
		return this.classification;
	}
	
	public String getPrices() {
		return this.prices;
	}
	
	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}
	
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public void setClassification(String classification) {
		this.classification = classification;
	}
	
	public void setPrices(String prices) {
		this.prices = prices;
	}
}
