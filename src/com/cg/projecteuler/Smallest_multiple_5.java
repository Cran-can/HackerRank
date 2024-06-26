package com.cg.projecteuler;

import java.util.Scanner;

public class Smallest_multiple_5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			int n = in.nextInt();
			System.out.println(getLcm(n));
		}
		in.close();
	}

	public static int getLcm(int n) {
		int lcm = n;
		int multiple = 2;

		while (true) {
			boolean divisible = true;
			for (int i = 2; i <= n; i++) {
				if (lcm % i != 0) {
					divisible = false;
					break;
				}
			}
			if (divisible)
				return lcm;
			lcm = n * multiple;
			multiple++;
		}
	}
}
