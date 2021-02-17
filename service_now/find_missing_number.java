package service_now;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class find_missing_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {7,2,5,3,5,3};
		int[] brr= {7,2,5,4,6,3,5,3};
		int ans[]=missingNumbers(arr, brr);
		for(int x:ans)
		{
			System.out.println(x);
		}
		

	}
/*	public static int findmiss(int []arr)
	{int ans=0,ans1=0;
	for(int x:arr)
	ans=ans+x;
	ans1=((arr.length+1)*(arr.length+2))/2; return ans1-ans;}}
*/
	
public static int[] missingNumbers(int[] arr, int[] brr) {
	        HashMap<Integer,Integer> hm=new HashMap<>();
	        for(int i=0;i<arr.length;i++)
	        {
	            if(hm.containsKey(brr[i]))
	            {
	                hm.put(arr[i],hm.get(arr[i])+1);
	            }else
	            hm.put(arr[i],1);
	        }
	  System.out.println(hm);
	        ArrayList<Integer> al=new ArrayList<>();
	        for(int i=0;i<brr.length;i++)
	        {
	            int count=1;
	          for(int j=i+1;j<brr.length-2;j++)
	          {
	              if(arr[i]==arr[j])
	              {
	                  count++;
	              }
	          }
	            if(hm.containsKey(brr[i])&&count==hm.get(brr[i]))
	            {
	                
	            }else
	            {
	                al.add(brr[i]);
	            }
	        }
	       
	        int ansa[]=new int[al.size()];
	        System.out.println(ansa.length);
	        System.out.println("****");
	        for(int i=0;i<al.size();i++)
	        {
	            ansa[i]=al.get(i);
	        }
	        Arrays.sort(ansa);


	    return ansa;}
public static int findmiss(int[] arr)
{
	int x1=arr[0];
	int x2=1;
	for(int i=1;i<arr.length;i++)
	{
		x1=x1^arr[i];
	}
	for(int i=2;i<=arr.length+1;i++)
	{
		x2=x2^i;
	}
	return x2^x1;
}

}