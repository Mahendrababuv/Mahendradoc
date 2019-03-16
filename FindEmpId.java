package com.assignment5;

import java.util.Scanner;

public class FindEmpId {

	public static void main(String[] args) {
		int rem=0;
		//int p=0;
		int k=0;
 Scanner sc = new Scanner(System.in);
 int n=sc.nextInt();
 int a[]=new int[n];
 for (int i = 0; i < a.length; i++) {
	a[i]=sc.nextInt();
}
 int x=sc.nextInt();
 //int p=a[i];

 for (int i = 0; i < a.length; i++) {
	 //int p;
	 
	// int rem;
		int empId=a[i]%100;
		 k=rem;
		int projCode=a[i]/100;
		if(projCode == x){
			System.out.println(empId);
		}
 }
 
	}

}
