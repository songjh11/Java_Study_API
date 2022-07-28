package com.iu.io.file.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentService implements Service {

	private StudentDAO dao;
	
	public StudentService() {
		this.dao = new StudentDAO();
		
	}
	
	StudentDTO studentDTO = new StudentDTO();
	Scanner sc = new Scanner(System.in);
	
	@Override
	public ArrayList<StudentDTO> getList() throws Exception {
			ArrayList<StudentDTO> ar = dao.getList();	
			for(StudentDTO studentDTO: ar) {
			studentDTO.setTotal(studentDTO.getKor()+studentDTO.getEng()+studentDTO.getMath());
			studentDTO.setAvg(studentDTO.getTotal()/3.0);
			}
		return ar;
		}

	@Override
	public int setList(ArrayList<StudentDTO> ar) throws Exception {
		//StudentDAO에서 setList를 호출하고 결과를 리턴
		return dao.setList(ar);
	}
	@Override
	public StudentDTO getStudent(ArrayList<StudentDTO> ar) throws Exception {
		//찾으려고 하는 학생의 번호를 입력 받고 찾은 학생을 리턴, 학생이 없으면 Null값 리턴
		System.out.println("학생 번호를 입력하세요");
		int num = sc.nextInt();
//		ar = this.getList();
		StudentDTO studentDTO = null;
		for(int i=0; i<ar.size(); i++) {
			if(num==ar.get(i).getNum()) {
				studentDTO = ar.get(i);
				break;
				} 
			}
				return studentDTO;
	}

	@Override
	public int setStudentDelete(ArrayList<StudentDTO> ar) throws Exception {
		//삭제하려는 학생의 번호를 입력 받아서 일치하는 학생을 삭제
		//삭제가 성공하면 1을 리턴, 실패하면 0을 리턴
		
		System.out.println("삭제하려는 학생 번호를 입력하세요");
		int result = 0;
//		ar = this.getList();
		int num = sc.nextInt();
		for(int i=0; i<ar.size(); i++) {
			if(num==ar.get(i).getNum()) {
				StudentDTO studentDTO = ar.remove(i);
				if(studentDTO!=null) {
					result = 1;
				}
				break;
			}
		} 		
		return result;
	}

	@Override
	public void setStudentAdd(ArrayList<StudentDTO> ar) throws Exception {
		//학생의 정보를 입력받아서 학생 한명 추가
		StudentDTO studentDTO = new StudentDTO();
		System.out.println("추가할 학생 이름을 입력하세요");
		studentDTO.setName(sc.next());
		System.out.println("추가할 학생 번호를 입력하세요");
		studentDTO.setNum(sc.nextInt());
		System.out.println("추가할 국어 점수를 입력하세요");
		studentDTO.setKor(sc.nextInt());
		System.out.println("추가할 영어 점수를 입력하세요");
		studentDTO.setEng(sc.nextInt());
		System.out.println("추가할 수학 점수를 입력하세요");
		studentDTO.setMath(sc.nextInt());
		studentDTO.setTotal(studentDTO.getKor()+studentDTO.getEng()+studentDTO.getMath());
		studentDTO.setAvg(studentDTO.getTotal()/3.0);
		ar.add(studentDTO);
		this.setList(ar);
	}

}
