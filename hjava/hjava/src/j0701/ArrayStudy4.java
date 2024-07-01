package j0701;

import java.util.Arrays;

public class ArrayStudy4 {

	public static void main(String[] args) {
		// 많은 양의 데이터를 다룰 때는 배열을 사용한다
		// 상황에 따라서는 배열을 쓰면 안되는 영우도 있지만
		// 보툥은 배열의 구조에 데이터를 저장한다
		
		// 동적 배열 만들기

//		int[] a= new int[5];
//		
//		a[0]=10; a[1]=20; a[4]=40;
//		
//		a[5]=50;
		
//		int [] num=new int [] {10,20,30,40,50};
//		//num[5]=60; 인덱스 범위 벗어나서 오류
//		//데이터를 추가로 더 저장하려면 배열의 크기를 늘려야 한다
//		int size=num.length; //기존 배열의 크기
//		
//		int[] temp=new int[size+1];
//		for(int i=0; i<size; i++) {
//			temp[i] = num[i];
//		}
//		num=temp;
//		num[5]=60;
//		System.out.println("크기 증가 후:"+Arrays.toString(num));
		
		//문자열에서 같다 비교는 .equals()로 한다
		//문자열에 특정문자나 문자열 포함여부는 .contains()
		//다음 주소중 선화동에 주소만 추출하여 배열에 저장하세요
		//배열에 잘 저장되었느지 확인 출력은 Arrays 이용하여 출력
		
		String[] addr = new String[] {
			
		"대전 중구 봉명동", "대전 중구 대사동", "대전 중구 선화동",
		"대전 중구 판암동", "대전 중구 가양동", 
		"대전 중구 대흥동", "대전 중구 둔산동", 
	};
		//addr[i].contains("선화동")
		String[] 선화동 = new String[addr.length];
		int end=0 , index=0;
		
		for(int i=0; i<addr.length; i++) {
			if(addr[i].contains("선화동")) {
				선화동[index++]=addr[i];
				//index++;
			}
		}
		System.out.println(Arrays.toString(선화동));
		
		//2차원 배열
		//1차원 배열의 공간에 1차원 배열을 연결해놓은 구조
		
		int [][] arr=new int[5][3];
		
		arr[0][0]=10;
		arr[0][1]=20;
		arr[0][2]=30;
		arr[1][0]=40;
		arr[2][1]=50;
		
		//고등학교 1학년 학생들의 성적
		//1학년은 1반부터 6반까지 있다
		//new int[6][30]
		
		int []a=new int[] {10,20,30,40,50,60,70,80,90,100};
		
		//for(int i=0; i<a.length; i++)
		for(int data : a) {//forEach, each
			System.out.println(data);
		}
		
		
	}
}
