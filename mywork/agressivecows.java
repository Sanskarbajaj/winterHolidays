package mywork;

import java.lang.reflect.Array;
import java.util.Scanner;

public class agressivecows {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n,c;
		n=s.nextInt();
		c=s.nextInt();
		int[] stall=new int[n];
		for(int i=0;i<n;i++)
		{
			stall[i]=s.nextInt();
		}
		arrays.bblsort(stall);
		int start=0;
		int end=stall[n-1]-stall[0];
		int ans=0;
		while(start<=end)
		{
			int mid=(start+end)/2;
			if(valid(n,c,stall,mid))
			{
				ans=mid;
				start=mid+1;
			}
			else
			{
				end=mid-1;
			}
		}
		System.out.println(ans);
		
		

	}
	public static boolean valid(int n,int c,int[] stall,int val) {
		int curstall=stall[0];
		int curcow=1;
		for(int i=1;i<n;i++)
		{
			if(stall[i]-curstall>=val)
			{
				curstall=stall[i];
				curcow++;
			}
			if(curcow==c)
			{
				return true;
			}
			
		}
		return false;
		
	}

}
