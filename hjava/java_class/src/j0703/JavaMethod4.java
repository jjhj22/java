package j0703;

public class JavaMethod4 {

	public static void main(String[] args) {
		// 메서드를 통해서 숫자 10을 받아 출력하기
		
		ReturnMth rtm=new ReturnMth();
		int num=rtm.get();
		System.out.println(num);
		
		//메서드로부터 두정수의 더하기 결과 받아서 출력하기
		
		int 결과=rtm.sum();
		System.out.println(결과);
		
		//다음의 물음표에 들어갈 코드를 작성하여 이름과 나이가 출력되게
		
		String userName=rtm.getName();
		int age=34;
		System.out.println(userName+" "+age);
		
		//국어, 영어, 수학 세과목의 총점을 구하는 메서드
		//세과목의 평균을 구하는 메서드
		//총점과 평균을 출력하세요
		int 총점=rtm.chdwja(); //총점 계싼해서 받기
		int 평균=rtm.vudrbs(총점);//총점 매개변수로 받고 평균 반환
		System.out.println(총점+" "+평균);
		
		
	}

}

class ReturnMth{ // void타입이 아닌 인스턴스를 만들 때 return이 꼭 들어가야함
	int vudrbs(int c) {
		return c/3;
		
	}
	
	int chdwja() {
		int kor=89, eng=78, mat=50;
		int chd=kor+eng+mat;
		return chd;
	
	}
	
	String getName() {
		String name="이순신";
		return name;
	}

	int sum() {
		int num1=30, num2=40;
		int result=num1+num2;
		return result;
	}
	
	int get() {
		return 10;
	}
}