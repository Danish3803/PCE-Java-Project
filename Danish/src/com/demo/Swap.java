package com.demo;
import java.util.*;

public class Swap {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
        int a = 10;
        int b = 20;
        int temp = a ;
        a = b;
        b = temp;
        System.out.println("First No: " + a + " Second No: " + b);
	} 
}

