package com.cg.java;
import java.security.MessageDigest;
import java.util.Scanner;
public class Java_SHA_256 {
	public static void main(String[] args) throws Exception{
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		byte[] hash = MessageDigest.getInstance("SHA-256").digest(s.getBytes());
		for(byte b:hash) {
			System.out.printf("%02x",b);
		}
		scanner.close();
		
		
	}
}
