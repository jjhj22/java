package j0717_1;

public class Rental<T extends Media> {
	private T item;
	private String renter; //대여한 사람
	
	public Rental(T item, String renter){
		this.item=item;
		this.renter=renter;
	}
	public T getItem() {
		return this.item;
	}
	public String getRenter() {
		return this.renter;
	}
	
	@Override
	public String toString() {
		return "대여자 : "+renter+", "+item.toString();
	}
}
