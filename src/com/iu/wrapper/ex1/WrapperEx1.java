package com.iu.wrapper.ex1;

import java.util.Scanner;

public class WrapperEx1 {
	//ex1 메서드 생성
	//스캐너로부터 주민번호 입력: 6자리-7자리 971123-2048593
	//1. 주민번호 입력 받고 남자 여자 판단
	//2. 현재 나이 출력
	//3. 3~5월 사이에 태어난 사람은 봄
	//   6~8월은 여름
	//   9~11월은 가을
	//   12~2월은 겨울

	public void ex1() {
	Scanner sc = new Scanner(System.in);
	System.out.println("주민번호 입력");
	String pn = sc.next();
	this.check1(pn);
	this.age(pn);
	this.season(pn);
	}
	
	private void check1(String pn) {
		//1. 성별 판단
		char c =pn.charAt(7);
		if(c=='1'||c=='3') {
			System.out.println("남자");
		} else if(c=='2'||c=='4') {
			System.out.println("여자");
		}
	}
	private void age(String pn) {
		//2. 현재 나이 출력
		String year = pn.substring(0, 2);//년도
		char g = pn.charAt(7);//1900,2000		
		int year2 = Integer.parseInt(year);
		if(g=='1'||g=='2') {
			System.out.println("나이: "+(2022-1900-year2));
		} else {
			System.out.println("나이: "+(2022-2000-year2));
		}
		
	}
	
	private void season(String pn) {
		pn= pn.substring(2, 4);
		int mon = Integer.parseInt(pn);
		if(3<=mon&&mon<=5) {
			System.out.println("봄에 태어났습니다");
		} else if(6<=mon&&mon<=8) {
			System.out.println("여름에 태어났습니다");
		}else if(9<=mon&&mon<=10) {
			System.out.println("가을에 태어났습니다");
		}else if(11<=mon||mon<=2) {
			System.out.println("겨울에 태어났습니다");
		}
		
	}

}
