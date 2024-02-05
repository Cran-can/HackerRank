package com.cg.java;
import java.util.Scanner;
import java.security.MessageDigest;
public class Java_MD5 {
	public static void main(String[] args)throws Exception {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		byte[] md5 = MessageDigest.getInstance("MD5").digest(s.getBytes());
		for(byte b:md5) {
			System.out.printf("%02x", b);
		}
		scanner.close();
	}
}
