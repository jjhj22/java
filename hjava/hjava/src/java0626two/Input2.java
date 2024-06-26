package java0626two;

import java.util.Scanner;

public class Input2 {

	public static void main(String[] args) {
		
		
		
		/*	코드 작성하기전 해야할 일 - 문제파악, 요구사항도출
		 	//문자열 - "" 큰따옴표로 표현하여 작성한다
		 	  문자열은 String 클래스타입을 사용해야한다
		 	  
		 	  
		 	문제2.
		 	직원 이름, 소속부서명, 월 급여액을 키보드를 통해 입력받는다.
		 	세금은 8%를 낸다. 실수령액은 얼마인지 출력
		 	이름, 부서, 실수령액을 출력하세요
		 	두명의 직원에 대해 출력하세요
		 
		 
		 
		 
		 */
		Scanner scan = new Scanner(System.in);
		
		
		String 직원1, 직원2, 소속부서명1, 소속부서명2;
		float 세금=0.08f, 월급1, 월급2;
		
		
		System.out.println("이름:");
		직원1=scan.next();
		System.out.println("소속부서:");
		소속부서명1=scan.next();
		System.out.println("월급:");
		월급1=scan.nextInt();
		float 실수령액1=월급1-(월급1*세금);
		System.out.println("이름:");
		직원2=scan.next();
		System.out.println("소속부서:");
		소속부서명2=scan.next();
		System.out.println("월급:");
		월급2=scan.nextInt();
//		float 실수령액2=월급2-(월급2*세금);
		int 실수령액2=(int)(월급2-(월급2*세금)); // 앞에 데이터타입을 붙여주면 강제로 타입변환, 변환되는 데이터에 정수가 포함되어 있기에 가능
		
		System.out.printf("이름:%s, 소속부서:%s 실수령액:%f\n",직원1,소속부서명1,실수령액1);
		System.out.printf("이름:%s, 소속부서:%s 실수령액:%f\n",직원2,소속부서명2,실수령액2);
		

	}

}
