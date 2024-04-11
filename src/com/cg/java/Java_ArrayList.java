package com.cg.java;

import java.util.ArrayList;
import java.util.Scanner;

public class Java_ArrayList {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		ArrayList<ArrayList<Integer>> ar = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			int s = scanner.nextInt();
			ar.add(new ArrayList<>());
			for (int j = 0; j < s; j++) {
				int input = scanner.nextInt();
				ar.get(i).add(input);
			}
		}

		n = scanner.nextInt();
		scanner.nextLine();
		for (int i = 0; i < n; i++) {
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			scanner.nextLine();
			if (x < ar.size() && ar.get(x - 1).size() >= y) {
				System.out.println(ar.get(x - 1).get(y - 1));
			} else {
				System.out.println("ERROR!");
			}
		}

		scanner.close();
	}
}
