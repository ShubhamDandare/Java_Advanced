package com.Java_Advance.Day3;

import java.util.LinkedList;
import java.util.List;

public class LinkList {

	public static void main(String[] args) {
		LinkedList<Integer> l=new LinkedList<Integer>();
		l.add(21);
		l.add(31);
		l.add(71);
		l.add(92);
		l.add(01);
		l.add(28);

		l.forEach(System.out::println);

	}
}
