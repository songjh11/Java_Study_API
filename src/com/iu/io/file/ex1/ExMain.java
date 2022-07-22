package com.iu.io.file.ex1;

import java.util.ArrayList;

public class ExMain {

	public static void main(String[] args) {


		StudentDAO dao = new StudentDAO();
		ArrayList<StudentDTO> as = new ArrayList<>();
		StudentController   ss = new StudentController();
		try {
			ss.start();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			
		

	}

}
