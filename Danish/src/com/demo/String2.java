package com.demo;

public class String2 {
	public static void main(String[] args) {
		String s1 = new String("Deep");
		String s2 = s1.intern();
		String s3 = s1.intern();
//		System.out.println(s1);
//		System.out.println(s2);
//		System.out.println(s3);
		if(s2 == s3) {
			System.out.println("References are equal");
		} else {
			System.out.println("References are not equal");
		} if (s2 == s3) {
			System.out.println("Values are equal");
		} else {
			System.out.println("Values are not equal");
		}
	}
}