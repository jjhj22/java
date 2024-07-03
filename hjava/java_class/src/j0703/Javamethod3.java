package j0703;

import java.util.Scanner;

public class Javamethod3 {

	public static void main(String[] args) {
		// 정수 두개 입력 받아 합을 출력하기
		Calc calc=new Calc();
		calc.sum(40,10);
		//세과목의 총점을 구하여 출력하세요
		int kor=89;
		int eng=74;
		int mat=43;
		Ejgkrl ej=new Ejgkrl();
		ej.ejgk(kor, eng, mat);
		//메서드 호출하여 "메서드 dog쉽네~"라고 출력
		calc.dog();
		calc.view();
		//메서드를 호출하여 이름과 나이를 출력하세요
		//매개변수 없는 메서드, 키보드를 입력 x
		
		calc.nameage();
		
		//메서드를 호출하여 아래의 데이터를 출력하세요
		String animal="골든리트리버";
		String 공고일="2024-07-01";
		TestMethod tm=new TestMethod();
		tm.ghcnf(animal,공고일);
		
		//다음 날짜 중에서 월과 일만 출력하세요
		//문자열 메서드 substring 또는 split 사용
		String examDate="2024-08-13";
		String cnffur;
		String cnffur1;
		cnffur=examDate.substring(examDate.indexOf("-")+1,examDate.lastIndexOf("-"));
		cnffur1=examDate.substring(examDate.lastIndexOf("-")+1);
		System.out.println(cnffur+" "+cnffur1);
		tm.datePrint(examDate);
		
		//네 사람의 나이 평균 값을 구하여 출력하세요
		//평균값은 정수입니다
		int 흥민=31, 강인=23, 희찬=28, 재범=37;
		int 총합=흥민+강인+희찬+재범;
		int 평균=총합/4;
		tm.vudrbs(평균);
	}

}

class TestMethod{
	void vudrbs(int vud) {
		System.out.println("평균나이:"+vud);
	}
	void datePrint(String date) {
		String[] current=date.split("-");
		System.out.println(current[1]+" "+current[2]);
	}
	void ghcnf(String a, String b) {		
		System.out.println(a+"\n"+b);
	}
}
class Calc{

	void nameage() {
		String dlfma="정한종";
		int c=23;
		System.out.println(c+" "+dlfma);
	}
	void view() { // 변수a,b의 값 출력하는 메서드
		int a=10, b=20;
				System.out.println(a+" "+b);
	}
	void dog() {
		System.out.println("매서드 dog쉽네~");
		
	}
	void sum(int num1,int num2) {
		int result =num1+num2;
		System.out.println("합 :"+result);
	}
	void sum() {
		Scanner scan = new Scanner(System.in);
		System.out.println("첫번째 정수:");
		int num1=scan.nextInt();
		System.out.println("두번째 정수:");
		int num2=scan.nextInt();
		int result=num1+num2;
		System.out.println("합 :"+result);
	}
}
class Ejgkrl{
	void ejgk(int k, int e, int m) {	
		int chdgkq=k+e+m;
		System.out.println("총합:"+chdgkq);
	}
}