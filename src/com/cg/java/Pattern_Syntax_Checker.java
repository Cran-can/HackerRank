package com.cg.java;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Pattern_Syntax_Checker {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
        String str ="";
        int n = Integer.parseInt(scanner.nextLine());
        for(int i=0;i<n;i++) {
            str = scanner.nextLine();
            try {
                Pattern.compile(str);
                System.out.println("Valid");
            }catch(Exception e) {
                System.out.println("Invalid");
            }
        }
        scanner.close();
	}
}
