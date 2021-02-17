package winter_holidays;

import java.util.Arrays;
import java.util.Scanner;

public class aggressive_cows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int c=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		Arrays.parallelSort(arr);
		 int ans=0;
		int st=0; int end=arr[arr.length-1]-arr[0];
		int mid=0;
		while(st<=end)
		{ mid=st+end/2;
		   if(isvalid(n,c,arr,mid))
		   {
			   ans = mid;
			   st=mid+1;
		   }
		   else
		   {
			   end=mid-1;
		   }
		}
		System.out.println(ans);

	}
	public static boolean isvalid(int n,int c,int[] arr,int val)
	{
		int curstall=arr[0];
		int curcow=1;
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]-curstall>=val)
			{
				curstall=arr[i];
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
