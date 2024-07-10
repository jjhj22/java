package j0710_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num=0;
		try {
			System.out.println("정수 입력:");
			num=scan.nextInt();
			
		}catch(InputMismatchException e) {
			System.out.println("정수만 입력하세요");
		}finally {
			scan.nextLine();
		}
		
		
		System.out.println( num+100 );
		System.out.println("이름 :");
		String name=scan.nextLine();
		System.out.println(name);

	}

}
