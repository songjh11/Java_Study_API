package com.iu.lang.string;

public class StringBufferStudy {

	public static void main(String[] args) {
		String str1 = "max";
		String str2 = "age";
		
//		str1 = str1+str2;
		
		System.out.println("num1"+"1"+"num2"+2);
		
		StringBuffer sb = new StringBuffer();
		sb.append(str1);
		sb.append(str2);
		sb.append(10);
		
		sb.append("num1");
		
		String result = sb.toString();
		System.out.println(sb);
		System.out.println(result);
		

	}

}
