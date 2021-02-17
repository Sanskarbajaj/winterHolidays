package mywork;

import java.util.Scanner;

public class pattern5mirror {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int row=1,n,nst=1,nsp=2;
	        Scanner s= new Scanner(System.in);
	        n=s.nextInt();
	        while(row<=n)
	        {
	            int csp=1;
	            while(csp<=nsp)
	            {
	                System.out.print(" ");
	                csp++;
	            }
	            int cst=1;
	            while(cst<=nst)
	            {
	                System.out.print("*");
	                cst++;
	            }
	            row++;
	            nst=nst+2;
	            nsp--;
	            System.out.println();
	          
	        }
	}

}
