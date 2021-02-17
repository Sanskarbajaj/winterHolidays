package newone;

import java.util.Scanner;

public class newton {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.next().trim();
		System.out.println(ans(str));

	}
	   public static String ans(String str)
	    {boolean again=true;
	    String ans="";
		   StringBuilder sb=new StringBuilder(str);
	        if(str.length()==0)
	        {
	        return "-1";
	        }
	        while(again)
	        {
	        again=false;
	        for(int i=0;i<sb.length()-1;i++)
	        {
	      if(sb.charAt(i)=='0'&&sb.charAt(i+1)=='1')
	      { 
	    	sb.delete(i, i+2); 
	       again =true;
	       break;
          }  
	      if(sb.length()==0)
	      {
	    	  return "-1";
	      }
	       }
	        }
	        if(sb.length()==0)
	        	return "-1";
	   return sb.toString(); }

}
