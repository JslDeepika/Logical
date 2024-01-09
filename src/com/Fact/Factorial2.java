package com.Fact;

import java.util.Scanner;

public class Factorial2 {

	public static void main(String[] args) {
		long n,fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");
		n=sc.nextLong();
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("factorial :"+fact);
	}

}
