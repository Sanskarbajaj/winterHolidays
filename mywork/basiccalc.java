package mywork;

import java.util.Scanner;

public class basiccalc {

	public static void main(String[] args) {
		   char ch;
	        int m,n;
	        Scanner s=new Scanner(System.in);
	     //  ch=32;
	     do
	       {
	            ch=s.next().charAt(0);
	        if(ch==42)
	        {
	        m=s.nextInt();
	        n=s.nextInt();
	        System.out.println(m*n);
	        }
	        else if(ch==43)
	        {
	             m=s.nextInt();
	        n=s.nextInt();
	        System.out.println(m+n);
	        }
	            else if(ch==45)
	        {
	             m=s.nextInt();
	        n=s.nextInt();
	        System.out.println(m-n);
	        }
	            else if(ch==47)
	        {
	        m=s.nextInt();
	        n=s.nextInt();
	        if(n>0)
	        System.out.println(m/n);
	        }
	            else if(ch==37)
	        {
	             m=s.nextInt();
	        n=s.nextInt();
	        if(n>0)
	        System.out.println(m%n);
	        }
	        else if(ch=='x'||ch=='X')
	        {
	            break;
	        } 
	        else
	        {
	            System.out.println("Invalid operation. Try again.");
	        }
	        }while(ch!='x'||ch!='X');
	}

}
