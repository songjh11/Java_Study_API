package com.iu.io.file.ex1;

import java.util.ArrayList;

public class StudentService implements Service {

	StudentDAO dao = new StudentDAO();
	ArrayList<StudentDTO> ar = new ArrayList<>();
	StudentDTO studentDTO = new StudentDTO();
	
	@Override
	public ArrayList<StudentDTO> getList() throws Exception {
		ar = dao.getList();		
		for(int i=0; i<ar.size(); i++) {
			studentDTO.setTotal(ar.get(i).getKor()+ar.get(i).getEng()+ar.get(i).getMath());
			studentDTO.setAvg(studentDTO.getTotal()/3);
			ar.add(studentDTO);
	}
		return ar;
	}

	@Override
	public int setList(ArrayList<StudentDTO> ar) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public StudentDTO getStudent(ArrayList<StudentDTO> ar) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int setStudentDelete(ArrayList<StudentDTO> ar) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setStudentAdd(ArrayList<StudentDTO> ar) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
