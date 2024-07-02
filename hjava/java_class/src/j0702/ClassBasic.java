package j0702;

public class ClassBasic {

	public static void main(String[] args) {
		// 변수 - 단일 데이터
		//		지정된 타입
		
		// 배열 - 다수 데이터
		//		같은 타입
		
		// 함수 - 독립적인 타입
		// 매서드 - 귀속되어있는 타입
		
		//정의된 클래스 타입의 공간을 생성한다.
		//생성된 공간에 데이터를 저장한다
		//클래스 타입으로 생성된 공간을 객체 또는 인스턴스라고한다
		//(); 함수호출을 의미
		
		//클래스 인스턴스 생성 - 생성자 메서드
		Member member1 = new Member();
		Member member2 = new Member();
		System.out.println(member1);

		member1.name="이순신";
		member1.age=23;
		
		System.out.println(member1.age);
		System.out.println(member1.name);
		
		member2.name="김유신";
		member2.age=22;
		
		System.out.println(member2.name);
		System.out.println(member2.age);
		
		Book book1= new Book();
		Book book2= new Book();
		
		book1.title="책 먹는 여우";
		book1.page=56;
		
		System.out.println(book1.title);
		System.out.println(book1.page);
		
		book2.title="누가 내 머리에 똥 쌌어?";
		book2.page=47;
		
		System.out.println(book2.title);
		System.out.println(book2.page);
		
		//스마트폰 제품명, 운영체제, 메모리(ram)크기에 대해
		//저장할 수 있는 클래스를 정의하고 인스턴스 생성하여
		//값 저장, 출력을 하세요(3개)
		
		Smartphone phone1=new Smartphone();
		Smartphone phone2=new Smartphone();
		Smartphone phone3=new Smartphone();
		
		phone1.rlwhd="갤럭시24";
		phone1.dnsdud="안드로이드14";
		phone1.ram=12;
		
		phone2.rlwhd="아이폰 13pro";
		phone2.dnsdud="ios17";
		phone2.ram=6;

		phone3.rlwhd="샤오미13울트라";
		phone3.dnsdud="안드로이드13";
		phone3.ram=12;
		
		System.out.println(phone1.rlwhd);
		System.out.println(phone1.dnsdud);
		System.out.println(phone1.ram);
		
		System.out.println(phone2.rlwhd);
		System.out.println(phone2.dnsdud);
		System.out.println(phone2.ram);

		System.out.println(phone3.rlwhd);
		System.out.println(phone3.dnsdud);
		System.out.println(phone3.ram);



		
		
	}

}
//책 제목과 총페이지수를 저장하기 위한 클래스 정의

class Book{
	String title;
	int page;
}



// 클래스 - 설계도, 객체 - 제품
// 클래스 - 붕어빵틀, 객체 - 붕어빵

// 클래스는 사용자 정의 데이터 타입이라고 한다
class Member { //Member 라는 이름의 클래스 정의
	String name; //이름
	int age; //나이
//	Member(){ //눈에 보이진 않지만 기본적으로 들어가이씀
//		
//	}
	
}

class Smartphone{
	String rlwhd;
	String dnsdud;
	int ram;
}
