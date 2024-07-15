package j0715;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Setstudy1 {

	public static void main(String[] args) {
		
		HashSet<String> 재학 = new HashSet<>();
		HashSet<String> 상민 = new HashSet<>();
		
		재학.add("짜장면"); 재학.add("볶음밥");
		재학.add("돈까스"); 재학.add("쭈꾸미볶음");
		
		상민.add("김치볶음밥"); 상민.add("떡볶이");
		상민.add("짜장면"); 상민.add("돈까스");
		
		// 교집합 - 두 개 이상의 그룹에 공통적인 값의 집합
		HashSet<String> 공통 = new HashSet<>();
		
		Iterator<String> it = 재학.iterator();
		while(it.hasNext()) {
			String 재학food = it.next();
			if(상민.contains(재학food)) {
				공통.add(재학food);
			}
		}
		
		System.out.println("재학, 상민 교집합 : " + 공통);
		
		// 차집합 - A집합에서 B집합과의 교집합 데이터를 제외한 데이터의 집합
		HashSet<String> 차집합 = new HashSet<>();
		it = 재학.iterator();
		while(it.hasNext()) {
			String 재학food = it.next();
			if( !상민.contains(재학food)) {
				차집합.add(재학food);
			}
		}
		System.out.println("상민에 대한 재학 차집합 : " + 차집합 );
		
		//합집합 - A집합과 B집합의 합(중복없이)
		HashSet<String> 합 = new HashSet<>();
		합=(HashSet<String>)재학.clone();
		합.addAll(상민);
		System.out.println(합);
		
		//합집합 - addAll
		//교집합 - retainAll   재학.retainAll(상민)
		//차집합 - removeAll   재학.removeAll(상민)
		
		HashSet<Integer> num1 = new HashSet<>();
		HashSet<Integer> num2 = new HashSet<>();
		HashSet<Integer> num3 = new HashSet<>();
		
		while(num1.size()<=15) {
			num1.add(Integer.valueOf((int)(Math.random()*50)+1));
			num2.add(Integer.valueOf((int)(Math.random()*50)+1));
			num3.add(Integer.valueOf((int)(Math.random()*50)+1));
		}
		
		//교집합
		HashSet<Integer> n교집합 = new HashSet<>();
		Iterator<Integer> n저장 = num1.iterator();
		while(n저장.hasNext()) {
			Integer num1숫 = n저장.next();
			if( num3.contains(num1숫)) {
				n교집합.add(num1숫);
			}
		}
		//차집합
		HashSet<Integer> n차집합 = new HashSet<>();		
		n저장=num1.iterator();
		while(n저장.hasNext()) {
			Integer num1숫 = n저장.next();
			if( !num2.contains(num1숫)) {
				n차집합.add(num1숫);
			}
		}

		//합집합
		HashSet<Integer> n합집합 = new HashSet<>();
		n합집합=(HashSet<Integer>)num1.clone();
		n합집합.addAll(num2);
		n합집합.addAll(num3);
//		System.out.println("num1과 num3의 교집합 : "+n교집합);
//		System.out.println("num1과 num2의 차집합 : "+n차집합);
//		System.out.println("num1, num2, num3의 합집합 : "+n합집합);
		
		
		n교집합=(HashSet)num1.clone();
		n교집합.retainAll(num3);
		System.out.println(n교집합);
		
		n차집합=(HashSet)num1.clone();
		n차집합.removeAll(num2);
		System.out.println(n차집합);

		n합집합=(HashSet)num1.clone();
		n합집합.addAll(num2);
		n합집합.addAll(num3);
		System.out.println(n합집합);
		
		
			
		

		
		//num1, num2, num3 세개의 집합을 만들고
		//각각 1~50까지의 랜덤값 15개를 저장하세요
		//num1과 num3의 교집합
		//num1과 num2의 차집합
		//num2와 num3의 교집합
		//num1,num2,num3의 합집합
		
		
		
//		HashSet<String> hash = new HashSet<>();
//		
//		hash.add("짜장면");
//		hash.add("짬뽕");
//		hash.add("순대국밥");
//		hash.add("들깨국수");
//		hash.add("맑은곰탕");
//		hash.add("짜장면");
//		
//		System.out.println(hash); 
//		hash.remove("짬뽕");
//		System.out.println(hash);
//		
//		for(String food : hash) {
//			System.out.println(food);
//		}
//		ArrayList<String> list= new ArrayList<>(hash);
//		System.out.println(list);
//		System.out.println(list.get(3));

	}

}
/*
  
  Set 인터페이스
   - HashSet , TreeSet
   - 순차대로 저장되지 않는다
   - 중복 허용되지 않는다
   - 인덱스가 없다
   - Set은 집합(데이터의 그룹)을 다룰 때 사용된다
   - HashSet -> 집합을 표현
   - TreeSet -> 검색에 특화	
  
 */
