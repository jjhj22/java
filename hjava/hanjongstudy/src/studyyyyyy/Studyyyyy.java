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
		
		ArrayList<Food> fd = new ArrayList<Food>();
		
		fd.add(new Food("하림","불닭스파게티",3900));
		fd.add(new Food("두림","청양소시지",1800));
		fd.add(new Food("세림","와사비리조또",4000));
		fd.add(new Food("하림","불닭볶음탕",6000));
		fd.add(new Food("하림","구운파닭",3500));
		
		for(Food item : fd) {
			if(item.getBrand().equals("하림") && item.getPrice() <= 4000) {
				System.out.println(item);
			}
		}
		
				
	}
	
	
}


