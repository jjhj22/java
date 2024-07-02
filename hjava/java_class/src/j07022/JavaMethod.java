package j07022;

public class JavaMethod {

	public static void main(String[] args) {
		
		// 클래스 메서드에서는 오직 클래스 변수나 클래스 메서드만 실행
		// 메모리에 로드(적재)되는 때가 인스턴스보다 먼저 이루어지기 때문에
		// 인스턴스 변수나 인스턴스 메서드는 안된다
		// 중괄호 안에서 만들어진 변수는 무조건 지역변수
		// 그걸 쓰기위해 매개변수를 사용함
		
		int num=300;
		output(num);
		

	}
	static void output(int a) {
		System.out.println(a);
		System.out.println("나는 메서드 입니다.");
	}
}

// 자바 메서드
// 반환타입 메서드이름(매개변수){  }

// 반환타입 - int, short, float, double, char, boolean
// 			void, String
//			메서드의 reutrun 데이터 타입
//  return 10; -> 반환타입 int, short, long
//	return income; -> income 변수의 타입을 반환타입으로

// void 타입은 반환값이 없다라는 의미

/*
 	990101-1234567
	주민등록번호로 남자인지 여자인지 구별
	String gender(String jumin){
	
	String gen=jumin.substring(7,8);
	if(gen.equals("1")||gen.equals("3")){
	return "남자";
	}else if(gen.equals("2") || gen.equals("4")){
	return "여자";
	}
	return "혼란";
	
	
	}

*/







