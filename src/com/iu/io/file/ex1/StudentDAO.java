package com.iu.io.file.ex1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class StudentDAO {
	StudentDTO studentdto = new StudentDTO(); 

	
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
	public int setList(ArrayList<StudentDTO> ar) {
		File file = new File("C:\\Study","studentData.txt");
		FileWriter fw = null;
		int result = 1;
		try {	
			fw = new FileWriter(file, true);
			fw.write("\r\n");
			for(StudentDTO studentDTO: ar) {
				StringBuffer stringBuffer = new StringBuffer();
				stringBuffer.append(studentDTO.getName());
				stringBuffer.append(",");
				stringBuffer.append(studentDTO.getNum());
				stringBuffer.append(",");
				stringBuffer.append(studentDTO.getKor());
				stringBuffer.append(",");
				stringBuffer.append(studentDTO.getEng());
				stringBuffer.append(",");
				stringBuffer.append(studentDTO.getMath());
				stringBuffer.append("\r\n");
				fw.write(stringBuffer.toString());
				fw.flush();
					}
			} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result= 0;
		}
		return result;
	}

	
	
	
	
	public ArrayList<StudentDTO> getList() throws Exception  {
		File file = new File("C:\\Study","studentData.txt");
		ArrayList<StudentDTO> ad = new ArrayList<>();
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		br.readLine();//공백제거
		boolean check = true;
		
		while(check) {//while시작
			String studentData = br.readLine();//iu,1,56,54,85
				if(studentData==null) {
					break;
				}
			StringTokenizer st = new StringTokenizer(studentData, ",");
			while(st.hasMoreTokens()) {
			StudentDTO studentdto = new StudentDTO();
			studentdto.setName(st.nextToken().trim());
			studentdto.setNum(Integer.parseInt(st.nextToken().trim()));
			studentdto.setKor(Integer.parseInt(st.nextToken().trim()));
			studentdto.setEng(Integer.parseInt(st.nextToken().trim()));
			studentdto.setMath(Integer.parseInt(st.nextToken().trim()));
			ad.add(studentdto);	
						}
		}//while끝
			return ad;
	}
		
	

}
