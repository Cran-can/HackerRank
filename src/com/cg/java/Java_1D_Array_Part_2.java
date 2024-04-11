package com.cg.java;

import java.util.Scanner;

public class Java_1D_Array_Part_2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int q = input.nextInt();

		for (int i = 0; i < q; i++) {
			int n = input.nextInt();
			int[] list = new int[n];
			int leap = input.nextInt();
			for (int p = 0; p < n; p++) {
				int t = input.nextInt();
				list[p] = t;
			}
			if (canWin(leap, list)) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
		input.close();
	}

	public static boolean canWin(int leap, int[] game) {
		return canWinHelper(0, leap, game);
	}

	private static boolean canWinHelper(int position, int leap, int[] game) {
		if (position < 0 || game[position] == 1) {
			return false;
		}
		if (position == game.length - 1 || position + leap >= game.length) {
			return true;
		}
		game[position] = 1; // Mark as visited
		return canWinHelper(position + leap, leap, game) || canWinHelper(position + 1, leap, game)
				|| canWinHelper(position - 1, leap, game);
	}
}
