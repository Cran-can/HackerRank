package com.cg.java;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Java_Stack {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> list = new LinkedList<>();
		while (sc.hasNext()) {
			String input = sc.nextLine();
			if (input.length() % 2 > 0)
				System.out.println("false");
			else {
				for (int i = 0; i < input.length(); i++) {
					String Char = Character.toString(input.charAt(i));
					list.add(Char);
				}
				int listlength = input.length();

				for (int i = 0; i < listlength; i++) {
					int a = listlength;
					if (listlength > 1) {
						if (i < listlength - 1 && list.get(i).equals("[")) {
							if (list.get(i + 1).equals("]")) {
								list.remove(i);
								list.remove(i);
								listlength = listlength - 2;
							}
						}
						if (i < listlength - 1 && list.get(i).equals("{")) {
							if (list.get(i + 1).equals("}")) {
								list.remove(i);
								list.remove(i);
								listlength = listlength - 2;
							}
						}
						if (i < listlength - 1 && list.get(i).equals("(")) {
							if (list.get(i + 1).equals(")")) {
								list.remove(i);
								list.remove(i);
								listlength = listlength - 2;
							}
						}
						if (listlength < a)
							i = -1;
					}
				}
				if (listlength == 0)
					System.out.println("true");
				else
					System.out.println("false");
			}
			list.clear();
		}
		sc.close();
	}
}
