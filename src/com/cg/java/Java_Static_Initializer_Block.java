package com.cg.java;

import java.util.Scanner;

public class Java_Static_Initializer_Block {
	static{
		Scanner scanner = new Scanner(System.in);
		int b = scanner.nextInt();
		int h = scanner.nextInt();
		scanner.close();
		
		double area = 0;
		if (b >= 0 && b <= 100 && h >= 0 && h <= 100)
			area = b * h;
		if (area > 0)
			System.out.println(area);
		else
			System.out.println("java.lang.Exception: Breadth and height must be positive");
		
	}
	
	
	public static void main(String[] args) {
		System.out.println("Hiii");
	}
}
