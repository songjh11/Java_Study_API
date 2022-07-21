package com.iu.util.map;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class SetMain2 {

	public static void main(String[] args) {
		//Random
		//6개 숫자를 뽑는데 1-45까지 중복x->출력
		
		Random random = new Random();
		HashSet <Integer> nums = new HashSet<>();
		System.out.println("로또 번호");
		while(nums.size()!=6) {
			int num = random.nextInt(45)+1; 
			nums.add(num);
					}
		Iterator<Integer> it = nums.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
				}
			System.out.println(nums);

	}

}
