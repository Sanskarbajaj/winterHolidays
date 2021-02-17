package winter_holidays;

import java.util.Scanner;

public class nth_prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(nthprime(5));

	}
	
	public static int nthprime(int n)
	{
		Scanner s=new Scanner(System.in);
	//	int n=s.nextInt();
		int num=1;
		int i=0;
		int count=0;
		while(count<n)
		{
			num=num+1;
			for(i=2;i<=num;i++)
			{
				if(num%i==0)
				{
					break;
				}
			}
			if(i==num)
			{
				count=count+1;
				
			}
			
		}
		return num;
		
	}
	
	


}
