package com.iu.util.calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;

public class CalendarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Calendar ca = new GregorianCalendar();
		// 현재 년 월 일 시 분 초 밀리세컨즈
		Calendar ca = Calendar.getInstance();
		System.out.println(ca);
		ca.set(2002, 11, 25);
		
		
		int y = ca.get(Calendar.YEAR);
		int m = ca.get(Calendar.MONTH);
		int d = ca.get(Calendar.DATE);
		int h = ca.get(Calendar.HOUR);
		int m2 = ca.get(Calendar.MINUTE);
		int s = ca.get(Calendar.SECOND);
		int ms = ca.get(Calendar.MILLISECOND);
		System.out.println(y+"년"+m+"월"+d+"일"+h+"시"+m2+"분"+s+"초"+ms+"밀리세컨드");
		
		long millis = ca.getTimeInMillis();
		
		System.out.println(millis);
		
		Random random = new Random(millis);
		
		for(int i=0; i<10; i++) {
		System.out.println(random);
		}
		
	}

}
