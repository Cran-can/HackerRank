package com.cg.java;

import java.util.ArrayList;
import java.util.List;

public class Java_Generics {
	public static void main(String[] args) {
		ArrayList<String> strings = new ArrayList<>();
		strings.add("Hello");
		strings.add("World");

		ArrayList<Integer> integers = new ArrayList<>();
		integers.add(1);
		integers.add(2);
		integers.add(3);

		show(integers);
		show(strings);

	}

	public static void show(List<?> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i) + "");
		}
	}
}
