package com.iu.util.list.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class WeatherController {

	private WeatherService ws = new WeatherService();
	private Scanner sc = new Scanner(System.in);
	private WeatherView wv = new WeatherView();
	
	//1. 날씨 정보 초기화->init메서드 
	//2. 전국날씨출력
	//3. 지역날씨검색->find메서드
	//4. 지역정보추가->add메서드
	//5. 지역정보삭제->remove메서드
	//6. 프로그램 종료
	public void start () {
	ArrayList<CityDTO> ar = new ArrayList<>();//<-10칸이 미리 만들어짐
//	CityDTO cityDTO = new CityDTO();	
	boolean check = true;
	int num = 0;
	
	while(check) {
		System.out.println("숫자 입력");
		num = sc.nextInt();
		if(num==1) {
			System.out.println("1. 날씨 정보 초기화");
			ws.init(ar);
		} else if(num==2) {
			System.out.println("2. 전국 날씨 출력");
			wv.view(ar);			
		} else if (num==3) {
			System.out.println("3. 지역 날씨 출력");
			CityDTO cityDTO = ws.find(ar);
			if(cityDTO!=null) {
				wv.view(cityDTO);
			} else {
				System.out.println("잘못된 도시명");
			}
			
		} else if(num==4) {
			System.out.println("4. 지역 정보 추가");
			boolean result = ws.add(ar);
			String message = "추가 실패";
			if(result) {
				message= "추가 성공";
			}
			wv.view(message);
			
		} else if(num==5) {
			System.out.println("5. 지역 정보 삭제");
			boolean result = ws.remove(ar);
			String message = "삭제 실패";
			if(result) {
				message= "추가 성공";
			}
			wv.view(message);
			} else if(num==6) {
			System.out.println("6. 프로그램 종료");
			System.out.println("프로그램이 종료됩니다");
			check=!check;
		} else {
			System.out.println("없는 번호입니다");
		}
		
	}

}
}