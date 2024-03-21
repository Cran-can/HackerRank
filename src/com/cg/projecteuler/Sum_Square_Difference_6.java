package com.cg.projecteuler;

import java.util.Scanner;

public class Sum_Square_Difference_6 {
	
	 private static long sumSquareDifference(long n){
	        long sum=0,sumOfSquare=0;
	        sum = (long)(n*(n+1)/2);
	        sumOfSquare=(long)(n*(n+1)*(2*n+1))/6;
	        long result=sum*sum - sumOfSquare;
	        return result;
	        }
	    
	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        
	        int t = in.nextInt();
	        for(int a0 = 0; a0 < t; a0++){
	            long n = in.nextInt();
	            System.out.println(sumSquareDifference(n));
	        }
	        in.close();
	    }
}
