package com.iu.util.list;

import java.util.ArrayList;

public class ListMain2 {

	public static void main(String[] args) {
		
		ArrayList <String> ar = new ArrayList();//<-무조건 String타입만 담겠다
		ar.add("first");
//		ar.add(2);//<-Auto Boxing, 다형성 때문에. 모든 데이터 타입은 object타입이다
//		ar.add('c');
//		ar.add(2.123);
		ar.add(null);
		
		ListView lv = new ListView();
		lv.view(ar);

		//get ->특정 index 요소를 반환
		String n1 = (String)ar.get(0);
		System.out.println(n1);
//		int n2 = (int)ar.get(1);
//		System.out.println(n2);
//		char n3 = (Character)ar.get(2);
//		double n4 = (Double)ar.get(3);
//		System.out.println(n3);
//		System.out.println(n4);
		
		System.out.println(ar.get(0) instanceof String);//->ar의 0번 인덱스의 값이 String인지 물어보기
		
		//형변환은 primitive타입을 reference로 바꾸는거
		//다형성은 부모 자식 간의 데이터 대입을 위한 변환
		
//		ArrayList<E> ar2 = new ArrayList<>();
	}

}
