package j0704;

import java.util.Scanner;

public class JavaMethod5 {
	public static void main(String[] args) {
		
		MethodUtil util = new MethodUtil();
		//두개의 정수를 반환하기
		int[] num= util.twoNum();
		
		//사각형의 너비와 높이를 설정하고 넓이를 출력하세요
		//넓이는 main메서드에서 출력되게 하세요
		Square 사각형=new Square();
		int 값=사각형.cal();
		System.out.println(값);
		
		//로그인 가능한 아이디는 skyblue, 비밀번호는 1234sea
		//login 메서드를 실행하여 로그인 여부를 출력하세요
		//아이디 비밀번호가 일치하면 로그인 성공 출력
		//하나라도 불일치면 로그인 실패 출력
		//로그인 여부 출력은 main에서
//		boolean isFail=util.login();
//		if(isFail) {
//			System.out.println("로그인 성공");
//		}else {
//			System.out.println("로그인 실패");
//		}
		//정수 세개를 키보드를 통해 입력 받으세요.
		//입력한 세 정수의 합이 100을 넘으면
		//100 - 합의 결과를 출력하고
		//100을 넘지 않으면 세정수의 합을 출력하세요
		//main메서드에서 출력
		int wjdtngkq=util.wjdtn();
		System.out.println(wjdtngkq);
		
	}
	
}
class Square{
	int cal(){
		int sjql=20, shvdl=30;
		int sjfqdl=sjql*shvdl;
		return sjfqdl;
	}
}
class MethodUtil{
	int wjdtn() {
		Scanner sc=new Scanner(System.in);
		System.out.println("첫번째 정수를 입력하세요:");
		int wjdtn1=sc.nextInt();
		System.out.println("두번째 정수를 입력하세요:");
		int wjdtn2=sc.nextInt();
		System.out.println("세번째 정수를 입력하세요");
		int wjdtn3=sc.nextInt();
		int wjdtngkq=wjdtn1+wjdtn2+wjdtn3;
		if(wjdtngkq>100) {
			return wjdtngkq=100-wjdtngkq;
		}else {
			return wjdtngkq;
		}
		
	}
	boolean login() {
		Scanner sc=new Scanner(System.in);
		System.out.print("아이디 :");
		String id=sc.next();
		System.out.println("비밀번호 :");
		String password=sc.next();
		
		
		String loginid="skyblue";
		String loginpassword="1234sea";
		
		if(id.equals(loginid) && password.equals(loginpassword)){
			return true;
		}else {
			return false;
		}


	}
	int[] twoNum() {
		int num1=20, num2=50; //여러개의 데이터를 하나의 값으로 표현할 땐 배열을 쓴다
		int[] temp= new int[] {num1, num2};
		return temp;
		//return으로 반환 시킬 수 있는 값은 단일값이다
	}
}