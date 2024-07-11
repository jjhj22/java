package j0710;

interface Animal1{
	static int a=10;
	final int b=10;
	static void mee() {
		
	}
	public void sound(); // 추상메서드
}
interface bird{
	public void fly();
}


class Dog1 implements Animal1{
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
}
class Cat1 implements Animal1{
	@Override
	public void sound() {
		System.out.println("냐옹");
	}
}
class Pigeon implements Animal1 , bird{
	@Override
	public void sound() {
		System.out.println("구구");
	}
	@Override
	public void fly() {
		System.out.println("푸드득 비둘기날다");
	}
}


public class Java_interface_Test2 {

	public static void main(String[] args) {
		Dog1 d = new Dog1();
		Cat1 c = new Cat1();
		Pigeon p = new Pigeon();
		
		d.sound();
		c.sound();
		p.sound();

	}

}

/*
 	클래스 상속
 	1. 단일상속 - 하나의 클래스만 상속 가능하다.
 	   자식클래스는 하나의 부모클래스만 가질수 있다.
 	   다른 클래스의 기능을 사용하려면 포함관계로 구현
 	   포함관계
 	   class A{  }
 	   class B{
 	   		A a=new A();
 	   }
 	   자동차 - 타이어, 엔진, 창문, 에어컨, 핸들...
 	   자동차 - 소나타, 아반떼, 그랜저, 스포티지, 카니발
 	   
 	2. 부모클래스의 변수와 메서드를 상속받아 사용한다.
 	   부모클래스의 public, protected, default제어자 
 	      변수와 메서드만 상속된다.
 	   자식클래스는 부모가 상속으로 주는 모든것을 다 받아야 한다.
 	   자식클래스입장에서는 선택지가 없다. 강제적으로 상속이다.
 	
 	3. 강한 결합 
 	    부모 클래스의 변경이 자식클래스에 영향을 준다.
 	    
 	인터페이스
 	1. 다중 구현
 	   클래스가 여러개의 인터페이스를 연결하여 구현 할 수 있다.
 	2. 유연성
 	   클래스는 필요한 인터페이스를 조합하여 구현 할 수 있다.
 	3. 약한 결합
 	  클래스는 필요한 인터페이스만 구현 하면 되므로  상속관계일때보다
 	  유연성이 높아 진다.(상속보다 영향이 적다)
 	  
 	  
 	
 */




