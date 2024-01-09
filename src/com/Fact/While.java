package com.Fact;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {

		long n,fact=1;
		int i=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value");
		n=sc.nextLong();
		 
		while(i<=n) {
			fact=fact*i;
			i++;
		}
		System.out.println("Factorial : "+fact);
	}

}
