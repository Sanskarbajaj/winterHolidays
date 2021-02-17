package winter_holidays;

import java.util.Scanner;

public class toggle_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.next();
		StringBuffer ss=new StringBuffer(str);
		
		for(int i=0;i<str.length();i++)
		{
			if(Character.isUpperCase(str.charAt(i)))
			{
				
				ss.setCharAt(i,Character.toLowerCase(str.charAt(i)));
			}
			else
			{
				ss.setCharAt(i,Character.toUpperCase(str.charAt(i)));
			}
		}
		System.out.println(ss);

	}

}
