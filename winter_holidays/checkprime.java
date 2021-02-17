package winter_holidays;

import java.util.Scanner;

public class checkprime {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	 isprime(25);
	

	}
	public static void isprime(long n)
	{
		for(int i=2;i<n/2;i++)
		{
			if(n%i==0 && n!=2)
			{
				System.out.println("Not Prime");
			return;
			}
		}
		System.out.println("Prime");
	}

}
