package studyyyyyy;

public class Tv {

	private String brand;
	private int price;
	private int inch;
	
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
	public int getInch() {
		return inch;
	}
	public void setInch(int inch) {
		this.inch = inch;
	}
	
	@Override
	public String toString() {
		return brand+", "+price+", "+inch;
	}
	
	public Tv(String brand, int price, int inch) {
		this.brand=brand;
		this.price=price;
		this.inch=inch;
	}
}

