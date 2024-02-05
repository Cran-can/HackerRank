package com.cg.projecteuler;

/*
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3,5,6 and 9. 
   The sum of these multiples is 23. Find the sum of all the multiples of 3 or 5 below N.
   
   Input Format:
   -------------
   First line contains T that denotes the number of test cases. 
   This is followed by T lines, each containing an integer,N.
   
   Output Format:
   --------------
   For each test case, print an integer that denotes the sum of all the multiples of 3 or 5 below N.
   
   Sample Input:
   2
   10
   100
   
   Sample Output:
   23
   2318
   
   Explanation:
   For N=10,if we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3,5,6 and 9. 
   The sum of these multiples is 23.
   Similarly for N=100, we get 2318.
*/

import java.util.Scanner;

public class Multiples_of_3and5_1 {
	private static long getSum(int n, int a) {
		long p = (n - 1) / a;
		return a * p * (p + 1) / 2;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		for (int a0 = 0; a0 < t; a0++) {

			int n = scanner.nextInt();

			long sum = getSum(n, 3) + getSum(n, 5) - getSum(n, 15);
			System.out.println(sum);
		}

		scanner.close();
	}
}
