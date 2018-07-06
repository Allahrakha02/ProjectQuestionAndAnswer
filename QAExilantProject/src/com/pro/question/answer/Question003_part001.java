package com.pro.question.answer;

import java.util.Scanner;

public class Question003_part001 {

	
	 static int[][] printSpiral(int n)
	    {
		 
		 	int arr[][]= new int [n][n];
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                 
	                int x;
	 
	                x = Math.min(Math.min(i, j), 
	                    Math.min(n - 1 - i, n - 1 - j));
	 
	                if (i <= j) {
	                    //System.out.print((n - 2 * x) * (n - 2 * x) - 
	                                //     (i - x) - (j - x) + " ");
	                    arr[i][j]=(n - 2 * x) * (n - 2 * x) - (i - x) - (j - x);
	                }
	                // for lower left half
	                else {
	                	 arr[i][j]=(n - 2 * x - 2) * (n - 2 * x - 2) + (i - x) + (j - x);
	                   // System.out.print((n - 2 * x - 2) * (n - 2 * x - 2) +
	                                    // (i - x) + (j - x) + " ");
	        }
	            }
	            System.out.println();
	        }
	        
	      
			return arr;
	    }
	 
	 public static void main(String[] args) {
		 
		
		 int n = 590;
		 
	      int arr[][]=  printSpiral(n);
	      
	      for(int i=0;i<arr.length;i++) {
	        	for(int j=0;j<arr.length;j++) {
	        	System.out.print(arr[i][j]+"     ");
	        }
	        	System.out.println();
	        }
	      
	      
	      System.out.println(arr[0][109]);
	      System.out.println("enter your input");
	      Scanner sc = new Scanner(System.in);
	      int mainIndex=sc.nextInt();
	      
	      int startRow_one = 0;
	      int startColm_one=0;
	      int endRow_one=0;
	      int endColm_one=0;
	      
	      for(int i=0;i<arr.length;i++) {
	        	for(int j=0;j<arr.length;j++) {
	        	if(arr[i][j]==1) {
	        		System.out.println("index of 1 :"+i+" "+j);
	        		startRow_one=i;
	        		startColm_one=j;
	        	}else if(arr[i][j]==mainIndex) {
	        		System.out.println("index of"+mainIndex+" :"+i+" "+j);
	        		endRow_one=i;
	        		endColm_one=j;
	        	}
	        		}
	        	}
	      
	      
	      int result=((startRow_one-endRow_one)+(startColm_one-endColm_one));
	      System.out.println("Total Step is :"+result);
	      System.out.println(arr[0][0]);
	}
	
	
	
}
