package com.cg.projecteuler;

import java.util.Scanner;

public class Largest_product_in_a_series_8 {
	public long greatestProduct(String num, int n, int k) {
		long maxProduct = 0;
		char[] digits = num.toCharArray();
		for (int i = 0; i <= n - k; i++) {
			long product = 1;
			for (int j = i; j < i + k; j++) {
				product *= Character.getNumericValue(digits[j]);
			}

			if (product > maxProduct) {
				maxProduct = product;
			}
		}

		return maxProduct;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			int n = in.nextInt();
			int k = in.nextInt();
			String num = in.next();
			// Creating Object for our main Class...!!!
			Largest_product_in_a_series_8 solution = new Largest_product_in_a_series_8();
			System.out.println(solution.greatestProduct(num, n, k));

		}
		in.close();
	}
}
