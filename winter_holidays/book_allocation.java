package winter_holidays;

import java.util.Scanner;

public class book_allocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		int sol=0;
		while(t--!=0)
		{
			int nb=s.nextInt();
			int ns=s.nextInt();
			int sum=0;
			int arr[]=new int[nb];
			for(int i=0;i<arr.length;i++)
			{
				arr[i]=s.nextInt();
				sum+=arr[i];
			}
			int mid=0;
			int st=0,end=sum;
			while(st<=end)
			{
				mid=(st+end)/2;
				if(isvalid(arr,nb,ns,mid))
				{
					sol=mid;
					st=mid+1;
				}
				else
				{
					end=mid-1;
				}
			}
		}
		System.out.println(sol);

	}
	public static boolean isvalid(int[] arr,int nb,int ns,int val)
	{
		int curstu=1;
		int curbook=0;
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]+curbook>val)
			{
			curbook=arr[i];
			curstu+=1;
			if(curstu==ns)
			{
				return true;
			}
			}
			else
			{
				curbook+=arr[i];
			}
		}
		return false;
	}

}
