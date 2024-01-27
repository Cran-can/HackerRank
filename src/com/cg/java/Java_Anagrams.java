package com.cg.java;

import java.util.Arrays;
import java.util.Scanner;

public class Java_Anagrams {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String a = scanner.next();
		String b = scanner.next();
		boolean result = isAnagram(a,b);
		System.out.println(result?"Anagrams" : "Not Anagrams");
		scanner.close();
	}
	
	public static boolean isAnagram(String a , String b) {
		// converting to same case i.e, to upper case.
		a=a.toUpperCase();
		b=b.toUpperCase();
		
		char[] a1 = a.toCharArray();
		char[] b1 = b.toCharArray();
		
		Arrays.sort(a1);
		Arrays.sort(b1);

		
		return Arrays.equals(a1, b1);
	}
}
