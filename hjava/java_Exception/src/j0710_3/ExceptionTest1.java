package j0710_3;

public class ExceptionTest1 {

	public static void main(String[] args) {
		
		

		
		try {
		String name=null;
		name.length();
		System.out.println(10/0);
		
		}catch(NullPointerException n) {
			n.printStackTrace(); // 오류메세지 확인 - 테스트용
			System.out.println(n.getMessage());
			System.out.println(n.getClass());
			
			System.out.println("문자열 입력해라!");
		}catch(Exception e) {
			System.out.println("0으로 나누기 하면 안돼");
		}
		System.out.println("여기가 프로그램 끝");
	}

}
/*
 	예외처리
 	- 프로그램 실행중에 발생하는 에러가 발생하면 즉시 프로그램이 종료된다
 	  예외처리를 해주면 에러가 발생해도 프로그램은 종료 되지 않는다
 	- 사용자가 잘못된 값을 입력하는 경우에 알려줄 수 있다
 	- 에러나 오류를 해결하는 방법이 아니고, 회피하는 방법이다
 */
