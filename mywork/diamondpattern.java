package mywork;

import java.util.Scanner;

public class diamondpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   int row=1,n,nst,nsp=0,value;
	        Scanner s=new Scanner(System.in);
	        n=s.nextInt();
	        value=n;
	        nst=2*n+1;

	          while(row<=2*n+1)
	          {
	        
	              int csp=1;
	              while(csp<=nsp)
	              {
	                  System.out.print("  ");
	                  csp++;
	              }
	              int cst=1;
	              while(cst<=nst)
	              { 
	                  if(cst<n+1)
	                  {
	                  System.out.print(value);
	                  System.out.print(" ");
	                  value--;
	                  }
	                  else
	                  {
	                     
	                  System.out.print("*");
	                  System.out.print(" ");
	                   value=value+1;
	                      
	                  }
	                  cst++;
	              }
	          
	         
	              if(row<n+1)
	              {
	                  nsp++;
	                  nst=nst-2;
	             
	              }
	              else
	              {
	                  nsp--;
	                  nst=nst+2;
	              }
	              row++;
	           
	    
	              System.out.println();
	          }
	}

}
