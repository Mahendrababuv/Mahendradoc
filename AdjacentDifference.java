package com.assignment5;

import java.util.Scanner;

public class AdjacentDifference {

	//static int[] diff;
	public static void main(String[] args) {
		//int diff=0;
		//int diff[];
		//int k=0;
		int count=0;
Scanner sc = new Scanner(System.in);
int n= sc .nextInt();
int a[]=new int[n];
for (int i = 0; i < a.length; i++) {
	a[i]=sc.nextInt();
}


int largdiff=0;
for (int i = 0; i < n; i++) {
	if(i==n-2)
	{
		break;
	}
	if(Math.abs(a[i]-a[i+1])>largdiff)
	{
		largdiff=Math.abs(a[i]-a[i+1]);
	}
}
System.out.println(largdiff);

/*int diff[]=new int[n-1];
for (int i = 0; i < a.length; i++) {
	int k=0;
	 diff[k]=Math.abs(a[i]-a[i+1]);
	 if(i==a.length-2)
		 break;
	 if(k==n-2)
	 {
			break;
	 }
	 k++;
	 
}
for(int j=0;j<n-1;j++)
{
	System.out.println(diff[j]);
}*/
	



	}

}
