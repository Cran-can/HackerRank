package com.cg.java;

import java.util.Scanner;

public class Java_String_Tokens {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] arr = s.trim().split("[ !,?._'@]+");

        if (s.trim().isEmpty())
            System.out.println("0");
        else {
            System.out.println(arr.length);
            for (String token : arr) {
                System.out.println(token);
            }
        }
        scanner.close();
	}
}
