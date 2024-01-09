package com.Fact;

import java.util.Scanner;

public class Factorial3 {

	public static void main(String[] args) {
		long n,fact=1;
		//n=Long.parseLong(args[0]);
		Scanner sc=new Scanner(System.in);
		n=sc.nextLong();
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("factorial : "+fact);
	}

}
