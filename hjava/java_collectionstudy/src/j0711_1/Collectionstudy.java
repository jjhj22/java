package j0711_1;

import java.util.ArrayList;

public class Collectionstudy {

	public static void main(String[] args) {
		
		int[] a = new int[5];
		// Byte - byte
		// Short - short
		// Interger - int
		// Long - long 
		// Float - float
		// Double - Double
		// Character - char
		// Boolean - boolean

		
		ArrayList<Integer> list1= new ArrayList<Integer>();
		
		list1.add(89);
		list1.add(230);
		list1.add(4542);
		list1.add(4578);
		list1.add(7);
		
		
		System.out.println(list1);
		System.out.println(list1.get(4));
		
		for(int i=0; i<list1.size(); i++) {
			System.out.println(list1.get(i));
		}
		System.out.println(list1.indexOf(89));
		System.out.println(list1.contains(4542));
		list1.remove(3);
		System.out.println(list1);
		System.out.println(list1.isEmpty());
		
		list1.add(1,234);
		System.out.println(list1);
		
		list1.forEach(n -> System.out.println(n));
		
		for(Integer n : list1) {
			System.out.println(n );
		}
		
		ArrayList<String> names= new ArrayList<String>();
		names.add("김춘추"); names.add("이성계"); names.add("정몽주");
		names.add("정도전"); names.add("장영실"); names.add("김정호");
			
		if(!names.contains("이순신")) {
			names.add("이순신");
		}
		System.out.println(names);
		
//		for(String name : names) {
//			System.out.println(name);
//		}
		
		

	}

}
/*
	자바 컬렉션 프레임워크
	
	데이터를 저장,관리하기 위한 자료구조와
	데이터를 가공처리하는 알고리즘이 구현되어있는
	클래스들의 집합체
	
	collection, map 인터페이스
	
	collection 인터페이스
		- List 인터페이스
			ArrayList 클래스
			vector
			LinkedList
			Stack
			Queue
		- Set 인터페이스
		HasSet
		TreeSet
		LinekdHashSet
		
	Map 인터페이스
		- HashMap
		- TreeMap
		- LinkedHashMap






*/