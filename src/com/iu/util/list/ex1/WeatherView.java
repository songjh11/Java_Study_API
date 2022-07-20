package com.iu.util.list.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class WeatherView {
	
	//view메서드
	//리스트를 받아서 모든 정보를 출력
	
	//view메서드
	//city하나를 받아서 모든 정보를 출력
	
	//view메서드
	//메시지(String) 하나를 받아서 출력
Scanner sc = new Scanner(System.in);
	
	public void view(String string) {
		System.out.println(string);
	}
//		public void view(String string, CityDTO cityDTO) {
//			for(int i=0; i<; i++) {
//				System.out.println("도시명: "+cityDTO.getName()+"\n기온: "+ar.get(i).getGion()+"\n습도: "+ar.get(i).getHum()+"\n상태: "+ar.get(i).getStatus());
//			}
//		}
			public void view(ArrayList<CityDTO> ar, CityDTO cityDTO) {
				CityDTO cityDTO2 = new CityDTO();
				System.out.println("도시 입력");
				String cityname = sc.next().toUpperCase();
				for(int i=0; i<ar.size(); i++) {
					if(cityname.equals(ar.get(i).getName().toUpperCase())) {
					System.out.println("도시명: "+ar.get(i).getName()+"\n기온: "+ar.get(i).getGion()+"\n습도: "+ar.get(i).getHum()+"\n상태: "+ar.get(i).getStatus());
					break;
				}else {
						System.out.println("해당 도시가 없습니다");
						}
				}
			}
		
}
