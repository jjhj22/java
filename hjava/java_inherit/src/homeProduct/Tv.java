package homeProduct;

public class Tv extends House {
	
		int channerl=10; // 채널
		int vol=5; // 소리

		Tv(){ //생성자 메서드
			super();
			
		}
		//매개변수 있는 생성자 메서드
		Tv(String brand, int price){
			super(brand,price); // 부모클래스 생성자 메서드 호출
		}
		
		void channelUp() {
			this.channerl++;
		}
		void channelDown() {
			this.channerl--;
		}
	}

