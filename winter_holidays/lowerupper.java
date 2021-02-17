package winter_holidays;

import java.util.Scanner;

public class lowerupper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lowerupper();

	}
   public static void lowerupper()
   {
	   Scanner s=new Scanner(System.in);
	   Character ch=s.next().charAt(0);
	  
	   if(ch>='A'&&ch<='Z')
	   {
		   System.out.println("uppercase");
	   }
	   else if(ch>='a'&&ch<='z')
	   {
		   System.out.println("lowercase");
	   }
	   else
	   {
		   System.out.println("invalid");
	   }
   }
}
