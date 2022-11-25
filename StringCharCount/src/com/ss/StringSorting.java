package com.ss;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StringSorting {

	public static void main(String[] args) {
		
		System.out.println("Enter String");
		Scanner s = new Scanner(System.in);
		String value = s.nextLine();
		
		char[] cr = value.toCharArray();
		Map<Character, Integer> map = new HashMap<>();
		
		for(int i=0; i<cr.length;i++) {
			int count =0;
			for(int j=0;j<cr.length;j++) {
				if(cr[i]==cr[j]) {
					count++;
				}
			}
			map.put(cr[i], count);
		}
		System.out.println(map);
		s.close();
	}
}
