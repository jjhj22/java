package j0627;

import java.util.Scanner;

public class Loop {

	static Scanner scan=new Scanner(System.in);
		
	public static void main(String[] args) {
		
		// 반복문 - for, while, do~while 
		//  for(초기값;  조건식;  증감식) {  반복내용  }
		// 조건식이 거짓이 될때까지  중괄호안의 내용이 계속 실행된다.
		// 초기값 -> 조건식비교 -> 참이라면 -> 중괄호 -> 증감식
		// -> 조건식비교 -> 참이라면 -> 중괄호 -> 증감식 -> 
		//  조건식비교 -> 거짓이라면 -> 끝
		
		
//		for(int i=1; i<=3; i++) {
//			
//		}
//		
//		System.out.println("아... 반복문...."+1);
//		System.out.println("아... 반복문...."+3);
//		System.out.println("아... 반복문...."+5);
//		System.out.println("아... 반복문...."+7);
//		System.out.println("아... 반복문...."+9);
//		System.out.println("아... 반복문...."+11);
//		System.out.println("아... 반복문...."+13);
//		System.out.println("아... 반복문...."+15);
//		System.out.println("아... 반복문...."+17);
//
//		for( int i=1;  i<10; i++) {
//			System.out.println("아... 반복문...."+(2*i-1));
//		}
//		for( int i=1; i<=17; i+=2) {
//			System.out.println("아... 반복문...."+i);
//		}
//		for( int i=1; i<=17; i++) {
//			System.out.println("아... 반복문...."+i);
//			i++;
//		}
//		for( int i=1; i<10; i++) {
//			System.out.println("아... 반복문...."+(i+2));
//		}
//		
//		for(int i=10; i>0; i--) {
//			System.out.println( i);
//		}
		
		
//		int num = 1;
//		int a=1;
//		num = num + a;  
//		System.out.println( num ); // 2
//		a++;
//		
//		num = num + a;
//		System.out.println( num ); // 4
//		a++;
//		
//		num = num + a;
//		System.out.println(  num ); // 7
//		a++;
		
//		int num =1;
//		for( int a=1; a<=100; a++) {
//			num += a;
//			System.out.println( num );
//		}
		
		
		// 1부터 내가 입력한 숫자까지 의 총합을 구하세요.
		
		
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.print("숫자 입력 : ");
//		int number = scan.nextInt();
//		
//		int sum=0;
//		for(int i=1; i<=number; i++) {
//			sum = sum + i;
//		}
//		System.out.println( "총합 : "+ sum);
//		
		
		
//		Scanner sc = new Scanner(System.in);
//		
//		for(; true;) {
//			System.out.print("정수 입력:");
//			int num = sc.nextInt();
//			if(num == 0)
//			break;
//			
//			int num1=-1;
//			for(; num1 !=0;) {
//				System.out.print("정수 입력:");
//				num1 = sc.nextInt();
//				
//		}
//		
		//무한루프 종료시키는 방법
		//1. if문의 조건식이 참이되면 break 실행
		//2. for(; 조건식 ;)
		//3. return; - 반복문코드가 있는 메서드를 종료시키기 때문에
		//				반복문도 종료된다
		//break; - 반복문, switch 사용가능
		//			if문 단독으로 break사용 불가
		///if(10>5) break; 이거는 오류!
			
		//continue;
		
//		for(int i=1; i<=10; i++) {
//			System.out.println(i+"번째 반복 시작");
//			if(i%3==0)continue;
//			System.out.println(i+"번째 반복 진행중");
//			System.out.println(i+"번째 반복 마지막내용");
//	}
	
	//자바의 랜덤
	
	
//	for(; true;) {
////		int num1=(int)Math.floor(Math.random()*50)+1;
//		int num1 = (int)(Math.random()*50)+1;
//		
//		
//		if(num1%11==0)break;
//		
//		System.out.println(num1);
//		
//		
//		
//	}
//		int number;
//		int num1 = (int)(Math.random()*81)+20;
//		System.out.println(num1);
//		System.out.println("불러봐:");
//		number=scan.nextInt();
//		if(number==num1) {
//			System.out.println("정답");
//		}if(number>num1) {
//			System.out.println("down");
//		}if(number<num1) {
//			System.out.println("up");
//		}
		
		
		
//		
		
		//이름이 있는 반복문
		

}
}

