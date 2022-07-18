package com.iu.lang.string;

public class StringStudy {

	
	public void studyCharAt() {
		//문자열=문자배열
		char[] ch = {'H','e','l','l','o',' ','W','o','r','l','d'};
		System.out.println(ch[0]);
		
		String str = "Hello World";
		char c = str.charAt(0);
		System.out.println(c);
//		c=str.charAt(159);//<-배열 범위를 벗어나서 에러남
//		c=str.charAt(-1);//<-배열 범위를 벗어나서 에러남
		System.out.println(str.length());
		
		System.out.println("=================================================");
		//str문자열에서 문자를 하나씩 꺼내서 출력
		
		String str2 = "Welcome to World";
		
		for(int i=0; i<str2.length(); i++) {
			System.out.println(str2.charAt(i));
		}
		
		System.out.println("=================================================");
		
		
		
	}
}
