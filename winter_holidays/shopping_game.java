package winter_holidays;

import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class shopping_game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		int sum1=0,sum2=0,p=0,q=0;
		while(t!=0)
		{
			t--;
			int m=s.nextInt();
			int n=s.nextInt();
			 for( p=0;p<=m;p=p+2)
		        {
		            sum1=sum1+p;
		        }
		        for( q=1;q<=n;q=q+2)
		        {
		            sum2=sum2+q;
		        }
			
		}
		if(sum1>sum2)
			System.out.println("aayush");
		else
		System.out.println("harshit");

	}
	

}
