package j0710;

abstract class animal{ //부모 클래스
	
	
	public abstract void sound(); // 추상메서드
//	public abstract void fly();
}
	

class dog extends animal{
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
	
}
class cat extends animal{
	@Override
	public void sound() {
		System.out.println("미야옹");
	}
	
}

public class Java_interface_Test {

	public static void main(String[] args) {
		animal d= new dog();
		animal c= new cat();
		
		d.sound();
		c.sound();
	}

}
