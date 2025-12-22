package com.demo;

public class FString {
	public static void main(String[] args) {
		String s1 = "Md ";
		String s2 = "Arsh";
		String s3 = s1.concat(s2);
		String s4 = "Md Arsh";
		if(s3 == s4) {
			System.out.println("Reference are equals");
		} else {
			System.out.println("Reference are not equals");
		} if (s3.equals(s4)) {
			System.out.println("Values are equals");
		}else {
			System.out.println("Values are not equals");
		}
	}
}