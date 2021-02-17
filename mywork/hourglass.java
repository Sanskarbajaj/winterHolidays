package mywork;

import java.util.Scanner;

public class hourglass {

	public static void main(String[] args) {
		int row=1,n,nsp,nst,value;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		nsp=n;
		nst=n;
		while(row<=2*n+1)
		{
			if(row<=n)
			{
				int csp=1;
				while(csp<=nsp)
				{
					System.out.print(" ");
					csp++;
				}
				int cst=1;
				value=row;
				while(cst<=nst)
				{
					System.out.print(value);
				    cst++;
				    value++;
				}
			}
			row++;
			nsp=nsp+1;
			nst=nst-2;
			System.out.println();
		}

	}

}
