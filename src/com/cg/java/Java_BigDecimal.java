package com.cg.java;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class Java_BigDecimal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String[] s=new String[n+2];
		for(int i=0;i<n;i++) {
			s[i]=scanner.next();
		}
		Arrays.sort(s, 0, n, (a, b) -> {
	        BigDecimal aBigDecimal = new BigDecimal(a);
	        BigDecimal bBigDecimal = new BigDecimal(b);
	        return bBigDecimal.compareTo(aBigDecimal);
	    });
		 for(int i=0;i<n;i++)
	        {
	            System.out.println(s[i]);
	        }
		scanner.close();
	}
	
}
