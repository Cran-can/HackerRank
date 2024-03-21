package com.cg.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		
		for(int i =0;i<input;i++) {
			int elements = sc.nextInt();
			list.add(elements);
		}
		int q = sc.nextInt();
		for(int i=0;i<q;i++) {
			String s = sc.next();
			if(s.equals("Insert")) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				list.add(x,y);
			}
			else {
				int x = sc.nextInt();
				list.remove(x);
			}
		}
		for(int e:list) {
			System.out.print(e+" ");
		}
		sc.close();
	}
}
