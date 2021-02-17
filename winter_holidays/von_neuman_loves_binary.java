package winter_holidays;

import java.util.Scanner;

public class von_neuman_loves_binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t!=0)
		{
			t--;
			int nu=s.nextInt();
			System.out.println(btd(nu));
			
		}

	}
public static int btd(int num)
	
	{
		int n=num,rem=0,pow=1,ans=0;
		while(n!=0)
		{
			rem=n%10;
			ans=ans+rem*pow;
			pow=pow*2;
			n=n/10;
			
		}
		return ans;
	}

}
