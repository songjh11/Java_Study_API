package com.iu.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server1 {
	
	public void receive() throws Exception {
		Scanner sc = new Scanner(System.in);
		ServerSocket serverSocket = new ServerSocket(8282);
		//서버 오픈하고 Client 접속 기다림
		System.out.println("Client 접속 기다리는 중");
		//Socket은 상대방과 일대일 통신
		
		Socket socket = serverSocket.accept();
		System.out.println("Client 접속 완료");
		
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
				
		OutputStream os = null;
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;
		
		boolean check = true;		
		
		while(check) {
		
		is = socket.getInputStream();
		ir = new InputStreamReader(is);
		br = new BufferedReader(ir);
		String message = br.readLine();
		if(message.toUpperCase().equals("Q")) {
			System.out.println("연결을 종료합니다");
			check=!check;
			break;
		}
		
		System.out.println("Client: "+message);
					
		os = socket.getOutputStream();
		ow = new OutputStreamWriter(os);
		bw = new BufferedWriter(ow);
		
		System.out.println("메시지를 입력하세요");
		message = sc.next();
		
		bw.write(message+"\r\n");
		bw.flush();
		
		if(message.toUpperCase().equals("Q")) {
			System.out.println("연결을 종료합니다");
			check=!check;
			break;
		}
		}
		bw.close();
		ow.close();
		os.close();
				
		br.close();
		ir.close();
		is.close();
		
		socket.close();
		serverSocket.close();		
	}

}
