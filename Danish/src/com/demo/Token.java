package com.demo;

import java.util.StringTokenizer;

public class Token {
	public static void main(String[] args) {
		String s = "I am Iron Man";
//		StringTokenizer st = new StringTokenizer(s, " ");
//		while(st.hasMoreTokens() == true){ 
//			System.out.println(st.nextToken())   
//		} 
//		StringTokenizer st = new StringTokenizer(s, " ");
//		char[] a = s.toCharArray();
//		int start = 0;
//		int end = a.length - 1;
//		
//		while(start < end) {
//			char temp = a[start];
//			a[start] = a[end];
//			a[end] = temp;
//			start++;
//			end--;
//		}
//		System.out.println(new String(a));
//		StringTokenizer st = new StringTokenizer(s, " ");
//		while (st.hasMoreTokens()) {
//			String word = st.nextToken();
//			char[] a = word.toCharArray();
//			int start = 0;
//			int end = a.length - 1;
//			while (start < end) {
//				char temp = a[start];
//				a[start] = a[end];
//				a[end] = temp;
//				start++;
//				end--;
//			}
//			System.out.print(new String(a) + " ");
//		}
		StringTokenizer st = new StringTokenizer(s, " ");
		int count = st.countTokens();
		String[] words = new String[count];
		int i = 0;
		
		while(st.hasMoreTokens()) {
			words[i++] = st.nextToken();
		}
		for(int j= words.length-1; j >= 0; j--) {
			System.out.print(words[j] + " ");
		}
	}
}




