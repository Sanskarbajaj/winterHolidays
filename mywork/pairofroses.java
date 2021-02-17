package mywork;

import java.util.Arrays;
import java.util.Scanner;

public class pairofroses {

	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
        int n,t,min,a=0,b=0;
         t=s.nextInt();
         while(t>0)
         {
             t--;
               n=s.nextInt();
             
        int [] arr=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=s.nextInt();
        }
        Arrays.sort(arr);
        min=100001;
        int mny=s.nextInt();
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]+arr[j]==mny)
                {
                   if(arr[j]-arr[i]<min)
                   {
                	   min=arr[j]-arr[i];
                	   a=arr[i];
                	   b=arr[j];
                   }
                }
            }
        }
        System.out.println("Deepak should buy roses whose prices are "+a+" "+"and"+" "+b3);
         }



	}

}
