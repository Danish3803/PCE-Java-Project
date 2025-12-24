package com.demo;

import java.util.StringTokenizer;

public class Token2{
	public static void main(String[] args) {
		String s = "I am Iron Man";
		StringTokenizer st = new StringTokenizer(s, " ");
		while (st.hasMoreTokens()) {
			String word = st.nextToken();
			char[] a = word.toCharArray();
			int start = 0;
			int end = a.length - 1;
			while (start < end) {
				char temp = a[start];
				a[start] = a[end];
				a[end] = temp;
				start++;
				end--;
			}
			System.out.print(new String(a) + " ");
		}
	}
}