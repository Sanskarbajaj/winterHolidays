package mywork;

import java.util.Scanner;

public class shoppingcbpb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int m,n,t,sum1=0,sum2=0,p,q;
	        Scanner s=new Scanner(System.in);
	        t=s.nextInt();
	        for(int i=1;i<=t;i++)
	        {
	        m=s.nextInt();
	        n=s.nextInt();
	        for( p=0;p<=m;p=p+2)
	        {
	            sum1=sum1+p;
	        }
	        for( q=1;q<=n;q=q+2)
	        {
	            sum2=sum2+q;
	        }
	        if(p>q)
	        System.out.println("Aayush");
	        else
	        System.out.println("Harshit");
	        }
	        

	}

}
