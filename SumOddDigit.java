package com.assignment5;

import java.util.Scanner;

public class SumOddDigit {

	public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   int n=sc.nextInt();
   
System.out.println(SumOddDigit.sumOddDigits(n));
	}
	public static int sumOddDigits(int num)
	{
		int sum=0;
		if(num<0 && num>32767)
		{
			System.out.println("Invalid input");
			System.exit(0);
		}
		while(num!=0)
		{
			int rem=num%10;
			num=num/10;
			if(rem%2!=0)
			{
		     sum=sum+rem;
			}
		}
		return sum;
		
	}

}
