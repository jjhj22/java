package j0709;

public class ObjectArray1 {

	public static void main(String[] args) {
		// 영화 정보 5개 입력
		
		Movie[] mv = new Movie[5];
		
		mv[0] = new Movie("범죄도시","강윤성",18);
		mv[1] = new Movie("인사이드아웃2","켈시",1);
		mv[2] = new Movie("탈주","이종필",12);
		mv[3] = new Movie("하이재킹","김성한",12);
		mv[4] = new Movie("흑성탈출","웨스",12);
		
		for(int i=0; i<mv.length; i++) {
			System.out.println(mv[i]);
		}
		for(Movie movie : mv) {
			System.out.println(movie);
		}
	}

}

/* 
 	int a= 10;
 	String name = new Stirng("이순신");
 
	배열의 생성
	데이터타입[] 참조변수 = new 데이터타입[배열크기];
	
	클래스명 - movie
	
	movie t;
	
	movie[] mv = new movie[10];
	movie클래스의 참조변수 10개 생성 된 것
	객체가 생성된 것이 아님
	
	mv[0] = new movie();
	mv[1] = new movie();
	mv[2] = new movie();
	.
	.
	.
	하나 하나 만들어줘야 함
	
	int[] arr = new int[10];
	int타입의 공간 10개 생성 (int타입으로 선언된 변수 10개 있는 것과 같다고 봐도 된다)
	arr[0] = 100;

*/