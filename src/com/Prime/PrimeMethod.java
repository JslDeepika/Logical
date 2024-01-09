package com.Prime;

public class PrimeMethod {
	static void checkprime(int num)
	{
		int i,m,flag=0;
		m=num/2;
		if(num==0 || num==1)
		{
			System.out.println(num + " not prime");
		}else
		{
			for(i=2;i<=m;i++)
			{
				if(num%i==0) {
					System.out.println(num + " not prime");
					flag=1;
					break;
				}
			}
			if(flag==0) {
				System.out.println(num + " is prime");
			}
		}
	}

	public static void main(String[] args) {
		checkprime(78);

	}

}
