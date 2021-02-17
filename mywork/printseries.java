package mywork;

import java.util.Scanner;

public class printseries {

	public static void main(String[] args) {
		  int n1,n2,counter=1;
//	        Scanner s=new Scanner(System.in);
//	        n1=s.nextInt();
//	        n2=s.nextInt();
		  n1=10;
		  n2=4;
	  
	        while(counter!=n1)
	        {
	            if((3*counter+2)%n2==0)
	            {
	                
	            }
	            else
	            {
	                System.out.println(3*counter+2);
	                counter++;
	            }
	        }


	}

}
