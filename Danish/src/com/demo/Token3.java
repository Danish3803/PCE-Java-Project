
package com.demo;

import java.util.StringTokenizer;

public class Token3 {
	public static void main(String[] args) {
		String s = "I am Iron Man";

		StringTokenizer st = new StringTokenizer(s, " ");
		int count = st.countTokens();
		String[] words = new String[count];
		int i = 0;

		while (st.hasMoreTokens()) {
			words[i++] = st.nextToken();
		}
		for (int j = words.length - 1; j >= 0; j--) {
			System.out.print(words[j] + " ");
		}
	}
}
