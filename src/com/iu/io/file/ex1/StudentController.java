package com.iu.io.file.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentController {

//	start 메서드
//	1. 학생 정보 출력 - 모든 학생의 정보 출력
//	2. 학생 정보 검색 - 해당 학생의 정보 출력(getStudent 메서드)
//	3. 학생 정보 추가 - 학생 한명의 정보 추가(setStudentAdd 메서드)
//	4. 학생 정보 삭제 - 학생 한명의 정보 삭제(setStudentDelete 메서드)
//	5. 백        업 - 현재 리스트에 있는 정보를 파일에 백업(setList 메서드)
//	6. 종        료 - 프로그램 종료
public void start() throws Exception {
	Scanner sc = new Scanner(System.in);
	StudentService ss = new StudentService();
	StudentView sv = new StudentView();
	ArrayList<StudentDTO> ar = new ArrayList<>();
	boolean check = true;
	
	while(check) {
		System.out.println("숫자를 입력하세요");
		System.out.println("1. 학생 정보 출력");
		System.out.println("2. 학생 정보 검색");
		System.out.println("3. 학생 정보 추가");
		System.out.println("4. 학생 정보 삭제");
		System.out.println("5. 백        업");
		System.out.println("6. 종        료");
		int num = sc.nextInt();
		
		if(num==1) {
			System.out.println("1. 학생 정보 출력");
			sv.view(ss.getList());
			System.out.println("===============================");
		} else if(num==2) {
			System.out.println("2. 학생 정보 검색");
			StudentDTO studentDTO = ss.getStudent(ss.getList());
			if(studentDTO==null) {
				sv.view("해당 학생이 없습니다");
			} else {
			sv.view(studentDTO);}
		} else if(num==3) {
			System.out.println("3. 학생 정보 추가");
			ss.setStudentAdd(ar);
			System.out.println("학생 정보가 추가되었습니다");
		} else if(num==4) {
			System.out.println("4. 학생 정보 삭제");
			int result = ss.setStudentDelete(ar);
			if(result==1) {
				System.out.println("학생 정보가 삭제되었습니다");
			} else {
				sv.view("해당 학생이 없습니다");
			}
		} else if(num==5) {
			System.out.println("5. 백        업");
				int result = ss.setList(ar);
				if(result==1) {
					System.out.println("백업이 완료됐습니다");
				} else {
					sv.view("백업에 실패했습니다");
				}
		} else {
			System.out.println("6. 종        료");
			check=!check;
		} 
				
	}
}	
	
}
