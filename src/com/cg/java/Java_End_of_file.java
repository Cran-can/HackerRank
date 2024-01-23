package com.cg.java;
import java.util.Scanner;
public class Java_End_of_file {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count =0;
		while(scanner.hasNext()) {
			String word = scanner.nextLine();
			if(word=="")break;
			System.out.println(++count+" "+word);
			
		}
		scanner.close();
	}
}
