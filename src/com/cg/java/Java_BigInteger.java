package com.cg.java;
import java.math.BigInteger;
import java.util.Scanner;
public class Java_BigInteger {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String a = scanner.nextLine();
		String b = scanner.nextLine();
		
		BigInteger aBigInteger = new BigInteger(a);
		BigInteger bBigInteger = new BigInteger(b);
		
		System.out.println(aBigInteger.add(bBigInteger));
		System.out.println(aBigInteger.multiply(bBigInteger));
		scanner.close();
	}
}
