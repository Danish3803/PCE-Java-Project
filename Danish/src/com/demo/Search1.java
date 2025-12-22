package com.demo;
import java.util.*;

public class Search1{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a[] = {10, 20, 30, 40, 50, 60};
		int Low = 0;
		int High = a.length;
		int mid = (Low + High)/ 2;
		boolean found = false;
		int Idx = 0;
		System.out.println("Enter the key you want to search: ");
		int key = sc.nextInt();
		
		while(Low <= High) {
			if (a[mid] == key) {
				found = true;
				Idx = mid;
				break;	
			} else if (key < a[mid]) {
				High = mid - 1;
				mid = (Low + High)/ 2;
			} else {
				Low = mid + 1;
				mid = (Low + High)/ 2;
			}	
		}
		if(found == true) {
			System.out.println("Key found at Index. " + Idx);
		  } else {
			System.out.println("Key Not found");
		}	
	}
}