package FlowControl;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ifLastDigitSame {

	public static void main(String[] args) {
		 String st="Abc";
		 System.out.println(missingPanagram(st));
		}
	public static String missingPanagram(String str)
    {  
        String ss=str;
      ss=  ss.toLowerCase();
      
        String res="";
        String ans="abcdefghijklmnopqrstuvwxyz";
        for(int i=0;i<ss.length();i++)
        {
            if(ans.indexOf(ss.charAt(i))!=-1)
            {
            }
            else
            {
                res+=ans.charAt(i)+"";
            }
        }
        return res;
    }
}