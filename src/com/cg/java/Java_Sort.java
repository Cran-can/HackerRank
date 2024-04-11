package com.cg.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student1 {
	private int id;
	private String fname;
	private double cgpa;

	public Student1(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}

	public int getId() {
		return id;
	}

	public String getFname() {
		return fname;
	}

	public double getCgpa() {
		return cgpa;
	}
}

public class Java_Sort {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());

		List<Student1> studentList = new ArrayList<Student1>();
		while (testCases > 0) {
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();

			Student1 st = new Student1(id, fname, cgpa);
			studentList.add(st);

			testCases--;
		}
		studentList.sort((s1, s2) -> {
			if (s1.getCgpa() != s2.getCgpa())
				return s1.getCgpa() < s2.getCgpa() ? 1 : -1;
			if (!s1.getFname().equals(s2.getFname()))
				return s1.getFname().compareTo(s2.getFname());

			return s1.getId() > s2.getId() ? 1 : -1;

		});

		for (Student1 st : studentList) {
			System.out.println(st.getFname());
		}
		in.close();
	}
}
