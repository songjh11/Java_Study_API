package com.iu.util.calendar;

import java.util.Calendar;
import java.util.Date;

public class CalendarMain2 {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();//1506
		
		Calendar birth = Calendar.getInstance();//1601
		
		birth.set(Calendar.YEAR, 1991);
		birth.set(Calendar.MONTH, 10);
		birth.set(Calendar.DATE, 19);
		
		long n2 = now.getTimeInMillis();
		long b = birth.getTimeInMillis();
		
		long result2 = n2-b;
		
		System.out.println(result2/(1000*60*60*24));
		
		result2 = result2/(1000*60*60*24);
		
		System.out.println(result2/365);
		
		Date date = now.getTime();
		System.out.println(date);
		
//		future.set(Calendar.MINUTE, 15);
//		
//		long n = now.getTimeInMillis();
//		long f = future.getTimeInMillis();
//		
//		long result = f-n;
//		
//		System.out.println(result);
//		System.out.println(result/(1000*60));
		
		
		

	}

}
