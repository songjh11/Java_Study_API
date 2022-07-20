package com.iu.wrapper.ex1;

import java.util.Scanner;

import com.iu.lang.string.StringStudy3;

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
	int count = 2;
	
	public void juminCheck() {
	System.out.println("주민번호 입력");
	String jumin = sc.next();
//	String jumin = "971224-1234567";
	
	
	//1. subString()->String으로 반환되기 때문에 숫자로 바로 변환
//	String num = jumin.substring(i,i+1);
//	int n = Integer.parseInt(num);

	//2. charAt()->char->String->primitive타입으로 변환해줘야함
//	char ch = jumin.charAt(0);
//	int n = Integer.parseInt(ch+"");
//	String num = String.valueOf(ch);
//	int n = Integer.parseInt(num);
	for(int i=0; i<jumin.length()-1; i++) {
		if(i==6) {
			continue;
		} else {
			int n = Integer.parseInt(String.valueOf(jumin.charAt(i)));
			sum=(n*count)+sum;
				count++;
				if(count>9) {
					count = count-8;
						}
				}
			}
			int check = sum%11;
				check = 11-check;
				if(check>9) {
					check = check%10;
				}
		//check용 번호
		int checkNum = Integer.parseInt(String.valueOf(jumin.charAt(jumin.length()-1)));
		System.out.println(checkNum);
		
			if(check==checkNum) {
				System.out.println("정상");
			} else{
				System.out.println("비정상");
			}
				}
	}
	
	


