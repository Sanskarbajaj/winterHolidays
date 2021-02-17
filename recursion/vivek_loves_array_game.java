package recursion;

import java.util.Scanner;

public class vivek_loves_array_game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		//int t=s.nextInt();
//		
//		while(t--!=0)
//		{
//			int n=s.nextInt();
//			int arr[]=new int[n];
//			for(int i=0;i<arr.length;i++)
//			{
//				arr[i]=s.nextInt();
//			}
//			System.out.println(ms(arr,0,arr.length-1));
//		}
		int arr[]= {4,1,0,1,1,0,1};
System.out.println(ms(arr,0,arr.length-1));
	}
	 private static int ms(int[] arr, int si, int ei) {

	        if (si>ei)
	        {
	            return 0;
	        }
	        int fh = 0, sh = 0;
	        
	        for (int i = si; i < ei; i++)
	        {
	        
	        	int sum1 = summ(arr, si, i);
	            
	        	int sum2 = summ(arr, i + 1, ei);
	            
	        	if (sum1 == sum2)
	            {
	                fh = ms(arr, si, i);
	            
	                sh = ms(arr, i + 1, ei);
	                
	                return Math.max(fh, sh) + 1;
	            }

	        }
			return 0;
	    }

	    private static int summ(int[] arr, int si, int ei) {

	        int sum = 0;
	        for (int i = si; i <= ei; i++)
	            sum += arr[i];
	        return sum;
	    }

}
