package com.iu.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client1 {
	
	public void send() throws Exception {
		Scanner sc = new Scanner(System.in);
		Socket socket = new Socket("192.168.7.24", 8282);
		System.out.println("Server 접속 완료");
		boolean check = true;

		//전송 준비
		OutputStream os = null;//0,1
		OutputStreamWriter ow = null;//문자 한글자
		BufferedWriter bw = null;;
		
		//수신 준비
		InputStream is = null;;
		InputStreamReader ir = null;
		BufferedReader br = null;

		while(check) {
			System.out.println("서버로 보낼 메시지를 입력하세요");
			String message = sc.next();//0과 1로 바꿔서 보내야함

			//전송 준비
			os = socket.getOutputStream();//0,1
			ow = new OutputStreamWriter(os);//문자 한글자
			bw = new BufferedWriter(ow);
			
				//전송
			bw.write(message+"\r\n");
			bw.flush();

		if(message.toUpperCase().equals("Q")) {
			System.out.println("연결을 종료합니다");
			check=!check;
			break;
		}
				
		//수신 준비
		is = socket.getInputStream();
		ir = new InputStreamReader(is);
		br = new BufferedReader(ir);
				
		//수신
		message = br.readLine();				
		
		if(message.toUpperCase().equals("Q")) {
			System.out.println("연결을 종료합니다");
			check=!check;
			break;
		}
		System.out.println("Server: "+message);
		}//while 끝
		
		//자원 해제
		bw.close();
		ow.close();
		os.close();
		
		br.close();
		ir.close();
		is.close();
		
		socket.close();
	}

}
