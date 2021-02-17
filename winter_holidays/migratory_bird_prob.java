package winter_holidays;

import java.util.Arrays;

public class migratory_bird_prob {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {1,2,4,4,4,4,4,1,1};
		int count=0,ans=0,fc=0;
		Arrays.parallelSort(arr);
		for(int i=0;i<arr.length;i++)
		{ count=0;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{count++;
				fc=i;}
				else
				{break; }
				if(count>ans)
				{ans=count;
				}
			}
			}
		System.out.println(ans+1);
		System.out.println(arr[fc]);
	}

}
