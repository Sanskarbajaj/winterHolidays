package recursion;

import java.util.Arrays;
import java.util.HashSet;

public class sumrec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={3,-7,0};
//		HashSet<Integer>hs=new HashSet<>();
//		for(int i=0;i<arr.length;i++)
//		{
//			hs.add(arr[i]);
//		}
//		System.out.println(hs);
		//System.out.println(sum(arr,0));
		int ans=minabs(arr);
		System.out.println(ans);
	}
	public static int sum(int arr[],int n)
	{ int mysum=0;
		if(n==arr.length)
		return 0;
		
		mysum=mysum+arr[n];
		int recsum=sum(arr,n+1);
	return 	mysum+recsum;}
	public static int  minabs(int arr[])
	{
		Arrays.sort(arr);
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length-1;i++)
        {
            int c=Math.abs(arr[i]-arr[i+1]);
            min=Math.min(c,min);
                 }
    
	return min;}


}
