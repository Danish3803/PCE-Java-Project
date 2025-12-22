package com.demo;

import java.util.Arrays;

public class BubbleMain {
	public static void main(String[] args) {
		int arr[] = {10, 30, 40, 20, 50};
		Bubble.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
}