package com.demo;

import java.util.StringTokenizer;

public class Token {
	public static void main(String[] args) {
		String s = "I am Iron Man";
		StringTokenizer st = new StringTokenizer(s, " ");
		while(st.hasMoreTokens() == true){ 
		System.out.println(st.nextToken());   
	} 
		
	}
}



