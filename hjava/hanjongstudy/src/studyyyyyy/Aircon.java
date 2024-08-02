package studyyyyyy;

public class Aircon extends Tv{

	
	private double area;
	
	

	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}

	
	@Override
	public String toString() {		
		return super.getBrand()+", "+area+", "+super.getPrice();
	}
	


	public Aircon(String brand, double area, int price) {
		super(brand,price,0);
		this.area=area;
	}

	
}
