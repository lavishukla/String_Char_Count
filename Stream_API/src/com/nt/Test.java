package com.nt;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(25);
		list.add(10);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(6);
		 
		List<Integer> collect = list.stream().filter(i-> i%2==0).collect(Collectors.toList());		
		
		System.out.println(list);
		System.out.println(collect);
		
	}
}
