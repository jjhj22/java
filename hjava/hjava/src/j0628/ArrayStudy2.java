package j0628;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayStudy2 {
	
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		//음료 검색하여 음료이름과 금액이 출력되게 하세요
		//카페 배열에 없는 음료 검색시 죄송합니다. 준비중입니다. 라고 출력
		
		String[] 까페 = new String[] {
				"아메리카노 : 1000","돌차라떼 : 5000","아이스티 : 2300",
				"얼그레이티 : 2000","수박쥬스 : 4300","오랜지쥬스 : 1500",
				"레몬에이드 : 3000","에소프레소 : 1900","카페모카 : 5400",
				"자몽에이드 : 4000","유자차 : 4300","청포도에이드 : 2700",
		};
		
		System.out.println("주문하세요:");
		String 검색=scan.nextLine();
		
		boolean isDrink=true;
		for(int i=0; i<까페.length; i++) {
			if(까페[i].contains(검색)) {
				System.out.println(까페[i]);
				isDrink=false;
			}
			
		}
		if(isDrink) {
			System.out.println("죄송합니다.준비중입니다");
		}
		
//		String word="i like banana";
//		
//		//문자열에서 특정 문자나 문자열의 위치찾기 - indexOf
//		System.out.println(word.indexOf("like"));
//		
//		//문자열에서 특정 문자나 문자열의 존재유뮤 - true, false
//		System.out.println(word.contains("a"));
//		String[] a= new String[] {"banana","orange"};
//		
//		a[0].indexOf("na");; //2
		
		//name 배열의 문자열 중에서 이성계, 문익점, 정도전, 최영을
		//선발대 배열에 저장하고 출력하세요
		
//		String[] name =new String[] {
//				"이순신","김유신","장보고","이성계","문익점","정도전","최영","양만춘"
//		};
//		
//		String[] 선발대 = new String[4];
//		
//		System.arraycopy(name, 3, 선발대, 0, 4);
//		System.out.println(Arrays.toString(선발대));
//		
		//6명의 키를 tall배열에 저장하였다
		//키 175미만을 출력하세요
		
//		float[] tall= new float[]{173.4f, 123.3f, 154.7f, 197.5f, 183.5f, 178.4f};
//		
//		
//		for(int i=0; i<tall.length; i++) {
//			if(tall[i]<175){
//				System.out.println(tall[i]);
//			}
//		}
		
		//과자 배열에 좋아하는 과자의 판매가격을 키보드로 입력하여
		//저장하시오.
		//과자 배열에 저장된 판매가격들의 총합과 평균을 구하시오.
		
//		int[] 과자 = new int[5];
		
//		for(int i=0; i<과자.length; i++) {
//		System.out.println("과자"+(i+1)+"가격:");
//		과자[i]=scan.nextInt();
//	}
//	int total=0 , avg=0; //총합과 평균
//	for(int i=0; i<과자.length; i++) {
//		total=total + 과자[i];
//	}
//	avg=total / 과자.length;
//	System.out.println("총합:"+total+"평균:"+avg);
		
//		System.out.println("포카칩:");
//		과자[0]=scan.nextInt();
//		System.out.println("사또밥:");
//		과자[1]=scan.nextInt();
//		System.out.println("도리토스:");
//		과자[2]=scan.nextInt();
//		System.out.println("고래밥:");
//		과자[3]=scan.nextInt();
//		System.out.println("허니버터칩:");
//		과자[4]=scan.nextInt();
//		int 총합=과자[0]+과자[1]+과자[2]+과자[3]+과자[4];
//		System.out.println("총합:"+총합);
//		int 평균=총합/5;
//		System.out.println("평균"+평균);
		

	}

}
