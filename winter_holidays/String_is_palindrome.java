package winter_holidays;

import java.util.Scanner;

public class String_is_palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.next();
		int count=0;
		for(int i=0;i<str.length()/2;i++)
		{
			if(str.charAt(i)==str.charAt(str.length()-i-1))
			{
				count++;
			}
			else
			{
				
			}
		}
		if(count==str.length()/2)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}

	}

}
