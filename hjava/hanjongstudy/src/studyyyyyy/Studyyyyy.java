package studyyyyyy;

import java.util.ArrayList;
import java.util.Scanner;


public class Studyyyyy {

	public static void main(String[] args) {

		
//		Keyboard k = new Keyboard();
//		k.setPrice(1000);
//		k.setBrand("삼성");
//		
//		System.out.println(k);
//		
//		Keyboard kb = new Keyboard("LG",40000);
//		
//		System.out.println(kb);
//		
//		Car car = new Car();
//		car.setMaker(car.getMakerArr()[0]);
//		
//		
//		Car c = new Car("람보르기니","우르스",5000);
//		System.out.println(c);
//		
//		Book b1 = new Book("책 먹는 여우",2002,45);
//		Book b2 = new Book("누가 내 머리에 똥 쌌어",2006,24);
//		Book b3 = new Book("선녀와 나무꾼",1998,53);
//		
////		Book[] arr = new Book[] {b1,b2,b3};
////		System.out.println(  arr[0]);
//		
//		System.out.println( b2.getPage());
//		
//		
//		ArrayList<Book> al = new ArrayList<Book>();
//		al.add(b1);
//		al.add(b2);
//		al.add(b3);
//		al.add(new Book("아아1",2002,33));
//		al.add(new Book("아아2",2012,33));
//		al.add(new Book("아아3",2017,33));
//		al.add(new Book("아아4",2001,33));
//		al.add(new Book("아아5",2006,33));
//		
//		//  출간년도가 2005년 이후 인 책 출력
//		
//		for(int i=0; i<al.size(); i++) {
//			if(al.get(i).getYear()>2005) {
//				System.out.println(al.get(i));
//			}
//				
//		}
		
		
//		System.out.println(al.get(1).getPage());
//		System.out.println(al.get(2).getYear());
//		
		
//		Member mb1= new Member("한종",23,"백수");
//		Member mb2= new Member("두종",25,"연구원");
//		Member mb3= new Member("세종",27,"개발자");
//		Member mb4= new Member("네종",53,"해적");
//		Member mb5= new Member("오종",41,"농부");
//		Member mb6= new Member("육종",74,"의사");
//		Member mb7= new Member("칠종",67,"미용사");
//		Member mb8= new Member("팔종",38,"목수");
//		
//		ArrayList<Member> ar = new ArrayList<Member>();
//		
//		ar.add(mb1);
//		ar.add(mb2);
//		ar.add(mb3);
//		ar.add(mb4);
//		ar.add(mb5);
//		ar.add(mb6);
//		ar.add(mb7);
//		ar.add(mb8);
		
		
//		for(int i=0; i<ar.size(); i++) {
//			if(ar.get(i).getAge()>30) {
//				System.out.println(ar.get(i));
//			}
//		}
//		
		
		
		
//		ac.add(new Aircon("lg",91.8,1600000));
//		ac.add(new Aircon("삼성",23.9,870000));
//		ac.add(new Aircon("캐리어",10.2,600000));
//		ac.add(new Aircon("위니아",24.1,940000));
//		ac.add(new Aircon("파세코",43.6,620000));
//		ac.add(new Aircon("위닉스",19.8,770000));
//		ac.add(new Aircon("샤오미",20.6,510000));
		
//		for(int i=0; i<ac.size(); i++) {
//			if(ac.get(i).getArea()<=20 && ac.get(i).getPrice()<800000) {
//				System.out.println(ac.get(i));
//			}
//		}
//		
		Scanner scan = new Scanner(System.in);
		ArrayList<Aircon> ac = new ArrayList<Aircon>();
		ArrayList<Tv> tv = new ArrayList<Tv>();
		
		
		

			while(true) {	
			System.out.println("메뉴를 선택하세요 : ");
			System.out.println("1번 : Tv 또는 Aircon 선택하여 배열에 추가하기");
			System.out.println("2번 : 저장된 배열 모두 불러오기");
			System.out.println("3번 : 종료하기");
			int menu=scan.nextInt();
			switch(menu) {
			case 1:
				boolean dk=false;
				while(!dk) {
				System.out.println("1번 : Tv , 2번 : Aircon");
				int choose=scan.nextInt();
				if(choose==1) {
					System.out.println("브랜드를 입력하세요 : ");
					String tvbrand=scan.next();
					System.out.println("가격을 입력하세요 : ");
					int tvprice=scan.nextInt();
					System.out.println("인치를 입력하세요 : ");
					int tvinch=scan.nextInt();
					tv.add(new Tv(tvbrand,tvprice,tvinch));
					dk=true;
				}else if(choose==2) {
					System.out.println("브랜드를 입력하세요 : ");
					String airbrand=scan.next();
					System.out.println("평방을 입력하세요 : ");
					double airarea=scan.nextDouble();
					System.out.println("가격를 입력하세요 : ");
					int airprice=scan.nextInt();
					ac.add(new Aircon(airbrand,airarea,airprice));
					dk=true;
				}else {
					System.out.println("다시 선택하세요");
					
					}
				}
				break;
			case 2:
				System.out.println("Aircon목록 : "+ac);
				System.out.println("Tv목록 : "+tv);
				
				break;
			case 3:
				scan.close();
				return;
			default:
				System.out.println("다시 선택하세요");
				
			}
		}
		
		
		
		
	}
	
	
}


