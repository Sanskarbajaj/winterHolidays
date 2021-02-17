package winter_holidays;

import java.util.ArrayList;

public class next_smaller_next_Greater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5 ,1 ,9 ,2, 5 ,1 ,7};
		int ng=0,ns=0;
		ArrayList<Integer> list =new ArrayList<>();
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					list.add(arr[j]);
					break;
				}
				if(j==arr.length-1)
				{
					list.add(-1);
				}
				
			}
		}
		list.add(-1);
	//	System.out.print(list+",");
		int brr[]=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			brr[i]=list.remove(0);
			System.out.println(brr[i]);
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(brr[i]<arr[j])
				{
					System.out.println(arr[j]);
					break;
				}
			}
		}
		
	}

}
