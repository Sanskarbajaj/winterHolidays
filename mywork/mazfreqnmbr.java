package mywork;

import java.util.ArrayList;
import java.util.Scanner;

public class mazfreqnmbr {

	public static void main(String[] args) {
           Scanner s=new Scanner(System.in);
           StringBuilder sb=new StringBuilder();
           ArrayList<Integer> list=new ArrayList<>(10);
           String str;  str=s.next();     int ctr22=0;
           for(char ch='A';ch<='z';ch++)
           { int ctr=0;
        	   for(int i=0;i<str.length();i++)
        	   {
        		  if(str.charAt(i)==ch&&ctr22==0)
        		  {
        			  sb.append(ch);
        			  ++ctr22;
        			  ++ctr;
        		  }
        		  else if(str.charAt(i)==ch)
        			  ++ctr;
        	   }
        		  ctr22=0;
        		  if(ctr>0)
        			  list.add(ctr);
        	   }
           int p=0,pe=0;
           for(int i=0;i<list.size()-1;i++)
           {
        	   if(p<list.get(i))
        		   p=list.get(i);
           }
           for(int i=0;i<list.size()-1;i++)
           {
        	   if(list.get(i)==p)
        		   pe=i;
           }
           for(int i=0;i<sb.length();i++)
           {
        	   if(i==pe)
        		   System.out.print(sb.charAt(i));
           }
           
           
	}

}
