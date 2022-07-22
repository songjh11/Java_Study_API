package com.iu.io.file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {

	public void write() throws IOException { 
		File file = new File("C:\\Study\\name.txt");
		FileWriter fw = new FileWriter(file, true);
		fw.write("Todday is Friday\r\n");
//		fw.flush();
		fw.write("내일은 토요일\r\n");
		fw.flush();
		System.out.println("텍스트 입력 완료");
		
		}
	
}
