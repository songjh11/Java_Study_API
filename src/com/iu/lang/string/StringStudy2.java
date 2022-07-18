package com.iu.lang.string;

import java.util.Scanner;

public class StringStudy2 {
	
	public void studyIndexof() {
		String str = "Hello Java";
		
		int c = str.indexOf('o');//<-ch: char
		
		System.out.println(c);

		String replace =str.replace('l','w');
		System.out.println(replace);
		System.out.println(str);
		
		str = "Google....Google";
		System.out.println(str);
		
		str = str.replace("Google", "Samsung");
		System.out.println(str);
		
		str = "hi";
		String str2 = " h i ";
		System.out.println(str.equals(str2));
		
		str2 = str2.trim();
		System.out.println(str.equals(str2));
		
		str2=str2.replace(" ", "");
		System.out.println(str.equals(str2));
	}

	public void studyIndexof2() {
		String names = "iu, suji, choa, hani, qwerty";
		//1. name에는 몇개의 쉼표가 있는가
		//2. 총 몇명입니까
		int num = 0;
		int j =0;
		
		boolean check = true;
		int index=0;
		int count = 0;
		
		while(check) {
			index = names.indexOf(",", index);
			if(index==-1) {
				break;
			} else {
				count++;
				index++;
			}
		}//while끝
		
		System.out.println("쉼표의 갯수: "+count+"개");
		System.out.println("총 "+(count+1)+"명");
				
		for(int i=0; i<names.length(); i++) {
			num = names.indexOf(",", num);
				if(num!=-1) {
					num++;
					j++;
						} else {
							break;
						}
					}		
					System.out.println("쉼표의 갯수: "+j+"개");
					System.out.println("총 "+(j+1)+"명");
	}
	
	public void studySubString() {
		//아이디/비밀번호
		String member = "iu/1234";
		String pw = member.substring(3);
		String id = member.substring(0, 2);//0-2미만 출력
		
		System.out.println(pw);
		System.out.println(id);
		
	}
	
	public void ex2() {
		//키보드로부터 파일명을 입력 받음, abc.txt<-확장자까지
		//파일이 이미지 파일인지 아닌지를 구별
		//이미지 파일이면 이미지 파일입니다
		//아니면 이미지 파일이 아닙니다
		//확장자가 jpg, png, gif, jpeg 면 이미지 파일
		
		Scanner sc = new Scanner(System.in);
		System.out.println("파일명 입력");
		String file = sc.next();
		int num = file.lastIndexOf(".");
		int num2 = 0;
		String fileName = file.substring(num+1);
		String [] img = {"jpg", "png", "gif", "jpeg"};
		String result = "이미지 파일이 아닙니다";
		for(int i=0; i<img.length; i++) {
			if(fileName.equals(img[i])){
				result = "이미지 파일입니다";
				break;
			} 		
		}
		System.out.println(result);
		}
	}
	

