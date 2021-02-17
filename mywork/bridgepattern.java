package mywork;

import java.util.Scanner;

public class bridgepattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  	int row=1,n,nst=1,value=1;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int nsp=n+1;
		while(row<=n)
		{
			int cst=1;
			value=1;
			while(cst<=nst)
			{ 
			   System.out.print(value);
		
			   
			    value++;
			       
			
			    cst++;
			}
			int csp=1;
			while(csp<=nsp)
			{
				System.out.print(" ");
				csp++;
			}
			cst=1;
		
			while(cst<=row)
			{ 
						value--;
			    System.out.print(value);
				cst++;
			}
			row++;
			nst++;
			nsp=nsp-2;
			System.out.println();
		}

	}
}
