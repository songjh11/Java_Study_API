package com.iu.util.list.ex1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

import com.iu.lang.string.ex1.WorkerDTO;

public class WeatherService extends CityDTO {
	
	//	init메서드 
	//	sb에 있는 데이터를 파싱해서 CityDTO에 담아서 리턴->ArrayList
		
	//	add메서드
	//	city정보를 입력 받아서 추가
		
	//  remove메서드
	//	도시명을 입력 받아서 리스트에서 삭제
	
	//	find메서드
	//	도시명을 입력 받아서 리스트에서 검색
	CityDTO cd = new CityDTO();
	Scanner sc = new Scanner(System.in);
	
	
	StringBuffer sb;
	public WeatherService() {
		sb=new StringBuffer();
		sb.append("Seoul,30.2,70,맑음,");
		sb.append("Daegu-38.9-90-흐림-");
		sb.append("Jeju,12.1,10,눈,");
		sb.append("Busan-0.5,85,태풍");
	}
	
	public void init(ArrayList<CityDTO> ar) {//->초기화
		String newInfo = sb.toString();
		newInfo = newInfo.replaceAll("-",",");
		StringTokenizer st = new StringTokenizer(newInfo, ",");
		while(st.hasMoreTokens()) {
			CityDTO cityDTO = new CityDTO();
			cityDTO.setName(st.nextToken());
			cityDTO.setGion(Double.parseDouble(st.nextToken()));
			cityDTO.setHum(Integer.parseInt(st.nextToken()));
			cityDTO.setStatus(st.nextToken());
			ar.add(cityDTO);
						}
		System.out.println("초기화를 완료했습니다");
					}
	
	public boolean add(ArrayList<CityDTO> ar) {
		CityDTO cityDTO = new CityDTO();
		System.out.println("도시 입력");
		cityDTO.setName(sc.next());
		System.out.println("기온 입력");
		cityDTO.setGion(sc.nextDouble());
		System.out.println("습도 입력");
		cityDTO.setHum(sc.nextInt());
		System.out.println("상태 입력");
		cityDTO.setStatus(sc.next());
		return ar.add(cityDTO);		
	}
	
	public boolean remove(ArrayList<CityDTO> ar) {
		CityDTO cityDTO2 = new CityDTO();
		boolean flag = false;
		System.out.println("도시 입력");
		String cityname = sc.next().toUpperCase();
		for(int i=0; i<ar.size(); i++) {
			if(cityname.equals(ar.get(i).getName().toUpperCase())) {
				ar.remove(ar.get(i));
				flag=!flag;
				break;
				} 
			}
			return flag;}
	
	
//	public void find(ArrayList<CityDTO> ar) {
//		boolean flag = true;
//		while(flag) {
//		System.out.println("도시 입력");
//		String cityname = sc.next().toUpperCase();
//			for(int i=0; i<ar.size(); i++) {
//				if(cityname.equals(ar.get(i).getName().toUpperCase())) {
//				System.out.println("도시명: "+ar.get(i).getName()+"\n기온: "+ar.get(i).getGion()+"\n습도: "+ar.get(i).getHum()+"\n상태: "+ar.get(i).getStatus());
//				flag=!flag;
//					}
//				}
//			if(flag==true) {
//				System.out.println("해당 도시가 없습니다");
//				flag=!flag;					}
//			}//While끝
//	}
	
	public CityDTO find(ArrayList<CityDTO> ar) {
		CityDTO cityDTO = null;
		System.out.println("도시명 입력");
		String name = sc.next().toUpperCase();
		
		//향상된 for
		for(CityDTO c: ar) {
			if(name.equals(c.getName().toUpperCase())) {
				cityDTO = c;
				break;
			}
		}		
		return cityDTO;
	}
}