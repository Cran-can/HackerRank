package com.cg.projecteuler;

import java.util.Scanner;

public class Even_Fibonacci_Numbers_2 {
	static long find_sum(long N)
    {
        long one =2;
        long two =8;
        long temp = 0;
        long sum = 0;
        while(one <N)
        {
            sum += one;
            temp = two;
            two = 4* two+one;
            one = temp;
        }
        return sum;
    }
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextLong();
            System.out.println(find_sum(n));
        }
        in.close();
    }
}
