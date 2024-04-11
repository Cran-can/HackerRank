package com.cg.projecteuler;

import java.util.Scanner;

public class Largest_product_in_a_grid_11 {
	public static long calculateProduct(int[][] grid, int startX, int startY, int dx, int dy) {
		long product = 1;
		for (int i = 0; i < 4; i++) {
			product *= grid[startX + i * dx][startY + i * dy];
		}
		return product;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[][] grid = new int[20][20];

		// Input grid values
		for (int grid_i = 0; grid_i < 20; grid_i++) {
			for (int grid_j = 0; grid_j < 20; grid_j++) {
				grid[grid_i][grid_j] = in.nextInt();
			}
		}

		long maxProduct = 0;

		// Iterate through the grid to find the maximum product of four adjacent numbers
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 20; j++) {
				// Check horizontal product
				if (j + 3 < 20) {
					maxProduct = Math.max(maxProduct, calculateProduct(grid, i, j, 0, 1));
				}
				// Check vertical product
				if (i + 3 < 20) {
					maxProduct = Math.max(maxProduct, calculateProduct(grid, i, j, 1, 0));
				}
				// Check diagonal (down-right) product
				if (i + 3 < 20 && j + 3 < 20) {
					maxProduct = Math.max(maxProduct, calculateProduct(grid, i, j, 1, 1));
				}
				// Check diagonal (down-left) product
				if (i + 3 < 20 && j - 3 >= 0) {
					maxProduct = Math.max(maxProduct, calculateProduct(grid, i, j, 1, -1));
				}
			}
		}

		System.out.println(maxProduct);
		in.close();
	}
}
