package mywork;

import java.util.ArrayList;
import java.util.Scanner;

public class nonew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4};
		
		ArrayList<Integer> ans=ans(arr);
		System.out.println(ans);
	}
 public static ArrayList<Integer> ans(int[] arr)
 { Scanner s=new Scanner(System.in);
	 int n=arr.length;
	 ArrayList<Integer> myans=new ArrayList<Integer>();
	 for(int i=0;i<n;i++)
	 { int product=1;
		 for(int j=0;j<n;j++)
		 {
			 if(i==j)
			 {
				 
			 }
			 else
			 {
				 product=product*arr[j];
			 }
		 }
		 myans.add(product);
	 }
	 return myans;
 }
}
