package winter_holidays;

import java.util.Scanner;

public class form_min_from_given {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		String inp;
		while(t--!=0)
		{
			inp=s.next();
			fmin(inp);
			
		}

	}
	public static void fmin(String str)
	{ int ans=0;
	if(str.charAt(0)=='D')
	{
		ans=str.length()+1;
		System.out.print(ans);
	}
	else
	{
		ans=1;
		System.out.print(ans);
	}
		
		for(int i=0;i<str.length();i++)
		{ 
			if(str.charAt(i)=='D')
			{ 
				--ans;
				System.out.print(ans);
			}
			else
			{
				++ans;
				System.out.print(ans);
			}
			
		}
	}

}
