package j0711_1;

import java.util.ArrayList;

public class ArrayListStudy1 {

	public static void main(String[] args) {
		
		ArrayList<Member> list = new ArrayList<>();
		
		list.add(new Member("이순신",34,"19911105"));
		list.add(new Member("삼순신",35,"19920904"));
		list.add(new Member("사순신",36,"19930403"));
		list.add(new Member("오순신",37,"19941002"));
		list.add(new Member("육순신",38,"19950101"));
		
		System.out.println(list);
		
		for(Member m : list) {
			if( m.getAge()>=30) {
				System.out.println(m);
			}
		}
		
//		System.out.println("====1995년 이후에 태어난 사람들====");
//		for(Member m : list) {
//			String temp = m.getBirth().substring(0, 4);
//				int year = Integer.parseInt(temp);
//				if(year >1995) {
//					System.out.println(m);
//				}			
//		}
		System.out.println("===8월, 9월, 10월, 11월에 태어난 사람===");
		for(Member mt : list) {
			String tm= mt.getBirth().substring(4,6);
			int month = Integer.parseInt(tm);
			if(month > 7 && month<12) {
				System.out.println(mt);
			}
		}
		
		list.add(2,new Member("장영실",34,""));
		System.out.println(list);
		
		//생년월일이 없는 사람을 찾아서 그 사람의 나이를 보고 년도를 넣고
		//0월0일로 저장되게 하라
		
		for(Member mem : list) {
			if(mem.getBirth().isBlank()) {
				int year = 2024 - mem.getAge();
				mem.setBirth(year+"0000");
			}
		}
		System.out.println(list);

	}

}
