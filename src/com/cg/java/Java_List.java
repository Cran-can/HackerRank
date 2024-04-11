package com.cg.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Java_List {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		List<Integer> li = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			int elements = scanner.nextInt();
			li.add(elements);
		}
		int q = scanner.nextInt();
		for (int i = 0; i < q; i++) {
			String s = scanner.next();
			if (s.equals("Insert")) {
				int x = scanner.nextInt();
				int y = scanner.nextInt();
				li.add(x, y);
			} else {
				int x = scanner.nextInt();
				li.remove(x);
			}

		}

		for (int e : li) {
			System.out.print(e + " ");
		}
		scanner.close();

	}
}
