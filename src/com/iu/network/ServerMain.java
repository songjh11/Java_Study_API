package com.iu.network;

import java.net.ServerSocket;

public class ServerMain {

	public static void main(String[] args) {
		System.out.println("Server Start");
		
		Server1 s1 = new Server1();
		Server2 s2 = new Server2();
//		
//		try {
//			s2.getFood();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		try {
			s1.receive();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Server Finish");

	}

}
