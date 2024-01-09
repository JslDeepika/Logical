package com.Prime;

public class Prime {

	public static void main(String[] args) {
		
		int i,m,flag=0;
		int num=37;
		m=num/2;
		if(num==0 || num==1) {
			System.out.println(num +"not prime");
		}
		else
		{
			for(i=2;i<=m;i++) {
				if(num%i==0) {
					System.out.println(num+"not prime");
					flag=1;
					break;
				
				}
			}
			if(flag==0)
			{
				System.out.println(num +" is prime");
			}
		}
	}

}
