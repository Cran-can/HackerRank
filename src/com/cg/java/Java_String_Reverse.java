package com.cg.java;

import java.util.Scanner;

public class Java_String_Reverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		System.out.println(pali(A));
		sc.close();
	}
	
	public static String pali(String str) {
		String temp = "";
		for(int i=str.length()-1;i>=0;i--) {
			temp = temp + str.charAt(i);
		}
		return temp.equals(str)?"Yes":"No";
	}
}
