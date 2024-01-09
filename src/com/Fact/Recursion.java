package com.Fact;

import java.util.Scanner;

public class Recursion{
	static long fact(long n) {
		if(n<=0)
			return 1;
		return Recursion.fact(n-1)*n;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");
		long n=sc.nextLong();
		long f=Recursion.fact(n);
		System.out.println("factorial : "+ f);
	
	}
}
