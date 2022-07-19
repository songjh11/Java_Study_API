package com.iu.wrapper.ex1;

import java.util.Scanner;

public class WrapperEx2 {
	
	//JuminCheck
	//주민번호 입력받음
	//  9  7  1  1  2  4  -  1  2  3  4  5  6  7
	//* 2  3  4  5  6  7     8  9  2  3  4  5 
	// 18  21 4  5  12  28   8  18  6  12 20 30->합 구하기
	//총합을 11로 나누어서 나머지를 구함
	//나머지를 11에서 뺀 결과
	//11-5=6
	//나머지를 11에서 뺀 결과를 체크용 번호와 같은지 비교
	//11-0=11
	//만약에 위의 연산결과가 두자리라면 연산결과를 다시 10으로 나눈 나머지와 체크용 번호를 비교
	//11/10-----나머지1
	
	Scanner sc = new Scanner(System.in);
	StringBuffer sb = new StringBuffer();
	int sum=0;
	
	public void juminCheck() {
	System.out.println("주민번호 입력");
	String jumin = sc.next();
	char [] jumin2 = new char [jumin.length()];
	for(int i=0; i<jumin.length(); i++) {
		char jumin1;
		if(i==6) {
			continue;
		} else {
			jumin1=jumin.charAt(i);
			jumin2[i]=jumin1;
					}
	}
	String numbers = jumin.valueOf(jumin2);
	
	
	
	for(int i=0; i<jumin.length(); i++) {
		System.out.println(jumin2[i]);
	}
	for(int i=0; i<jumin.length(); i++) {
		if(i==6) {
			continue;
		}
		int j = jumin2[i];
		System.out.println(j);
		sum=(j*2)+sum;
				}
	}
	
	

}
