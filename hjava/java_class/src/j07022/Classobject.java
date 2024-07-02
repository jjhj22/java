package j07022;

public class Classobject {

	public static void main(String[] args) {
		Car car1;
		
		
		car1=new Car(); //carName, 배기량, 연료 변수 생성
		car1.carName="쏘나타";
		car1.연료 = "휘발유";
		car1.제조사="기아";
		System.out.println(Car.제조사);
		
		Car car2=new Car("그랜져",3000,"휘발유");
		
		Writer writer1 = new Writer("김건우",4580,4.3f);
		Writer writer2 = new Writer("김경제",3484,4.1f);
		Writer writer3 = new Writer("박재범",90930,2.7f);
		Writer writer4 = new Writer("서석완",19200,3.1f);
		
		System.out.println(writer1.name+" "+writer1.rating);
		System.out.println(writer1.point);
		System.out.println(writer1);
		
		
		

	}

}
// 클래스 내부에 선언되는 변수(또는 배열)은 두가지가 있다
//클래스 변수, 인스턴스 변수
//인스턴스 변수는 클래스 객체 생성시 메모리 할당이 된다
//클래스 객체 생성은 new 연산자를 통한다 - new 연산자로 만들기 전까진 공간 생성 x
//클래스 변수는 프로그램 실행 할 때 메모리에 로드하면서 생성된다

//생성자 메서드 - 객체(인스턴스) 공간을 생성할 때 공간 초기화 해주는 메서드
//생성자 메서드 - return이 존재하지 않는다
//				return을 하면 안되는 이유가 생성자메서드에는 return타입
//				지정이 안되기 때문에

// 오버로딩 - 오버로딩 구현 조건
//			1. 동일 클래스 내부에서만 가능하다.
//			2. 메서드의 이름은 같아야 한다.
//			3. 매개변수의 타입은 다르게 선언되어야 한다.
//			4. 매개변수의 갯수가 달라야한다.


class Car{
	static String 제조사="현대"; //클래스 변수
	
	String carName; //인스턴스 변수
	int 배기량; //인스턴스 변수
	String 연료="휘발유"; //인스턴스 변수
	
						
	
	//생성자 메서드
	Car(){
		//생성자메서드의 내용 - 인스턴스변수의 초기값 지정
		연료="휘발유"; //new 연산자에 의해 객체 생성시 연료변수에
					//휘발유 저장된다
	}
	// 매개변수가 있는 생성자 메서드
	Car(String 연료){
		this.연료=연료;
	}
	Car(String carName, int cc, String fuel){
		this.carName=carName;
		배기량=cc;
		this.연료=fuel;
	}
}

class Writer{
	String name; // 이름 - 인스턴스변수
	int point; //포인트점수 - 인스턴스변수
	float rating; //평점 - 인스턴스변수
	
	Writer(){
		
	}
	
	Writer(String name){
		this.name=name;
	}
	
	Writer(String name, int point, float rating){
		this.name=name;
		this.point=point;
		this.rating=rating;
	}
	public String toString() {
		return name+" "+point+"점 "+rating;
	}
	}



