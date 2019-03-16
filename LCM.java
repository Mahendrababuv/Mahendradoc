package com.assignment5;

import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   int n=sc.nextInt();
   int m=sc.nextInt();
   if(n>1000 && m>1000 || n<0 && m<0)
   {
	   System.out.println("Invalid input");
	   System.exit(0);
   }
System.out.println(LCM.calculateLCM(n, m));
	}
	public static int calculateLCM(int x,int y)
	{
		int gcd=1;
		int lcm=1;
		for (int i = 1; i<x && i<y; i++) {
			if(x%i==0 && y%i==0)
			{
				gcd=i;
			}
		}
		//lcm=(x*y)/gcd;
		return gcd;
		
	}

}
