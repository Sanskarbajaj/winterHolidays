package winter_holidays;

import java.util.Scanner;

public class max_num_using_swaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		String ss=n+"";
		StringBuffer str=new StringBuffer();
		StringBuffer max=new StringBuffer();
		for(int i=0;i<ss.length();i++)
		{
			str.append(ss.charAt(i));
		}
		max=str;
		int k=2;
		maxx(str, k, max);
		System.out.println(max);
	}
	public static void maxx(StringBuffer str,int k,StringBuffer max)
	{
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				if(str.charAt(j)>str.charAt(i))
				{  
					char ans1=str.charAt(i);
					char ans2=str.charAt(j);
				 str.setCharAt(i,ans2);
				 str.setCharAt(j,ans1);
				
				 if () 
	                    max = str; 
				 maxx(str, k-1, max);
				 char ans3=str.charAt(i);
				 char ans4=str.charAt(j);
				 
				}
			}
		}
		
	}

}
