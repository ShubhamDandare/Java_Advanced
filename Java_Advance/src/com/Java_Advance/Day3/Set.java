package com.Java_Advance.Day3;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Stack;
import java.util.TreeSet;

public class Set {
	public static void main(String[] args) {
		System.out.println("======================================= sortingInt");
		TreeSet<Integer> sortingInt = new TreeSet<Integer>();
		sortingInt.add(1);
		sortingInt.add(12);
		sortingInt.add(19);
		sortingInt.add(112);
		sortingInt.add(10);
		sortingInt.add(13);
		sortingInt.add(1121);
		sortingInt.add(189);
		sortingInt.add(133);
		
		for(Integer i:sortingInt) {
			System.out.println(i);
		}
		
		
		System.out.println("======================================= sortingTry");
		
		try {
			TreeSet<Integer> sortingTry = new TreeSet<Integer>();
			sortingTry.add(1);
			sortingTry.add(12);
			sortingTry.add(19);
			sortingTry.add(112);
			sortingTry.add(10);
			sortingTry.add(13);
			sortingTry.add(1121);
			sortingTry.add(189);
			sortingTry.add(133);
			
			for(Integer i:sortingTry) {
				System.out.println(i);
			}
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("======================================= sortingIntRev");
		
		TreeSet<Integer> sortingIntRev = new TreeSet<Integer>(Collections.reverseOrder());
		sortingIntRev.add(1);
		sortingIntRev.add(12);
		sortingIntRev.add(19);
		sortingIntRev.add(112);
		sortingIntRev.add(10);
		sortingIntRev.add(13);
		sortingIntRev.add(1121);
		sortingIntRev.add(189);
		sortingIntRev.add(133);
		
		for(Integer i:sortingIntRev) {
			System.out.println(i);
		}
		
		
		System.out.println("======================================= stack");

		Stack<String> stack=new Stack<String>();
		stack.push("shub");
		stack.push("ram");
		stack.pop();
		stack.push("SRK");
		
		stack.add("111");
		stack.push("1111");
		
		for(String s:stack) {
			System.out.println(s);
		}
		
		System.out.println("======================================= User");

		
		TreeSet<User> sortingUser = new TreeSet<User>(Comparator.comparing(User::getLast_name));
		sortingUser.add(new User("shubh", "dandare", 26));
		sortingUser.add(new User("pratik", "khan", 31));
		sortingUser.add(new User("neha", "lanj", 29));
		for(User i:sortingUser) {
			System.out.println(i);
		}
		
	
	
	
	
	}	
	
}
