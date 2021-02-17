package winter_holidays;

import java.util.Arrays;

public class array_gt_pair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,3,4,2,5};
		int tgt=5;
		Arrays.parallelSort(arr);
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++)      
			{
				if(arr[i]+arr[j]==tgt)
				{
					System.out.println(arr[i]+" "+arr[j]);
				}
			}
		}
		

	}

}
