package j0627;

import java.util.Scanner;

public class Conditional {

	public static void main(String[] args) {
		
		// 조건문 - if, switch
		// 반복문 - for, while, do~while
		
		// if문의 조건식 - 비교연산자와 논리연산자로 식을 만든
		//				즉 참과 거짓이 나올 수 있는 식
		// 키가 150이상이다  -  키 >=150
		// 10월 달의 지출 내역  -  전체지출날짜 월 == 10
		//32000원 이상의 지출 내역  -  지출금 >= 32000
		//판매중인 상품들만 출력  -  상품상태 == 판매, 재고수량 > 0
		
		int tall=135;
		if(tall >= 150) {
			//키가 150이상이 맞다면 무엇을 할 것인지
		}else {
			//키가 150이상이 아니라면 무엇을 할 것인지
			
			//시험 합격 기준 - 합격(60점 이상), 불합격(60점 미만)
			
		int score =72;
		if(score >= 60) {
			System.out.println("합격입니다");
		}else {
			System.out.println("불합격입니다");
			
			//if ~ else - 조건식이 참, 거짓에 따라 실행되는 내용이 다른경우
			//하나의 조건에 두개의 내용이 있는 경우에 if ~ else 구조로 작성
			
		
		//switch - 실행 조건을 case로 설정하여
		//			case와 일치하는 값일 경우 발동되는 조건문
		//지렁이 게임을 만든다 방향키는 w,a,s,d이고
		//p키는 일시정지, o키는 계속하기, i는 처음부터 다시시작
		//ctrl+s는 게임시작이라고 한다면
		
			/*
			 	switch(키보드값){
			 		case 'a' 실행내용
			 		case 'w' 실행내용
			 		case 's' 실행내용
			 		case 'd' 실행내용
			 		case 'p' 실행내용
			 		case 'o' 실행내용
			 		case 'i' 실행내용
			 		case 'ctrl':
			 				switch(키2){
			 					case 's':
			 					}
			 		}
			 		
			 		
			 	프로그램의 메뉴 구성
			 	
			 	switch(menu){
			 		case "open":
			 		case "save":
			 		case "build":
			 		case "git":
			 		case "exit":
			 		}
			 		
			 		if(menu.equals("open"){
			 		
			 		조건식이 == 연산자가 사용된다면 switch 으로 작성하는것을 고려해보기
			 		
			 */
			
			//시작버튼을 클릭하면 게임을 시작하고
			//종료버튼을 클릭하면 게임을 종료하고
			//저장버튼을 클릭하면 게임을 저장해라
			
		
		}
		}
		
		String button ="종료";
		
		switch(button) {
		case "시작":
			System.out.println("게임 시작");
			break;
		case "자동저장":
		case "저장":
			System.out.println("게임 저장");
			break;
		case"종료":
			System.out.println("게임 종료");
		}
		
		Scanner sc=new Scanner(System.in);

		int 가로=0, 세로=0;
		System.out.println("가로:");
		가로=sc.nextInt();
		System.out.println("세로:");
		세로=sc.nextInt();
		
		
		
		int square=가로-세로; // 10 -5 ->5, 5 -8 ->-3
			switch(square) { // 괄호안에 계산식 들어갈 수 있음
			case 0:
				System.out.println("정사각형");
				break;
			default:
				System.out.println("직사각형");
			}
			
			//switch문에서 default는 한번만 사용
			//switch에 들어온 값이 case에 일치하는게 없다면 default 실행된다
			
		
	}

}
