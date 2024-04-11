package com.cg.java;

import java.util.BitSet;
import java.util.Scanner;

public class Java_BitSet {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int bitLength = s.nextInt();
		int queryCount = s.nextInt();

		// System.out.println(bitLength + "-" + queryCount);
		BitSet b1 = new BitSet(bitLength);
		BitSet b2 = new BitSet(bitLength);

		s.nextLine();

		while (queryCount-- > 0) {
			String query = s.next();
			int set1 = Integer.parseInt(s.next());
			int set2 = Integer.parseInt(s.next());

			// System.out.println(query + "-" + set1 + "-" + set2);
			switch (query) {
			case "AND":
				if (set1 == 1) {
					b1.and(b2);
				} else if (set1 == 2) {
					b2.and(b1);
				}
				break;
			case "OR":
				if (set1 == 1) {
					b1.or(b2);
				} else if (set1 == 2) {
					b2.or(b1);
				}
				break;
			case "XOR":
				if (set1 == 1) {
					b1.xor(b2);
				} else if (set1 == 2) {
					b2.xor(b1);
				}
				break;
			case "FLIP":
				if (set1 == 1) {
					b1.flip(set2);
				} else if (set1 == 2) {
					b2.flip(set2);
				}
				break;
			case "SET":
				if (set1 == 1) {
					b1.set(set2);
				} else if (set1 == 2) {
					b2.set(set2);
				}
				break;
			default:
				System.out.println("Error");
				break;
			}

			System.out.println(b1.cardinality() + " " + b2.cardinality());
		}
	}
}
