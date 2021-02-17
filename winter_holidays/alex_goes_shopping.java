package winter_holidays;

import java.util.Scanner;

public class alex_goes_shopping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int m=s.nextInt();
		int a[]=new int[m];
		for(int i=0;i<m;i++)
		{
			a[i]=s.nextInt();
		}
		int q=s.nextInt();
		int count=0;
		while(q!=0)
		{count=0;
			int price ,noi;
			price=s.nextInt();
			noi=s.nextInt();
			for(int i=0;i<m;i++)
			{
				if(price%a[i]==0)
				{
					count++;
				}
			}
			if(count==noi)
			{
				System.out.println("yes");
			}
			else
			{
				System.out.println("no");
			}
			
			
			
		}

	}

}
