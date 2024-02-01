package com.cg.java;
import java.util.Scanner;
class UsernameValidator{
	public static final String regularExpression="^[a-zA-Z][a-zA-Z0-9_]{7,29}$";
}
public class Valid_Username_RegularExpression {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		while (n-- != 0) {
            String userName = scanner.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }           
        }
		scanner.close();
	}
}
