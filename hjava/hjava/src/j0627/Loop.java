package j0627;

import java.util.Scanner;

public class Loop {

	public static void main(String[] args) {
		
		//반복문 - for, while, do~while
		//for(초기값; 조건식; 증감식){반복내용}
		//조건식이 거짓이 될 때까지 중괄호안의 내용이 계속 실행된다.
		//초기값 -> 조건식비교 -> 참이라면 -> 중괄호 -> 증감식
		//-> 조건식비교 -> 참이라면 -> 중괄호 -> 증감식 ->
		//조건식비교 -> 거짓이라면 -> 끝

//		for(int i=1; i<=17; i+=2) {
//			System.out.println("아..반복문..."+i);
//		
//	}
//		for(int i=17; i<=1; i-=2) {
//			System.out.println("아..반복문..."+i);
//		}
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자입력:");
		int number =scan.nextInt();
		int sum=0;
		for(int i=1; i<=number; i++){
			sum=sum+i;
			
		}
		System.out.println("총합:"+sum);	
	}

}
