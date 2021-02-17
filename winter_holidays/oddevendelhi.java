package winter_holidays;

import java.util.Scanner;

public class oddevendelhi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int cn=s.nextInt();
		int ans1=0,ans2=0,rem=0;
		int n=cn;
		while(n!=0)
		{rem=n%10;
			if(rem%2==0)
			{
				ans1=ans1+rem;
			}
			else
			{
				ans2=ans2+rem;
			}
		n=n/10;}
		if(ans1%4==0||ans2%3==0)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}

	}

}
