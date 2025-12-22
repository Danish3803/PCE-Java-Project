package com.demo;

import java.util.*;

public class Index {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] a = {1, 2, 3, 4, 5};
		
		System.out.println("Enter the number you want to search: ");
		int Key = sc.nextInt();
		
		boolean found = false;
		int idx = 0;
		for(int i=0; i<a.length; i++) {
			if(a[i] == Key) {
				found = true;
				idx = i;
				break;
			}
		}
		if(found == true) {
			System.out.println("Key found at Index. " + idx);
		} else {
			System.out.println("Key Not found");
		}	
	}
}