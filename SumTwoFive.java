package com.assignment5;

import java.util.Scanner;

public class SumTwoFive {

	public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int n=sc.nextInt();
  if(n<0)
  {
	  System.out.println("Invalid array size");
  }
  int a[]=new int[n];
  for (int i = 0; i < a.length; i++) {
       a[i]=sc.nextInt();
	  if(a[i]<0)
	{
		System.out.println("Invalid input");
	}
}
  System.out.println(SumTwoFive.sumTwoFive(a, n));

	}
public static int sumTwoFive(int arr[],int size)
{
	int count=0;
	int counter=0;
	int sum=0;
	int j=0;
	for (int i = 0; i < arr.length; i++) {
		int p=arr[i];
		int x=arr[i];
		
		
		while(p!=0) // this loop is used to allocate space to new array on the basis of quotient
		{
			p=p/10;
			counter++;
		}
		int ar[]=new int[counter];
		while(x!=0)
		{
			int rem=x%10;
			ar[j]=rem;
			j++;
			x=x/10;
		}
		for ( j = 0; j < counter; j++) {
			if(j==counter-1)
			{
				break;
			}
			if(ar[j+1]==2 || ar[j+1]==5)
			{
				//count++;
				sum=sum+arr[i];
				//=sum+ar[i];
				//j++;
			}
			
		}
	}
	return sum;
	


}
}
