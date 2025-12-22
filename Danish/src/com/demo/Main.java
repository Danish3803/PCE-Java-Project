package com.demo;
import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = {10, 12, 14, 16, 18, 20};
		System.out.println("Enter the number you want to Search: ");
		int target = sc.nextInt();
		int ans = Binary.search(arr, target);
		System.out.println("You got your answer : " + ans);
	}
}