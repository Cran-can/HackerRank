package com.cg.java;

import java.io.IOException;
import java.util.Scanner;

public class Java_2D_Array {
    public static void main(String[] args) throws IOException {
    	Scanner scanner = new Scanner(System.in);
    	int[][] arr = new int[10][10];
    	for(int i=0;i<6;i++) {
    		for(int j=0;j<6;j++) {
    			arr[i][j]=scanner.nextInt();
    		}
    	}
    	int maxi=-100;
    	for(int i=0;i<6;i++) {
    		for(int j=0;j<6;j++) {
    			if(i<=3 && j<= 3) {
    				int sum = arr[i][j]+arr[i][j+1]+arr[i][j+2]+(arr[i+1][j+1])+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];	
    				if(sum>maxi) {
    					maxi=sum;
    				}
    		    }
    		}
    	}
    	System.out.println(maxi);
    	scanner.close();
    }
}
