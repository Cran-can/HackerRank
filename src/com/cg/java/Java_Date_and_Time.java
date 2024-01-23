package com.cg.java;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Java_Date_and_Time {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		int day = scanner.nextInt();
		int year = scanner.nextInt();
		scanner.close();
		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");

		try {
			Date d = sdf.parse(String.valueOf(month) + "-" + String.valueOf(day) + "-" + String.valueOf(year));
			DateFormat f = new SimpleDateFormat("EEEE");
			String theday = f.format(d);
			System.out.println(theday.toUpperCase());
		} catch (ParseException e) {

			e.printStackTrace();
		}

	}
}
