package winter_holidays;

import java.util.Arrays;

public class array_tgt_triplets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5 ,7 ,9, 1, 2, 4, 6, 8, 3};
		int tgt=10;
		Arrays.parallelSort(arr);
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++)      
			{
				for(int k=j+1;k<arr.length;k++)
				{
				if(arr[i]+arr[j]+arr[k]==tgt)
				{
					System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
				}
				}
			}
		}
	}

}
