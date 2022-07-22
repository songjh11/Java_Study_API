package com.iu.exception;

public class MyException extends Exception {
	
	public MyException() {
		super("몰라요 산수 포기");
	}
	

	public MyException(String message) {
		super(message);//<-이게 생략되어 있음
		
	}
}
