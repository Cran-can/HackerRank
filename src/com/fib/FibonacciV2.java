package com.fib;

import java.util.Scanner;

public class FibonacciV2 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int N = scanner.nextInt();
		
		int result = computeNthTerm(A, B, N);
		System.out.println(result);
		scanner.close();
	}
	
	public static int computeNthTerm(int A,int B,int N) {
		if(N==1) {
			return A;
		}else if(N==2) {
			return B;
		}else {
			int TnMinusTwo = A;
			int TnMinusOne = B;
			int Tn = 0;
			for(int i=3;i<=N;i++) {
				Tn = TnMinusOne * TnMinusOne + TnMinusTwo;
				TnMinusTwo = TnMinusOne;
				TnMinusOne = Tn;
			}
			return Tn;
		}
	}
}
