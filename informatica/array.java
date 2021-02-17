package informatica;

import java.util.Arrays;

public class array {

	public static void main(String[] args) {
		int arr[]={4,5,0,2,1,6};
		Arrays.parallelSort(arr);
		pair(arr, 2);

	}
	
	public static void pair(int arr[],int k)
	{
		for(int i=0;i<arr.length;i++)
		{ 
			int j=0,l=i;
			while(j<k)
			{
				System.out.print(arr[j]+"->");
				j++;
			}
			System.out.println();
			
		}
	}

}
