package com.iu.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client2 {
	
	//getFood
	//1. 서버에 접속 후
	//1. 점심메뉴
	//2. 저녁메뉴
	//3. 종료
	//번호를 입력 받아서 서버로 전송
	//받아서 메뉴 출력
	
	public void getFood() throws Exception {
		Scanner sc = new Scanner(System.in);
		Socket socket = new Socket("192.168.7.24", 8282);
		
		OutputStream os = null;
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;
		
		InputStream is = null;;
		InputStreamReader ir = null;
		BufferedReader br = null;
		
		boolean check = true;
		
		while(check) {
			os = socket.getOutputStream();
			ow = new OutputStreamWriter(os);
			bw = new BufferedWriter(ow);
			
			System.out.println("번호를 입력하세요");
			System.out.println("1. 점심 메뉴");
			System.out.println("2. 저녁 메뉴");
			System.out.println("3. 종    료");
			
			int select = sc.nextInt();
			bw.write(select+"\r\n");
			bw.flush();
			
			if(select==3) {
				System.out.println("프로그램 종료합니다");
				break;
			}
			
			is = socket.getInputStream();
			ir = new InputStreamReader(is);
			br = new BufferedReader(ir);
			
			String message = br.readLine();
			System.out.println(message);
						
		}
		
		br.close();
		ir.close();
		is.close();
		
		bw.close();
		ow.close();
		os.close();
		socket.close();
		
	}

}
