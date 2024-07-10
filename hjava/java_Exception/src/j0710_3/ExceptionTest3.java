package j0710_3;

public class ExceptionTest3 {

	public static void main(String[] args) {
		
		try {
			throw new NullPointerException("aa");
		}catch(Exception e) {
			System.out.println("강제 오류 발생");
		}

	}
}

class Member{
	String name;
	int age;
	int birth;
	Member(String name, int birth){
		this.name=name;
		this.birth=birth;
	}
	
	void setAge(){
		this.age= 2024 - birth;
	}
	
	
}
