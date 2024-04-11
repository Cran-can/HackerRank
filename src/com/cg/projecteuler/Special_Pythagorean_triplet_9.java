package com.cg.projecteuler;

import java.util.Scanner;

public class Special_Pythagorean_triplet_9 {
	public int findMaxProduct(int perimeter) {
		int maxProduct = -1; // Initialize maxProduct to -1

		// Iterate through possible values of 'a'
		for (int a = 1; a < perimeter; a++) {
			// Calculate maximum possible 'b' based on 'a'
			int maxB = (perimeter - a) / 2;
			// Iterate through possible values of 'b'
			for (int b = a + 1; b <= maxB; b++) {
				int c = perimeter - a - b;
				if (a * a + b * b == c * c) {
					// Calculate product and update maxProduct if necessary
					int product = a * b * c;
					if (product > maxProduct) {
						maxProduct = product;
					}
				}
			}
		}
		return maxProduct;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt(); // Number of test cases

		for (int i = 0; i < t; i++) {
			int n = in.nextInt(); // Perimeter for current test case
			// Creating Object for our main Class...!!!
			Special_Pythagorean_triplet_9 solution = new Special_Pythagorean_triplet_9();
			System.out.println(solution.findMaxProduct(n));
		}
		in.close();
	}
}
