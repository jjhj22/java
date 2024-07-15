package j0715;

import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetStudy {

	public static void main(String[] args) {
//		TreeSet<Integer> tree = new TreeSet<>();
//		tree.add(34); tree.add(45); tree.add(20);
//		tree.add(9); tree.add(40); tree.add(15);
//		tree.add(48); tree.add(2); tree.add(11); 
//		tree.add(39); tree.add(40);
//		System.out.println(tree);
//		System.out.println(tree.first());
//		System.out.println(tree.last());
//		//입력한 값보다 크거나 작은 값 중 가장 가까운 값 검색
//		System.out.println(tree.higher(20));
//		System.out.println(tree.lower(19));
//		
//		//입력한 값보다 크거나 작은 모든 값
//		System.out.println(tree.headSet(35));
//		System.out.println(tree.tailSet(30));
//		
//		//입력한 값들의 사이 값을 검색
//		System.out.println(tree.subSet(9, 39));
//
//		TreeSet<String> word = new TreeSet<>();
//		word.add("이순신"); word.add("삼순신");
//		word.add("사순신"); word.add("오순신");
//		word.add("육순신"); word.add("칠순신");
//		word.add("구순신"); word.add("십순신");
//		
//		System.out.println(word);
		
		//90점 이상 - 상위 10% 
		//70점 이상 - 상위 30%
		//40점 이상 - 상위 80%
		
		Scanner scan = new Scanner(System.in);
		
		TreeSet<Integer> rank = new TreeSet<>();
		rank.add(90); rank.add(70); rank.add(40);
		
		//나의 점수를 입력하여 상위 몇프로 인지 출력
//		System.out.println("내 점수는 몇점? :");
//		int myscore=scan.nextInt();
//		if(rank.lower(myscore)>=90) {
//			System.out.println("상위 10%입니다");
//		}else if(rank.lower(myscore)>=70) {
//			System.out.println("상위 30%입니다");
//		}else if(rank.lower(myscore)>=40) {
//			System.out.println("상위 80%입니다");
//		}else {
//			System.out.println("공부머리는 아닌 것 같습니다");
//		}
		
		
		TreeSet<String> score = new TreeSet<>();
		score.add("89점 이순신"); score.add("25점 윤석열");
		score.add("45점 이명박"); score.add("18점 전두환");
		score.add("19점 박근혜"); score.add("99점 노무현");
		//내 점수를 입력하고 나보다 점수가 높은 사람들 출력
		
		System.out.println("내 점수는 몇 점? :");
		String myscore=scan.next();
		System.out.println(score.tailSet(myscore));
		
		
		
	}

}
/*
 	Tree 구조를 이용하여 값을 저장시키는 TreeSet
 	- 순차적으로 데이터 저장하지 않는다
 	- 중복 허용하지 않음
 	- 이진트리를 사용하기 때문에 데이터가 정렬되어 출력된다
 	- 범위 검색 또는 데이터 중복방지 및 정렬에 용이하다
 		
 		
 		
 		
 	
 */
