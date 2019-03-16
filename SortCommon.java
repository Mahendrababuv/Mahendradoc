package com.assignment5;

import java.util.Scanner;

public class SortCommon {
 static int common[];
 static int count=0;
	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int n=sc.nextInt();
if(n<0)
{
	System.out.println("Invalid input");
	}
int a[]=new int[n];
int b[]=new int[n];
for (int i = 0; i < a.length; i++) {
	a[i]=sc.nextInt();
}
for (int j = 0; j < b.length; j++) {
	b[j]=sc.nextInt();
			}
for (int i = 0; i < a.length; i++) {
	for (int j = 0; j < b.length; j++) {
		if(a[i]==b[j])
		{
			count++;
		}
	}
}
common=new int[count];
SortCommon.sortCommonElements(a, b, n);
	}
	public static void sortCommonElements(int set1[],int set2[],int size)
	{
		int temp=0;
		int k=0;
		
		for (int i = 0; i < set1.length; i++) {
			for (int j = 0; j < set2.length; j++) {
				if(set1[i]==set2[j])
				{
					common[k]=set1[i];
					if(k==count-1)
					{
						break;
					}
					k++;
				}
			}
			
		}
		for(k=0;k<count;k++)
		{
			for(int i=k+1;i<count;i++)
			{
				if(common[k]>common[i])
				{
					temp=common[k];
					common[k]=common[i];
					common[i]=temp;
					
				}
			}
		}
		for(k=0;k<count;k++)
		{
		  System.out.println(common[k]);
		}
		
	}

}
