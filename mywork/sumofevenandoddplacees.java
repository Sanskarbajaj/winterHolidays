package mywork;

import java.util.Scanner;

public class sumofevenandoddplacees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int N,temp,n=0,m,count=0,sum=0,sum2=0;
	        Scanner s=new Scanner(System.in);
	        N=s.nextInt();
	        temp=N;
	        while(temp!=0)
	        {
	            m=temp%10;
	        count++;
	            temp=temp/10;
	        }
	      while(N!=0)
	      {
	          n=N%10;
	          if(count%2==0)
	          {
	              sum=sum+n;
	          }
	          else if(count%2==1)
	          {
	              sum2=sum2+n;
	          }
	          N=N/10;
	          count--;
	      }
	      System.out.println(sum);
	       System.out.println(sum2);
	     

	}

}
