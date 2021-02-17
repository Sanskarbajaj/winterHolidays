package winter_holidays;

import java.util.Scanner;

public class String_odd_even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.next();
		String ans="";
        Character ch;
		for(int i=0;i<str.length();i++)
		{
			int ascii=str.charAt(i);
			if(i%2==0)
			{
				ch=(char)(ascii+1);
				ans=ans+ch;
			}
			else
			{ch=(char)(ascii-1);
			ans=ans+ch;
				
			}
		}
System.out.println(ans);
	}

}
