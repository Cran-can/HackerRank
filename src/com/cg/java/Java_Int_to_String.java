package com.cg.java;
import java.util.Scanner;
public class Java_Int_to_String {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.println(n);
		// Converting int to string
		String s = ""+n;
		System.out.println(s);
		scanner.close();
	}
}
