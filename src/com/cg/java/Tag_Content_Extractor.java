package com.cg.java;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Tag_Content_Extractor {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.nextLine();
		for (int i = 0; i < n; i++) {
			String str = scanner.nextLine();
			Pattern pattern = Pattern.compile("<(.+?)>([^<]+)</\\1>");
			Matcher matcher = pattern.matcher(str);

			StringBuilder stringBuilder = new StringBuilder();
			while (matcher.find()) {
				stringBuilder.append(matcher.group(2)).append('\n');
			}
			String result = stringBuilder.length() > 0 ? stringBuilder.toString().trim() : "None";
			System.out.println(result);
		}
		scanner.close();
	}
}
