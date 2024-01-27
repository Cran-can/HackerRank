package com.cg.java;

import java.util.Arrays;
import java.util.Scanner;

public class Java_Substring_Comparisons {

	public static String getSmallestAndLargest(String s, int k) {
		String smallest = "";
		String largest = "";
		String[] arr = new String[s.length() - k + 1];

		for (int i = 0; i < s.length() - k + 1; i++) {
			String temp = s.substring(i, i + k);
			arr[i] = temp;
		}
		Arrays.sort(arr);
		smallest = arr[0];
		largest = arr[arr.length - 1];
		return smallest + "\n" + largest;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		int k = scanner.nextInt();
		scanner.close();
		System.out.println(getSmallestAndLargest(s, k));
	}
}
