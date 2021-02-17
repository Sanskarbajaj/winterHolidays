package winter_holidays;

import java.util.Set;

public class String_remove_duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="aabccba";
String res="";
int i;
 for( i=0;i<str.length()-1;i++)
 {
	 int j=i+1;
	 if(str.charAt(i)!=str.charAt(j))
	 {
		 res=res+str.charAt(i);
	 }
 }
 if(i+1==str.length())
 {
	 res=res+str.charAt(i);
 }
 System.out.println(res);
	}

}
