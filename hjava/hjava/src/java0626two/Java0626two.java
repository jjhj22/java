package java0626two;

import java.util.Scanner;

public class Java0626two {

	public static void main(String[] args) {
		
//		System.out.println("자바출력");
		//System.in - 입력
		//입력 받을 수 있는 내장 클래스 - Scanner
		Scanner scan = new Scanner(System.in); // new - 객체생성, 공간생성자함수 , scan - 주소를 가지는 변수= 참조변수

		//float 타입 - nextFloat() double - nextDouble()
		//byte - nextByte() short - nextShort()
		//char은 없다
		//문자열 입력 - nextLine(), next()
//		System.out.print("정수 입력 :");
//		int a =scan.nextInt();
//		System.out.println(a);
//		
//		
//		
//
//		
//		int 대개라면, 삼각김밥, 바나나우유;
//		System.out.print("대개라면 가격:");
//		대개라면=scan.nextInt();
//		System.out.print("삼각김밥 가격:");
//		삼각김밥=scan.nextInt();
//		System.out.print("바나나 우유:");
//		바나나우유=scan.nextInt();
//		
//		int 지불금액=대개라면 + 삼각김밥 + 바나나우유;
//		System.out.println("점심값:"+지불금액+"원");
//		//System.out.printf("점심값 :%d원 \n", 지불금액);
//		
//		int floor=5;
//		float sec=3.4f;
//		int dhkdqhr=4;
//		float total_sec=sec*(floor-1)*sec*dhkdqhr;
//		
//		System.out.println(total_sec);
//
//		//프로그램 코드는 기본 순차적으로 진행된다
//		//if, 함수(매서드), 반복문 goto문
//		
//		float b=scan.nextFloat();
		
		/*
		   데이터의 종류는 정수, 실수, 문자, boolean(참, 거짓
		   데이터 타입
		   		정수 - byte, short, int, long
		   		문자 - char
		   		실수 - float, double
		   		참거짓 - boolean
		   		
		   	변수 선언방법 - 데이터타입 변수 이름;
		   		int num; 정수타입 변수 선언
		   		double dnum; 실수타입 변수 선언
		   		char ch; 문자타입 변수 선언
		   		boolean bool; 참거짓 변수 선언
		   		
		   	변수의 초기화
		   		int num = 10; 변수 선언과 함께 데이터를 저장
		   		
		   	출력방법
		   	System.out.println(출력내용);
		   	System.out.print(출력내용);
		   	System.out.printf(출력내용);
		   	
		   	printf 사용시 함께 사용하는 형식지정자
		   		%d, %u - 정수
		   		%f, %c - 문자
		   		%s -문자열
		   		
		   		int age=28;
		   		System.out.printf("%s 마을의 나이가%d살인 폭군지도자 %c씨",
		   							"코딩빌",    age,         '박');
		   							
		   							
		   	입력방법
		   	Scanner 클래스 객체 필요
		   	Scanner 변수 = new Scanner(System.in);
		   	*Scanner 클래스는 내장외부클래스이므로 import 해야한다.
		  	
		  		변수.nextInt(); int타입 정수만 입력가능
		  		변수.nextByte(); byte타입 정수만 입력가능
		  		변수.nextShort(); short타입 정수만 입력가능
		  		변수.nextLong(); long타입 정수만 입력가능
		  		변수.nextFloat(); float타입 실수만 입력가능
		  		변수.nextDouble(); double타입 실수만 입력가능
		  		변수.next(); 문자열 입력가능
		  		변수.nextLine(); 문자열 입력가능

		   
 
		 */
		
		int c언어, 자바, 건축학개론;
		System.out.println("c언어:");
		c언어=scan.nextInt();
		System.out.println("자바:");
		자바=scan.nextInt();
		System.out.println("건축학개론:");
		건축학개론=scan.nextInt();
		int 총점=c언어+자바+건축학개론;
		int 평균=총점/3;
//		System.out.println("총첨은:"+총점);
//		System.out.println("평균은"+평균);
		System.out.printf("총점:%d점, 평균:%d점",총점,평균);
		
		
	}

}
