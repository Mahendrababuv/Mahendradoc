package com.assignment5;

import java.util.Scanner;

public class ReverseAddition {

	public static void main(String[] args) {
		//int sum=0;
		int k=0;
 Scanner sc = new Scanner(System.in);
 int n=sc.nextInt();
 int a[]=new int[n];
 int b[]=new int[n];
 
 int c[]=new int[n];
 
 for (int i = 0; i < a.length; i++) {
	 a[i]=sc.nextInt();
}
 for(int j=0;j<b.length;j++)
 {
	 b[j]=sc.nextInt();
 }
 
 for (int i = 0; i < n; i++) {
	 int sum=0;
		sum=sum+a[i]+b[n-i-1];
		//n--;
		////i++;
	
		System.out.println(sum);
}
 

	}

}
