package winter_holidays;

import java.util.Scanner;

public class Strongest_fighter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner s=new Scanner(System.in);
	int arr[]= {1,3,1,4,5};
	int n=5;
		int k=3;
		int max=0;
		
		for(int i=0;i<arr.length;i++)
		{int count=0;
		int j=i;
			while(count<k)
			{  
				if(j<arr.length)
				{
			  if(arr[j]>max)
			  {
				max=arr[j];
				
			   }
				count++;
				j++;
			}
			}
			System.out.println(max);
			max=0;
		}
			
	}

}
