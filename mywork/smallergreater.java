package mywork;

import java.util.Scanner;

public class smallergreater {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=s.nextInt();
			int[] arr=new int[n];
			for(int j=0;j<arr.length;j++)
			{
				arr[j]=s.nextInt();
			}
			for(int j=0;j<arr.length;j++)
			{
				int g=0,sm=0;
				int k=j;
				while(k<arr.length)
				{
					if(arr[k]>arr[j])
					{
						g=arr[k];
						for(int q=k;q<arr.length;q++)
						{
							if(arr[q]<arr[k])
							{
								sm=arr[q];
								System.out.print(sm+" ");
								break;
							}
							if(q==arr.length-1)
							{
								System.out.print("-1"+" ");
								break;
							}
						}
					}
					if(arr[k]>arr[j])
					{
						break;
					}
					k++;
					if(k>arr.length-1)
					{
						g=-1;
						sm=-1;
						System.out.print("-1"+" ");
					}
				}
			}
		}
		
		 

	}

}
