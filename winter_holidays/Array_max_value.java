package winter_holidays;

import java.util.Scanner;

public class Array_max_value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a[]=new int[5];
		int max=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println(max);

	}

}
