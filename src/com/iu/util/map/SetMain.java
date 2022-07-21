package com.iu.util.map;

import java.util.HashSet;
import java.util.Iterator;

public class SetMain {

	public static void main(String[] args) {
		HashSet<Integer> hashset = new HashSet<>();
		
		hashset.add(10);
		hashset.add(1);
		hashset.add(10);
		
		System.out.println(hashset.size());
		
		Iterator<Integer> it = hashset.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
