package winter_holidays;

import java.util.Scanner;
import java.util.Stack;

public class playing_with_cards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=s.nextInt();
		int j=nthprime(i);
		while(i--!=0)
		{
			
			int[] arr=new int[n];
			for(int l=0;l<arr.length;l++)
			{
				arr[l]=s.nextInt();
			}
			Stack<Integer> a=new Stack<>();
			Stack<Integer> b=new Stack<>();
			
			for(int k=arr.length-1;k>=0;k--)
			{
				if(arr[k]%j==0)
				{
					b.push(arr[k]);
				}
				else
				{
					a.push(arr[k]);
				}
			}
			while(!b.isEmpty())
			{
				System.out.println(b.pop());
			}
			while(!a.isEmpty())
			{
				System.out.println(a.pop());
			}
			
		}

	}
	public static int nthprime(int n)
	{
		Scanner s=new Scanner(System.in);
	//	int n=s.nextInt();
		int num=1;
		int i=0;
		int count=0;
		while(count<n)
		{
			num=num+1;
			for(i=2;i<=num;i++)
			{
				if(num%i==0)
				{
					break;
				}
			}
			if(i==num)
			{
				count=count+1;
				
			}
			
		}
		return num;
		
	}
	

}
