package com.cg.projecteuler;

/*
 
 Comparing two numbers written in index form like 2^11 and 3^7 is not difficult, as any calculator would 
 confirm that 2^11 = 2048 < 3^7 = 2187.
 However, confirming that 632382^518061 > 519432^525806 would be much more difficult, 
 as both numbers contain over three million digits.
 You are given N base exponent pairs, each forming a large number 
 you have to find the Kth smallest number of them. K is 1-indexed.
 
 Input Format:
 -------------
 First line contains an integer N, number of base exponent pairs. Followed by N lines 
 each have two space separated integers B and E, representing base and exponent.
 Last line contains an integer K, where K <= N 

 No two numbers are equal.

 Output Format:
 -------------
 Print the base and exponent in one line separated by space.
 
 Sample Input:
 3
 4 7
 3 7
 2 11
 2
 
 Sample Output:
 3 7
 
*/

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Largest_Exponential_99 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();
		int[][] pairs = new int[N][2];

		for (int i = 0; i < N; i++) {
			pairs[i][0] = scanner.nextInt();
			pairs[i][1] = scanner.nextInt();
		}

		int K = scanner.nextInt();

		Arrays.sort(pairs, Comparator.comparingDouble(a -> a[1] * Math.log(a[0])));

		System.out.println(pairs[K - 1][0] + " " + pairs[K - 1][1]);
		scanner.close();
	}
}
