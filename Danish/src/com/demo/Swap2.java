package com.demo;
import java.util.*;

public class Swap2 {
	public static void main(String[] args) {
		int[] a = {10, 20, 30, 40, 50};
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first Index : ");
		int Idx1 = sc.nextInt();
		System.out.println("Enter the Second Index : ");
		int Idx2 = sc.nextInt();
		
		int temp = a[Idx1];
		a[Idx1] = a[Idx2];
		a[Idx2] = temp;
		
		System.out.println("Your First Index : " + a[Idx1]);
		System.out.println("Your Second Index : " + a[Idx2]);
	}
}