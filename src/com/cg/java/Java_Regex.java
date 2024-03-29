package com.cg.java;

import java.util.Scanner;

public class Java_Regex {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (scanner.hasNext()) {
			String IP = scanner.next();
			System.out.println(IP.matches(new MyRegex().pattern));
		}
		scanner.close();
	}
}

class MyRegex {
	
	
	
	  String pattern = "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
	  "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
	  + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
	 
}