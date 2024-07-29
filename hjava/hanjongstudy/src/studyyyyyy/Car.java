package studyyyyyy;

public class Car {
	private String[] makerArr = new String[] {"현대","기아","르노"};
	private String maker;
	private String name;
	int cc;
	
	public String[] getMakerArr() {
		return makerArr;
	}
	public void setMakerArr(String[] makerArr) {
		this.makerArr = makerArr;
	}
	public String getMaker() {
		return maker;
	}
	public void setMaker(String maker) {
		this.maker = maker;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	
	@Override
	public String toString() {
		return maker+", "+name+", "+cc;
	}
	public Car() {
		
	}
	public Car(String maker, String name, int cc) {
		this.maker=maker;
		this.name=name;
		this.cc=cc;
	}

}
