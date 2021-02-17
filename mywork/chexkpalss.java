package mywork;

import java.util.Scanner;

public class chexkpalss {

	public static void main(String[] args) {
            Scanner s=new Scanner(System.in);
            String str=s.next(); int ctrr=0;
            for(int i=0;i<str.length();i++)
            {
            	for(int j=i+1;j<=str.length();j++)
            	{
            		if(pals(str.substring(i,j))==1)
            		{
            			++ctrr;
            		}
            	}
            }
            System.out.println(ctrr);

	}
	public static int pals(String str)
	{
		int ctrr=0,t=str.length()/2;
		for(int i=0;i<t;i++)
		{
			if(str.charAt(i)==str.charAt(str.length()-i-1))
				++ctrr;
		}
		if(ctrr==t)
		return 1;
		else
			return 0;
	}

}
