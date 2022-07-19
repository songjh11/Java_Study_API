package com.iu.lang.string;

public class StringStudy3 {

	
	public void studySplit() {
		String str = "iu,suzy,choa,hani";
		
		String [] names = str.split(",");
		
		//for-> for(초기식; 조건식; 증감식){}
		//향상된 for문 for(배열에모은데이터타입 변수명: 배열의 참조변수명)
		
		for(String name: names) {
			System.out.println(name);
				}
					}
	
	public void studySplit2() {
		String info = "1997 12 24";
		String [] days = info.split(" ");
		
		for(String day: days) {
			System.out.println(day);
			}
		}
	
	public void studySplit3() {
		String info = "서울,대전-대구,부산-제주,광주-강릉";
		//전처리
		info = info.replaceAll(",", "-");
		String [] rs =  info.split("-");
			for(String r: rs) {
				System.out.println(r);
			}
	}
	
}
