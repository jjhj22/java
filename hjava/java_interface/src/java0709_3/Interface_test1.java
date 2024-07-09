package java0709_3;


class RestCustomer{ //식당에 찾아오는 손님
	String customer; //예약 손님
	public void setCustomer(String customer) {
		this.customer=customer;
	}
	
}

class ReservCustomerA extends RestCustomer{	
} //예약손님 A
class ReservCustomerB extends RestCustomer{	
} //예약손님 B
class ReservCustomerC extends RestCustomer{	
}


class Owner{
	void food(ReservCustomerA cusA) {
		System.out.println(cusA.customer + " 청국장 준다");
	}
	void food(ReservCustomerB cusB) {
		System.out.println(cusB.customer + " 돈가스 준다");
	}
}

public class Interface_test1 {

	public static void main(String[] args) {
		
		Owner ow= new Owner();
		ReservCustomerA a= new ReservCustomerA();
		ReservCustomerB b= new ReservCustomerB();
		a.setCustomer("A-이순신");
		b.setCustomer("b-김유신");
		
		ow.food(a);
		ow.food(b);
	}

}

//사용자 요청 처리 클래스 - 컨트롤 클래스
//사용자 요청에 필요한 데이터 가공 및 수집 실행 클래스 - 서비스 클래스
//데이터만 저장하는 클래스 - 사용자에게 제공할 데이터 클래스 - VO,DTO
//					- 데이터 베이스에 저장할 데이터 클래스 - Entity
//데이터베이스 처리 인터페이스 - repository
//
