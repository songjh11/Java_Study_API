package com.iu.io.file;

import java.io.File;

public class FileMain {

	public static void main(String[] args) {
		//file: 파일이나 폴더의 정보를 담는 클래스
		//	  : 실제 파일이나 폴더가 없을 수도 있음
		File file = new File("c:\\Study\\test.txt");
		file = new File("C:\\Study", "test.txt");//parent: 폴더, child: 파일명 또는 최종 폴더명
		
		//1. 폴더명 경로가 있는 File객체를 이용
		File path = new File("C:\\Study");
		file = new File(path, "test.txt");
		
		
		System.out.println(path.exists());
		System.out.println(path.isFile());
		System.out.println(path.isDirectory());
		System.out.println("======================================");
		
		System.out.println(file.exists());
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
		System.out.println(file.length());
		
		file = new File("C:\\Study\\sub");
		if(!file.exists()) {
			file.mkdir();
			System.out.println("폴더 생성");
		}
		
		File file2 = new File("C:\\Study\\sub2\\t1");
		file2.mkdirs();
		
//		file.delete();
		
		File file3 = new File("C:\\Study\\sub2");
		
//		file2.delete();
//
//		file3.delete();
		
		
	}

}
