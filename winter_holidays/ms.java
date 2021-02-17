package winter_holidays;

import java.util.Scanner;

public class ms {
	public static void main(String[] args) throws Exception {
		Scanner s =new Scanner(System.in);
		int t=s.nextInt();
		while(t!=0)
		{
			int q=s.nextInt();
			for(int i=1;i<=q;i++)
			{
				System.out.println(dtb(i));
			}
		}
	
	}
	public static int dtb(int num) throws Exception
	  {
		  if(num==0)
		  {
			  throw new Exception("enter valid num");
		  }
		  int n=num;
		  int rem=0;
		  String bn="";
		  while(n!=0)
		  {
			  rem=n%2;
			  bn=rem+bn;
			  n=n/2;
		  }
		  int ans=Integer.parseInt(bn);
		  return ans;
	  }
	
}
