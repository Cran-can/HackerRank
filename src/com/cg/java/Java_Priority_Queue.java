package com.cg.java;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

class Priorities {

	List<Student2> getStudents(List<String> events) {

		PriorityQueue<Student2> priorityQueue = new PriorityQueue<>(new Comparator<Student2>() {
			public int compare(Student2 s1, Student2 s2) {
				return s1.getCGPA() != s2.getCGPA() ? s2.getCGPA() - s1.getCGPA() > 0 ? 1 : -1
						: !s1.getName().equals(s2.getName()) ? s1.getName().compareTo(s2.getName())
								: s1.getID() > s2.getID() ? 1 : -1;
			}
		});

		for (String str : events) {
			String isENTER = str.split(" ")[0];

			if (isENTER.equals("ENTER")) {
				int id = Integer.parseInt(str.split(" ")[3]);
				String name = str.split(" ")[1];
				double cgpa = Double.parseDouble(str.split(" ")[2]);

				priorityQueue.add(new Student2(id, name, cgpa));

			} else
				priorityQueue.poll();
		}

		List<Student2> result = new ArrayList<>();

		while (!priorityQueue.isEmpty()) {
			result.add(priorityQueue.poll());
		}

		return result;
	}
}

class Student2 {
	private int id;
	private String name;
	private double cgpa;

	Student2(int id, String name, double cgpa) {
		this.id = id;
		this.name = name;
		this.cgpa = cgpa;
	}

	int getID() {
		return id;
	}

	String getName() {
		return name;
	}

	double getCGPA() {
		return cgpa;
	}
}

public class Java_Priority_Queue {
	private final static Scanner scan = new Scanner(System.in);
	private final static Priorities priorities = new Priorities();

	public static void main(String[] args) {
		int totalEvents = Integer.parseInt(scan.nextLine());
		List<String> events = new ArrayList<>();

		while (totalEvents-- != 0) {
			String event = scan.nextLine();
			events.add(event);
		}

		List<Student2> students = priorities.getStudents(events);

		if (students.isEmpty()) {
			System.out.println("EMPTY");
		} else {
			for (Student2 st : students) {
				System.out.println(st.getName());
			}
		}
	}
}
