package mywork;

import java.util.ArrayList;

public class Hashmaps {

	public static void main(String[] args) {
		int arr[]= {100,180,260,310,40,535,695};
	//min value
		int n=arr.length;
		stock(arr,0);
		
	}
	 public static void stock(int[] arr,int p)
	 {
		 if(p==arr.length-2)
		 {
			 return;
		 }
			ArrayList<Integer> a=new ArrayList<>();
		 for(int i=p;i<arr.length-1;i++)
	     	{
			if(arr[i]<arr[i+1])
			{ 
				a.add(i);
			}
			else
			{
			break;
			}
		    }
			System.out.println(a.get(p));
			System.out.println(a.get(a.size()-1)+1);
			stock(arr,p++);
	 }
}
