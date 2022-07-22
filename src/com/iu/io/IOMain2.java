package com.iu.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class IOMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Scanner sc = new Scanner(System.in);
		//DDOS
		//Distribute Denial Of Service
		//sc.close();//<-자원 낭비 방지
		
		InputStream is = System.in;//0,1 처리
		InputStreamReader ir = new InputStreamReader(is);//<-글자
		BufferedReader br = new BufferedReader(ir);//<-문자열
		
		System.out.println("입력");
		
		try {
			String message = br.readLine();
			System.out.println(message);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//연결된 역순으로 자원 해제
			try {
				br.close();
				ir.close();
				is.close();
			} catch (Exception e) {
				e.printStackTrace();
				}
		}
	}
}
