package studyyyyyy;

public class Food {

	String brand;
	String name;
	int price;
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return brand+", "+name+", "+price;
	}
	
	public Food() {
		
	}
	public Food(String brand, String name, int price) {
		this.brand=brand;
		this.name=name;
		this.price=price;
		
	}
}
