package com.iu.thread;

public class ThreadMain {

	public static void main(String[] args) {
		ThreadTest1 tt = new ThreadTest1();
		ThreadTest2 tt2 = new ThreadTest2();
		Thread t = new Thread(tt2);
				
		//개발자가 직접 호출이 아니라
		//os에게 실행 부탁
		
		tt.start();
		t.start();
		
		
	}

}
