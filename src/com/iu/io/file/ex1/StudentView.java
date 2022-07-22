package com.iu.io.file.ex1;

import java.util.ArrayList;

public class StudentView {
	
//	View 3개
//	1. String 출력
//	2. StudentDTO 출력
//	3. ArrayList<StudentDTO> 출력
	

	public void view(String message) {
		System.out.println(message);
	}
	
	public void view(StudentDTO studentDTO) {
	System.out.println("이   름: "+studentDTO.getName());
	System.out.println("번   호: "+studentDTO.getNum());
	System.out.println("국어점수: "+studentDTO.getKor());
	System.out.println("영어점수: "+studentDTO.getEng());
	System.out.println("수학점수: "+studentDTO.getMath());
	System.out.println("총   점: "+studentDTO.getTotal());
	System.out.println("평   균: "+studentDTO.getAvg());
		}
	
	public void view(ArrayList<StudentDTO> ar) {
		for(StudentDTO a: ar) {
			System.out.println("이   름: "+studentDTO.getName());
			System.out.println("번   호: "+studentDTO.getNum());
			System.out.println("국어점수: "+studentDTO.getKor());
			System.out.println("영어점수: "+studentDTO.getEng());
			System.out.println("수학점수: "+studentDTO.getMath());
			System.out.println("총   점: "+studentDTO.getTotal());
			System.out.println("평   균: "+studentDTO.getAvg());
		}
		
	}
}
