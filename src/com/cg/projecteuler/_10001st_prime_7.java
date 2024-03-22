package com.cg.projecteuler;

import java.util.Scanner;

public class _10001st_prime_7 {
	public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }
    
    public static int findNthPrime(int n) {
        int count = 0;
        int num = 2;
        int prime = 0;
        
        while (count < n) {
            if (isPrime(num)) {
                prime = num;
                count++;
            }
            num++;
        }
        return prime;
    }
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            System.out.println(findNthPrime(n));
        }
                in.close();
 
    }
}
