package com.Fact;

import java.util.Scanner;

public class Factmethod {
	static long factcal(long num) {
		long fact=1;
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		
		}
		return fact;
	}

	public static void main(String[] args) {
		long n,fact=0;

		Scanner sc=new Scanner(System.in);
		n=sc.nextLong();
		 fact=factcal(n);
		 System.out.println("factorial : "+fact);
		
	}

}
