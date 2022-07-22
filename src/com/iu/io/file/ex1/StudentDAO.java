package com.iu.io.file.ex1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class StudentDAO {
	StudentDTO studentDTO = new StudentDTO(); 
	File file = new File("C:\\Study","studentData.txt");
	ArrayList<StudentDTO> ad = new ArrayList<>();

	
	//DTO: Data Transfer Object 
	//DAO: Data Access Object
	
	//file data에 접근
	
	//1. getList 메서드 생성
	//	 studentData.txt 파일의 내용을 읽어서 작업
	
	//2. setList
	//	 예외 처리는 내부에서 처리(트라이 캐치 사용)
	// 	 List로 받은 데이터들을 StudentData에 작성
	// 	 기존의 내용은 삭제
	//	 작성 내용은 기존 내용과 동일하게
	//	 1을 리턴: 정상적인 성공
	//	 0을 리턴: 예외가 발생하는 경우
	//
	

	
	
	
	
	public ArrayList<StudentDTO> getList() throws Exception  {
		StudentDTO studentdto = new StudentDTO();
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String student = br.readLine();//공백
		boolean check = true;
		
		while(check) {
		student = br.readLine();//iu,1,56,54,85
				if(student==null) {
					break;
				}
			StringTokenizer st = new StringTokenizer(student, ",");
			studentdto.setName(st.nextToken());
			studentdto.setNum(Integer.parseInt(st.nextToken()));
			studentdto.setKor(Integer.parseInt(st.nextToken()));
			studentdto.setEng(Integer.parseInt(st.nextToken()));
			studentdto.setMath(Integer.parseInt(st.nextToken()));
			ad.add(studentdto);	
						}
		return ad;
		}
	
		
	public ArrayList<StudentDTO> score(ArrayList<StudentDTO> ar) {
		for(int i=0; i<ar.size(); i++) {
		studentDTO.setTotal(ar.get(i).getKor()+ar.get(i).getEng()+ar.get(i).getMath());
		studentDTO.setAvg(studentDTO.getTotal()/3);
		ar.add(studentDTO);
	}
		return ar;
}

}
