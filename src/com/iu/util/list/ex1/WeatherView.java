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
		public void view(CityDTO cityDTO) {
			System.out.println("도시명: "+cityDTO.getName()+"\n기온: "+cityDTO.getGion()+"\n습도: "+cityDTO.getHum()+"\n상태: "+cityDTO.getStatus());
			}
		
			public void view(ArrayList<CityDTO> ar) {
				for(int i=0; i<ar.size(); i++) {
					CityDTO cityDTO = ar.get(i);
					this.view(cityDTO);
								}
			}
		
}
