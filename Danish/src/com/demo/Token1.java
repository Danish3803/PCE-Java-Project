package com.demo;

public class Token1 {
	public static void main(String[] args) {
		String s = "I am Iron Man";
		char[] a = s.toCharArray();
		int start = 0;
		int end = a.length - 1;

		while (start < end) {
			char temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			start++;
			end--;
		}

		System.out.println(new String(a));
	}
}