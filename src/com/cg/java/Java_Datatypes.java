package com.cg.java;

import java.util.Scanner;

public class Java_Datatypes {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		for (int i = 0; i < t; i++) {
			try {
				long n = scanner.nextLong();
				System.out.println(n + " can be fitted in:");
				if (n >= Math.pow(-2, 7) && n <= (Math.pow(2, 7) - 1))
					System.out.println("* byte");
				if (n >= Math.pow(-2, 15) && n <= (Math.pow(2, 15) - 1))
					System.out.println("* short");
				if (n >= Math.pow(-2, 31) && n <= (Math.pow(2, 31) - 1))
					System.out.println("* int");
				if (n >= Math.pow(-2, 63) && n <= (Math.pow(2, 63) - 1))
					System.out.println("* long");

			} catch (Exception e) {
				System.out.println(scanner.next() + " can't be fitted anywhere.");
			}
		}
		scanner.close();
	}
}
