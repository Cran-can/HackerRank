package com.cg.java;

import java.util.Scanner;

public class Java_Loops_2 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int q = scanner.nextInt();
		for (int i = 0; i < q; i++) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int n = scanner.nextInt();

			for (int j = 0; j < n; j++) {
				a = a + ((int) Math.pow(2, j) * b);
				System.out.print(a + " ");
			}
			System.out.println();
		}
		scanner.close();
	}
}
