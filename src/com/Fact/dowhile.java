package com.Fact;

import java.util.Scanner;

public class dowhile {

	public static void main(String[] args) {
		
		long n,fact=1; int i=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value");
		n=sc.nextLong();
		do {
			fact=fact*i;
			i++;
		}while(i<=n) ;
			System.out.println("factorial : "+ fact);
		
		
	}

}
