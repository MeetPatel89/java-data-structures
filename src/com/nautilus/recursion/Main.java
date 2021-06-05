package com.nautilus.recursion;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	// example of recursive static method in java
	public static Integer sumOf(List<Integer> list) {
		
		// Base case
		if (list.size() == 1) {
			return list.get(0);
		}
		
		// General recursive case
		return list.get(0) + sumOf(list.subList(1, list.size())); 
		
	}
	
	public static void main(String[] args) {
		System.out.println("Hello Main");
		
		List<Integer> numList = new ArrayList<Integer>();
		numList.add(5);
		numList.add(12);
		numList.add(11);
		numList.add(4);
		numList.add(34);
		System.out.println(sumOf(numList));
	}
}
