package com.demo;

public class Mutable{
	public static void main(String[] args) {
//		StringBuffer sb = new StringBuffer("Md");
//		sb.append("Arsh");
//		System.out.println(sb);
//		StringBuffer sb = new StringBuffer();
//		System.out.println(sb.capacity());
//		sb.append("Ronaldo");
//		System.out.println(sb.capacity());
//		sb.append("is a great footballer");
//		System.out.println(sb.capacity());
		
//		StringBuffer sb = new StringBuffer();
//		System.out.println(sb.capacity());
//		sb.ensureCapacity(31);
//		System.out.println(sb.capacity());
		
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());
		sb.append("Ronaldo");
		sb.trimToSize();
		System.out.println(sb.capacity());
	}
}