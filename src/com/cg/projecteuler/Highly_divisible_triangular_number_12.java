package com.cg.projecteuler;

import java.util.Scanner;

public class Highly_divisible_triangular_number_12 {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		int[] primes = new int[1000];

		primes[0] = 2;
		primes[1] = 3;
		primes[2] = 5;
		primes[3] = 7;
		int count1 = 4;
		int num = 9;

		int i = 0;

		mainl: while (num <= 1000000) {

			for (i = 0; i < count1; i++) {
				if (num % primes[i] == 0) {
					break;
				} else if (primes[i] > (num / 2)) {
					primes[count1] = num;
					count1++;

					if (count1 == 1000) {
						break mainl;
					}
					break;
				}
			}

			if (i == count1) {
				primes[count1] = num;
				count1++;

				if (count1 == 1000) {
					break mainl;
				}
			}

			num += 2;
		}

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			long n = in.nextLong();

			int j = 2;
			long result = 1;
			long sum = 1;
			int count2 = 1;

			while (true) {

				sum += j;
				long temp = sum;

				loop1: for (int k = 0; k < 1000; k++) {
					count2 = 1;
					while (true) {

						if (temp % primes[k] == 0) {
							temp /= primes[k];
							count2++;
						} else {
							break;
						}
					}
					result *= count2;
					if (temp == 1) {
						break loop1;
					}
				}
				if (result > n) {
					break;
				} else {
					result = 1;
				}

				j++;

			}

			System.out.println(sum);
			in.close();
		}
	}
}
