package newone;
import java.util.Scanner;
import java.util.*;
import java.lang.*;
public class newton2 {


		public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	    int t=s.nextInt();
	    while(t--!=0)
	    {
	int n=s.nextInt();
	System.out.println(ans(n));
	    }
		}
		public static int ans(int n)
		{
			int ans=0;
			for(int i=1;i<=n;i++)
			{
				ans=(int) (ans+(n-i+1)*Math.log10(i));
			
			}
		return ans%1000000007 ;}

	}