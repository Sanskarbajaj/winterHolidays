package winter_holidays;

import java.util.Scanner;

public class calculate_the_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int t; 
		t=s.nextInt();
		int n;
		n=s.nextInt();
		int arr[]=new int[n];
		int brr[]=new int[n];
		for(int i=0;i<n;i++)
		{

			arr[i]=s.nextInt();
			brr[i]=arr[i];
		}
		while(t!=0)
		{t--;
		int ans=s.nextInt();
		for(int i=0;i<n;i++)
		{    
			if(i-(ans)>=0)
			{ 
				arr[i]=arr[i]+brr[i-ans];
				
			}
			else
			{
				arr[i]=arr[i]+brr[n-ans];
			}
			
		}
		brr=arr;	
		}
		int sum=0;
		for(int x:arr)
		{
			System.out.println(x);
			sum+=x;
		}
		System.out.println(sum);
	}
}