package com.iu.util.list;

import java.util.ArrayList;

public class ListMain {

	public static void main(String[] args) {
		//1,2,3
		int [] nums = new int[3];
		nums[0] = 1;
		
		//1. List-> ArrayList
		
		ArrayList ar = new ArrayList();
		
		ar.add(1);//->원래 object타입이 들어가야 하기 때문에 int->Intiger로 변환했어야 했는데 auto Boxing해서 자동으로 변환, 꺼낼 때도 자동으로 변환 
		ar.add(2);
		ar.add(3);
		ar.add(4);
		ar.add(0);//->추가는 무조건 맨 마지막에
		ar.add(1,"abc");//->1번 인덱스에 있는 애를 뒤로 밀고 "abc"가 1번 자리에 들어감
		ListView lv = new ListView();
		
		lv.view(ar);
		//remove - 특정 인덱스 번호의 요소(=elements)를 삭제
		ar.remove(2);
		ar.remove("abc");
		lv.view(ar);
		
		//set - 특정 인덱스 번호의 요소를 수정
		ar.set(1, 'c');//->원래 object타입이 들어가야 하기 때문에 char->character로 변환했어야 했는데 auto Boxing해서 자동으로 변환, 꺼낼 때도 자동으로 변환 
		lv.view(ar);
		
		//clear - 모든 요소를 삭제
		
		ar.clear();
		lv.view(ar);
		
		System.out.println(ar.size());
		
		
		

	}

}
