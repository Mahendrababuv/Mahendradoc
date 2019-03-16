package com.assignment5;

import java.util.Scanner;

public class PrimeProd {

	public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int n=sc.nextInt();
if(n<0 && n>32767)
{
System.out.println("Invalid input");	
}
System.out.println(PrimeProd.productPrimeDigits(n));
	}
public static int productPrimeDigits(int num)
{
	
	int prod=1;
	int isPrime=1;
	int p=num;
	int k=0;
	int counter=0;
	int flag=1;
    while(p!=0)
	{
		p=p/10;
		counter++;
	}
	int arr[]=new int[counter];
	while(num!=0)
	{
		int rem=num%10;
		arr[k]=rem;
		k++;
		
		num=num/10;
	}
		//int limit=num/2;
		for( int i=0;i<counter;i++)
		{
			if(k==counter-1)
			{
				break;
			}
			
			for(int j=2;j<arr[i];j++)
			{
				if(arr[i]%j==0)
				{
					isPrime=0;
					break;
				}
				else
				{
				isPrime=1;
				}
				 }
				if(isPrime==1)
				{
					prod=prod*arr[i];
				}
			
			
		}
	
	
	return prod;
	


}
}

