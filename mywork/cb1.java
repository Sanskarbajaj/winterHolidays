package mywork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class cb1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		int rem=0,sum=0;
		while(t!=0)
		{
			t--;
			int n=s.nextInt();
			while(n!=0)
			{rem=n%10;
			sum=sum+rem;
			n=n/10;
			}
			if(sum%2==0&&sum%4==0)
			{
				System.out.println("Yes");
			}
			else if(sum%2!=0&&sum%3==0)
			{
				System.out.println("Yes");
			}
			else
			{
				System.out.println("No");
			}

		}

}
}
