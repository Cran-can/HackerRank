package com.cg.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Java_Map {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.nextLine();
		Map <String,Integer> hm = new HashMap<>();
		for(int i=0;i<n;i++) {
			String name=scanner.nextLine();
			int phone=scanner.nextInt();
			hm.put(name, phone);
		}
		
		while(scanner.hasNext()) {
			String s = scanner.nextLine();
			if(hm.containsKey(s)) {
				System.out.println(s+"="+hm.get(s));
			}else
				System.out.println("Not found");
		}
		scanner.close();
	}
}
