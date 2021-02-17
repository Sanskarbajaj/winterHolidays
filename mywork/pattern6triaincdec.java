package mywork;

import java.util.Scanner;

public class pattern6triaincdec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     int row=1,n,value=1;
	        Scanner s=new Scanner(System.in);
	        n=s.nextInt();
	    int nsp=n-row;
	        while(row<=n)
	        {
	            int csp=1;
	            while(csp<=nsp)
	            {
	                System.out.print(" ");
	                csp++;
	            }
	            //incr
	            int cst=1;
	            while(cst<=row)
	            {
	                System.out.print(value);
	                System.out.print("\t");
	                value++;
	                cst++;
	            }
	            cst=1;
	            //dcr
	            while(cst<row)
	            { value=value-2;
	                System.out.print(value);
	                System.out.print("\t");
	                cst++;
	                value++;
	                
	            } 
	        
	            row++;
	            nsp--;
	            System.out.println();

	}
	}
}
