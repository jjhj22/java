package j0704;

import java.util.Scanner;

public class JavaMethod6 {

	public static void main(String[] args) {
		
		// 컴퓨터와 가위바위보 하기
		// 컴퓨터의 가위바위보 값은 comInput메서드를 사용한다
		// 유저의 가위바위보는 한글로 입력한다.
		// 승,무,패에 대해 출력한다
		// 메서드 - 유저 가위바위보 입력하고 저장하는 메서드
		//		-컴퓨터와 비교하여 결과 출력하는 메서드
		//Game 클래스에 필요한 변수나 메서드 작성
		//main 메서드에서는 Game 클래스 객체로 메서드들만 실행
		Game game=new Game();
		game.comInput();
		game.user();
		game.winlose();
		
	}

}
class Game{ // rock-paper-scissors
	
	String com;
	String user;
	
	void user(){
		Scanner sc=new Scanner(System.in);
		System.out.println("가위~ 바위~ 보! :");
		this.user=sc.next();
		
		
		
		
	}
	void winlose() {
		if(user.equals(com)) {
			System.out.println("무승부");
			} else {
			switch(user) {
			case "가위" :
				 if(com.equals("바위")) {
					 System.out.println("패배");
					 }
				 else {
					 System.out.println("승리");
				 }break;
			case "바위" :
				if(com.equals("가위")) {
					System.out.println("승리");
				}else {
					System.out.println("패배");
				}break;
			case "보" :
				if(com.equals("바위")) {
					System.out.println("승리");
				}else {
					System.out.println("패배");
				}break;
			 }
		}
	}
	
	
	
	void comInput() {
		int temp=(int)(Math.random()*3);
		switch(temp) {
		case 0: this.com="가위";break;
		case 1: this.com="바위";break;
		case 2: this.com="보";break;
		
		}
	}
	
}