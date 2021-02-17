package mywork;

import java.util.Scanner;

public class pattern0 {

	public static void main(String[] args) {
  Scanner s=new Scanner(System.in);
  int n=s.nextInt();
//  int row=1,nst=n;
//  while(row<=n)
//  {
//	  int cst=1;
//	  while(cst<=nst)
//	  {
//		 System.out.print("* ");
//		 cst++;
//	  }
//	  row++;
//	  System.out.println();
//  }
//  int row=1,nst=1;
//  while(row<=n)
//  {
//	  int cst=1;
//	  while(cst<=nst)
//	  {
//		  System.out.print("*");
//		  cst++;
//	  }
//	  row++;
//	  nst++;
//	  System.out.println();
//  }
//  int row=1,nst=n;
//  while(row<=n)
//  {
//	  int cst=1;
//	  while(cst<=nst)
//	  {
//		  System.out.print("* " );
//		  cst++;
//	  }
//	  row++;
//	  nst--;
//	  System.out.println();
//  }
//		int row=1,nst=1,nsp=n;
//		while(row<=n)
//		{
//			int csp=1;
//			while(csp<=nsp)
//			{
//				System.out.print(" ");
//				csp++;
//			}
//			int cst=1;
//			while(cst<=nst)
//			{
//				System.out.print("*");
//				cst++;
//			}
//			row++;
//			nst++;
//			nsp--;
//			System.out.println();
//		}
//  int row=1,nst=n,nsp=0;
//  while(row<=n)
//  {
//	  int csp=1;
//	  while(csp<=nsp)
//	  {
//		  System.out.print("  ");
//		  csp++;
//	  }
//	  int cst=1;
//	  while(cst<=nst)
//	  {
//		  System.out.print("* ");
//		  cst++;
//	  }
//	  row++;
//	  nst--;
//	  nsp++;
//	  System.out.println();
//  }
//  int row=1,nst=1;
//  while(row<=(2*n)-1)
//  {
//	  int cst=1;
//	  while(cst<=nst)
//	  {
//		  System.out.print("* ");
//		  cst++;
//	  }
//	  if(row<n)
//	  {
//		  nst++;
//	  }
//	  else
//	  {
//		  nst--;
//	  }
//	  row++;
//	  System.out.println();
//	  
//  }
//  int row=1,nst=n/2,nsp=1;
//  while(row<=n)
//  {
//	  int cst=1;
//	  while(cst<=nst)
//	  {
//		  System.out.print("*");
//		  cst++;
//	  }
//	  int csp=1;
//	  while(csp<=nsp)
//	  {
//		  System.out.print(" ");
//		  csp++;
//	  }
//	     cst=1;
//	  while(cst<=nst)
//	  {
//		  System.out.print("*");
//		  cst++;
//	  }
//	  if(row<=n/2)
//	  {
//		  nst--;
//		  nsp=nsp+2;
//	  }
//	  else
//	  {
//		  nst++;
//		  nsp=nsp-2;
//	  }
//	  row++;
//	  System.out.println();
//  }
//
//  int row=1,nst=1,nsp=n/2;
//  while(row<=n)
//  {
//	  int csp=1;
//	  while(csp<=nsp)
//	  {
//		  System.out.print("  ");
//		  csp++;
//	  }
//	  int cst=1;
//	  while(cst<=nst)
//	  {
//		  System.out.print("* ");
//		  cst++;
//	  }
//	  if(row<=n/2)
//	  {
//		  nsp--;
//		  nst=nst+2;
//	  }
//	  else
//	  {
//		  nsp++;
//		  nst=nst-2;
//	 
//	  }
//	  row++;
//	  System.out.println();
//  }
  
//  int row=1,nst=1,nsp=n+2;
//  while(row<=n)
//  {
//	  int cst=1;
//	  while(cst<=nst)
//	  {
//		  System.out.print("*");
//		  cst++;
//	  }
//	  int csp=1;
//	  while(csp<=nsp)
//	  {
//		  System.out.print(" ");
//		  csp++;
//	  }
//	   cst=1;
//	   if(row==n)
//	   {
//		   cst=2;
//	   }
//	  while(cst<=nst)
//	  {
//		  System.out.print("*");
//		  cst++;
//	  }
//	  row++;
//	  nst++;
//	  nsp=nsp-2;
//	  System.out.println();
//  }
//int row=1,nst=1,nsp=n-1,value;
//while(row<=n)
//{
//	 int csp=1;
//	  while(csp<=nsp)
//	  {
//		  System.out.print("  ");
//		  csp++;
//	  }
//	  int cst=1;
//	  value=1;
//	  while(cst<=nst)
//	  {
//		  System.out.print(value+" ");
//		  value++;
//		  cst++;
//	  }
//	  cst=1;
//	  value=value-2;
//	  while(cst<nst)
//	  {
//		  System.out.print(value+" ");
//		  value--;
//		  cst++;
//	  }
//	  row++;
//	  nst++;
//	  nsp--;
//	  System.out.println();
//	  
//}
//  int row=1,nst=1,value=1;
//  while(row<=(2*n)-1)
//  {
//	  int cst=1;
//
//	  while(cst<=nst)
//	  {   if(cst%2==1)
//		  System.out.print(value+" ");
//	      else
//	   System.out.print("* ");
//	
//		  cst++;
//	  }
//	  if(row<n)
//	  {
//	  nst+=2;
//	  value++;
//	  }
//	  else
//	  {
//		  nst-=2;
//		  value--;
//	  }
//	  row++;
//	  System.out.println();
//  }
// 
  
  
  
}
}
