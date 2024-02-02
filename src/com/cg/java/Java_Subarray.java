package com.cg.java;
import java.util.Scanner;
public class Java_Subarray {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	    int input = sc.nextInt();
	    int[] arr = new int[input];

	    for(int i = 0; i < input; ++i){
	        int number = sc.nextInt();
	        arr[i] = number;
	    }
	    int checkSum = 0;
	    int count = 0;
	    for(int i = 0; i < input; ++i){
	        checkSum = 0;
	        for(int j = i;j < input;++j){
	            checkSum += arr[j];
	            if(checkSum < 0){
	                count++;
	            }
	        }
	    }
	    System.out.println(count);
		sc.close();
	}
}
