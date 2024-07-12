package j0712;

import java.util.ArrayList;

public class ArrayListStudy2 {

	public static void main(String[] args) {
		
		ArrayList<Asset> list = new ArrayList<>();
		
		list.add(new Asset("우리은행","1004-9112-3455","이순신",3450000));
		list.add(new Asset("농협은행","34-123-349393","삼순신",56650000));
		list.add(new Asset("신한은행","23423-22-4522","사순신",370000));
		list.add(new Asset("국민은행","77445-3332-324","오순신",1150000));
		list.add(new Asset("우리은행","374-5576-3234-55","육순신",250000));
		list.add(new Asset("신한은행","2097-7765-3712-22","칠순신",50000));
		list.add(new Asset("우리은행","9797-545-5443-33","팔순신",8050000));
		list.add(new Asset("국민은행","907653-333-223-12","구순신",250000));
		
		
		
		//문제 1. 우리은행을 이용하는 사람들 정보만 출력
		System.out.println("====우리은행을 이용하는 사람들====");
		for(Asset 우리 : list) {
			if(우리.getBank().equals("우리은행")) {
				System.out.println(우리);
			}
		}
		//문제 2. 잔액이 100만원 이상인 사람들 정보만 출력
		System.out.println("====잔액이 100만원 이상인 사람들====");
		for(Asset 백 : list) {
			if(백.getHolder()>=1000000) {
				System.out.println(백);
			}
		}
		//문제 3. 최무선이 우리은행 계좌를 가지고 있는지 확인하고
		//	     없으면 우리은행 계좌 개설(1007-23-1238954)
		System.out.println("====최무선씨 우리은행 계좌 있어?====");
		Asset asset=new Asset("우리은행","최무선","1007-23-1238954",0);
		
		if(!list.contains(asset)) {
			list.add(asset);
		}
		list.forEach(info -> System.out.println(info));
		


	}

}
