package winter_holidays;

import java.util.Scanner;

public class sumofevenodddigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int num=n;
		int rem=0;
		int sum1=0,sum2=0,count=0;
		while(num%10!=0)
		{rem=num%10;
			if(count%2==0)
			{
				sum1=sum1+rem;
			}
			else
			{
				sum2=sum2+rem;
			}
			count++;
			num=num/10;
			
		}
		System.out.println(sum1);
		System.out.println(sum2);

	}
	

}
