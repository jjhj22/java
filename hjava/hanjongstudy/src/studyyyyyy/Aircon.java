package studyyyyyy;

public class Aircon {

	String brand;
	double area;
	int price;
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return brand+", "+area+", "+price;
	}
	
	public Aircon() {
		
	}
	public Aircon(String brand, double area, int price) {
		this.brand=brand;
		this.area=area;
		this.price=price;
	}

	
}
