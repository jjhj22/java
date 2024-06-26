package hjava;

public class Java0626 {

	public static void main(String[] args) {
		//자바 기본 구조 - 프로젝트 - 패키지 - 클래스
		
		System.out.println("자바테스트"); // 코드실행 - 왼쪽 ctrl + f11
		// 단축키 - syso+ctrl+스페이스바
		// 자바 변수 생성
		// -> 데이터타입 변수이름 = 데이터;
		// 데이터의 종류에는 정수, 실수, 문자
		// 정수 -byte, short, int, long, char
		// 문자 - char
		// 실수 - float, double, longdoble
		
		
		//정수
		byte bnum=10; //1byte
		short snum=20; //2byte
		int inum=30; //4byte 최대가 40억 까지 다룰 수 있고 기본 20억 정도 까지 다룸
		//메모리 크기 - 4byte -> 32bit
		//			 1byte -> 8bit
		long lnum=40; //8byte
		
		//문자 - 작은 따옴표''가 문자, ""큰 따옴표가 문자열
		char ch='b'; // 한 글자 가능
		
		//실수
		float fnum=3.14f; //뒤에 f 붙여줘야 됌 0.000000 점 뒤로 6자리밖에 못 씀 그래서 double로 바꿔서 계산했다가 다시 float로 바꿈
		//f를 뒤에 붙이는 이유는 double로 바꾸는 과정에서 이 변수는 원래 float다 라는 것을 의미한다.
		fnum=35;
		double dnum=12.333333;// 0.00.., 점 뒤로 15자리 쓸 수 있음
		
		boolean isTrue=false;
		
		String word="이순신"; //String은 클래스이다 클래스 이름의 첫 글자는 대문자로 적어야함
		//클래스 - 사용자 정의 타입
		
		//사각형의 넓이를 구하시오.(밑변과 높이는 정수이다)
		int width=15;
		int height=20;
		int area=width*height;
		System.out.println("넓이:"+area);
		
		//키보드를 30개 구매해야한다
		//hp게이밍키보드의 가격이 8000원이라면 총 구매금액은 얼마인가?
		
		int keyboard=30;
		int price=8000;
		int rmador=keyboard*price;
		System.out.println("총 금액"+rmador);
		System.out.print("java 출력 방법 print");
		System.out.print("줄바꿈 안된다.");
		System.out.printf("prinf\n출력");//줄 바꿈 됌
		//서식 문자 - 형식지정문자
		System.out.printf("총 금액:%d",rmador); //f에서만 사용 가능
		// %d - 10진수 정수
		// %u - 10진수 정수
		// %f - 10진수 실수 0.0뒤로 6자리까지
		// %c - 문자
		// %s - 문자열
		// %b - boolean(false, true)
		// %o - 8진수 정수
		// %x - 16진수 정수
		System.out.printf("국어 : %d 수학 : %d \n",80,90);
		
		System.out.printf("나이 : %d 키 : %f",34,172.3);
		System.out.println(172.3);
		System.out.print(172.3);
		System.out.printf("\n %.1f\n",172.315);
		System.out.println(3);
		System.out.printf("%5d",3);
		

		
		
		}

}
