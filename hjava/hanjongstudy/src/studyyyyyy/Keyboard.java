package studyyyyyy;

public class Keyboard {
	private String brand;
	private int price;
	
	public Keyboard() {
		
	}
	public Keyboard(String brand, int price) {
		this.brand=brand;
		this.price=price;
	}
	
	@Override
	public String toString() {
		return brand+" "+price;
	}
	
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	

}
