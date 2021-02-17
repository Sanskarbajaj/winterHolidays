package winter_holidays;

import java.util.Scanner;

public class Strings_diff_in_ascii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
String str=s.next();
Character ch1,ch2;
int ascii1,ascii2,asc=0;
for(int i=0;i<str.length()-1;i++)
{
		ch1=str.charAt(i);
		ch2=str.charAt(i+1);
		ascii1=ch1;
		ascii2=ch2;
		asc=ascii2-ascii1;		
	System.out.print(str.charAt(i));
	System.out.print(asc);
}
System.out.print(str.charAt(str.length()-1));
	}

}
