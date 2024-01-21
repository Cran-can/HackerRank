package com.cg.java;

import java.util.Scanner;

public class Java_Stdin_and_Stdout_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n1 = scanner.nextInt();
		int n2 = scanner.nextInt();
		int n3 = scanner.nextInt();

		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		
		scanner.close();
	}
}
