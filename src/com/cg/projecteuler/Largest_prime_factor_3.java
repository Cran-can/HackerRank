package com.cg.projecteuler;

import java.util.Scanner;

public class Largest_prime_factor_3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			long n = in.nextLong();
			long largestPrimeFactor = findLargestPrimeFactor(n);
			System.out.println(largestPrimeFactor);
		}
		in.close();
	}

	private static long findLargestPrimeFactor(long n) {
		long largestPrimeFactor = -1;

		// Divide by 2 until it's not divisible by 2
		while (n % 2 == 0) {
			largestPrimeFactor = 2;
			n /= 2;
		}

		// Check odd divisors starting from 3
		for (long i = 3; i <= Math.sqrt(n); i += 2) {
			while (n % i == 0) {
				largestPrimeFactor = i;
				n /= i;
			}
		}

		// If the remaining number is a prime greater than 2
		if (n > 2) {
			largestPrimeFactor = n;
		}

		return largestPrimeFactor;
	}
}
