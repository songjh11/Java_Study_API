package com.iu.lang.string.ex1;

public class WorkerService {

//	private String info;
	private StringBuffer sb = new StringBuffer();


	public WorkerService() {
		sb.append("iu-인사과-과장-0101111");
		sb.append(", suzy-IT-대리-0102222");
		sb.append(", choa-영업-부장-0103333");
		sb.append(", hani-마케팅-사원-0104444");
				}
		
	public WorkerDTO[] init() {
		//info 파싱해서 WorkerDTO에 대입하고 
		//WorkerDTO를 모은 배열을 리턴
				
		String info = this.sb.toString();
		info = info.replaceAll(",", "-");
		info = info.replaceAll(" ", "");
		String [] info2 = info.split("-");
		
		WorkerDTO [] wd = new WorkerDTO [info2.length/4];
		int j = 0;
		for(int i=0; i<info2.length; i++) {
			WorkerDTO workerDTO = new WorkerDTO();
			workerDTO.setName(info2[i]);
			workerDTO.setDepartment(info2[++i]);
			workerDTO.setJob(info2[++i]);
			workerDTO.setPhone(info2[++i]);
			wd[i/4]=workerDTO;
					}	
		return wd;
			}
}
