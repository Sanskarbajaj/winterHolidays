package winter_holidays;

import java.util.Arrays;
import java.util.Scanner;

public class pairofroses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		int ans1=0,ans2=0;
		while(t--!=0)
		{int j=s.nextInt();
		
		 int min=100001;
			int arr[]=new int[j];
			for(int i=0;i<arr.length;i++)
			{
				arr[i]=s.nextInt();
			}
			Arrays.parallelSort(arr);
			int tgt=s.nextInt();
			for(int i=0;i<arr.length;i++)
			{
				for(int k=i+1;k<arr.length;k++)
				{
					if(arr[i]+arr[k]==tgt)
					{
						if(arr[k]-arr[i]<min)
						{
							min=arr[k]-arr[i];
							ans1=arr[i];
							ans2=arr[k];
							
						}
						
					}
					
				}
			}
			System.out.println(ans1+" "+ans2);	
			
		}
		
		

	}

}
