package mywork;

import java.util.Arrays;
import java.util.Scanner;

public class cb2 {

	public static void main(String[] args)
	{
		d2b(11);
	}
	public static void d2b(int dn)
	{ int rem=0;
	String str="";
		while(dn>0)
		{rem=dn%2;
		str=rem+""+str;
		 dn=dn/2;	
		}
		System.out.println(str);
	}
	public static void b2d(int bn)
	{
		
	}
}
