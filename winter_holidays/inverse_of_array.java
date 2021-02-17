package winter_holidays;

import java.util.Scanner;

public class inverse_of_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[4];
		int brr[]=new int[4];
		Scanner s=new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
		{
			
			arr[i]=s.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			
			int t=arr[i];
			brr[t]=i;
		}
		for(int x:brr)
		{System.out.println(x);
			
		}

	}

}
