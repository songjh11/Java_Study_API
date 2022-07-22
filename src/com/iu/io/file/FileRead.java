package com.iu.io.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {
	
	public void read() throws Exception {
		
		//파일의 내용을 읽어오려고 함
		//1. 어느 폴더의 어느 파일이냐
		File file = new File("C:\\Study", "name.txt");
		
		//2. 파일과 연결
		FileReader fr = new FileReader(file);
		
		//3. 파일의 내용을 읽기 위한 보조 스트림 연결
		//fr.read();: 한글자씩 읽어오기 때문에 한글은 깨짐
		BufferedReader br = new BufferedReader(fr);
		
		//4. 파일 내용 읽기
		boolean check = true;
		while(check) {
			String name = br.readLine();//엔터키를 만날때까지 읽어옴
			if(name==null) {
				break;
			}
			System.out.println(name);
		}
		
		
	}

}
