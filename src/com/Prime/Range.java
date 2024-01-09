package com.Prime;

import java.util.Scanner;

public class Range {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter first number");
		int start=s.nextInt();
		System.out.println("Enter second number");
		int end=s.nextInt();
		for(int i=start;i<=end;i++) {
			if(isprime(i)) {
				System.out.println(i);
			}
		}
				
	}

	private static boolean isprime(int num) {
		if(num<=1) {
			return false;
		}
		for(int i=2;i<=Math.sqrt(num);i++) {
			
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}

}
