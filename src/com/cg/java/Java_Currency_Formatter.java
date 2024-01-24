package com.cg.java;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
public class Java_Currency_Formatter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
    
        System.out.printf("US: $%,.2f",payment);
        System.out.printf("\nIndia: Rs.%,.2f",payment);
        
        NumberFormat n2 = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = n2.format(payment);
        System.out.println("\nChina: " + china);

        NumberFormat n3 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = n3.format(payment);
        System.out.println("France: " + france);
        
        
        scanner.close();
	}
}
