package com.Java_Advance.Day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ArraylistTest {

	public static void main(String[] args) {
		List<Integer> asList = Arrays.asList(6,4,5,1,3,2);
		Collections.sort(asList);
		Integer integer = asList.get(1);
		System.out.println(integer);
		
		System.out.println("=====================================");
		
		
		List<Integer> asList1 = Arrays.asList(6,4,5,1,3,2);
		List<Integer> collect = asList1.stream().sorted().collect(Collectors.toList());
		Integer integer2 = collect.get(1);
		System.out.println("2nd mehod =" +integer2);
		
		System.out.println("=====================================");
		
		int a[]= {6,4,5,1,3,2};
		List asList2 = Arrays.asList(a);
		asList2.stream().sorted(Comparator.naturalOrder())
        .skip(1)
        .findFirst()
        .get();
		
		System.out.println("asList2 = "+asList2);
		
	}
}
