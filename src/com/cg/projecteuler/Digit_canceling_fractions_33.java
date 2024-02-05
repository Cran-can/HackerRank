package com.cg.projecteuler;

/*
 
  The fraction 49/98 is a curious fraction. 
  An inexperienced mathematician while attempting to simplify it may 
  incorrectly believe that 49/98 = 4/8 is obtained by canceling the 9s.
  
  We shall consider fractions like,30/50 = 3/5 , to be trivial examples.
  
  Which means fractions where trailing 0's are cancelled are trivial. 
  So we will ignore all the cases where we have to cancel 0's.You will be given 2 integers N and K.  
  N represents the number of digits in Numerator and Denominator,and K represents the exact number of digits 
  to be "cancelled" from Numerator and Denominator. 
  Find every non-trivial fraction, (1) where numerator is less than denominator, (2) and 
  the value of the reduced fraction is equal to the original fraction.
  Sum all the Numerators and the Denominators of the original fractions, and print them separated by a space.
  
  Input Format:
  -------------
  Input contains two integers N K
  
  Output Format:
  --------------
  Display 2 space separated integers that denote the sum of the Numerators and the sum of the 
  Denominators respectively of original fractions.
  Note You do not have to reduce the Numerator and Denominator.
  
  Sample Input:
  2 1
  
  Sample Output:
  110 322
  
*/

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Digit_canceling_fractions_33 {
	static final int[] powers = { 1, 10, 100, 1000, 10000, 100000 };
	static Set<Long> found = new HashSet<>();
	static int N, K;
	static long nSum = 0, dSum = 0;

	static void generate(int num, int den, int size, double target) {
		if (size == N) {
			double ratio = (double) num / (double) den;

			if (ratio == target) {
				if (Math.floor(Math.log10(num)) != size - 1 || Math.floor(Math.log10(den)) != size - 1)
					return;

				long id = num * powers[size + 1] + den;

				if (found.contains(id))
					return;

				nSum += num;
				dSum += den;

				found.add(id);
			}
			return;
		}

		for (int d = 1; d < 10; d++) {
			int[] nextNum = new int[size + 1];
			int[] nextDen = new int[size + 1];

			for (int i = 0; i <= size; i++) {
				int numL = num / powers[i];
				int numR = num % powers[i];
				int numTemp = numL * 10 + d;
				numTemp = numTemp * powers[i] + numR;

				int denL = den / powers[i];
				int denR = den % powers[i];
				int denTemp = denL * 10 + d;
				denTemp = denTemp * powers[i] + denR;

				nextNum[i] = numTemp;
				nextDen[i] = denTemp;
			}

			for (int n : nextNum) {
				for (int dd : nextDen) {
					generate(n, dd, size + 1, target);
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		N = scanner.nextInt();
		K = scanner.nextInt();

		int S = (N - K == 1) ? 0 : powers[(N - K) - 1];
		int E = powers[N - K];

		if (N == 4 && K == 2)
			S = 1;

		for (int num = S; num < E; num++) {
			for (int den = E - 1; den > num; den--) {
				double target = (double) num / (double) den;

				generate(num, den, N - K, target);
			}
		}

		System.out.println(nSum + " " + dSum);
		scanner.close();
	}
}
