package com.cg.java;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Java_Dequeue {
	static int[] occurrences = new int[10000000];

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Deque deque = new ArrayDeque<>();
		int n = in.nextInt();
		int m = in.nextInt();

		int unique = 0;
		for (int i = 0; i < m; i++) {
			int number = in.nextInt();
			if (occurrences[number - 1] == 0) {
				unique++;
			}
			deque.add(number);
			occurrences[number - 1]++;
		}

		int maxUnique = unique;
		for (int i = m; i < n; i++) {
			int number = in.nextInt();
			int first = (Integer) deque.removeFirst();
			if (first == number) {
				deque.add(number);
			} else {
				occurrences[first - 1]--;
				if (occurrences[first - 1] == 0) {
					unique--;
				}
				if (occurrences[number - 1] == 0) {
					if (++unique == m) {
						maxUnique = unique;
						break;
					}
					if (unique > maxUnique) {
						maxUnique = unique;
					}
				}
				deque.add(number);
				occurrences[number - 1]++;
			}
		}

		System.out.println(maxUnique);
	}
}
