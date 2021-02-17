package informatica;

public class min_contiguous_subarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3, 4, 2, 3, 1, 1, 5};
		System.out.println(subb(arr));

	}
	public static int subb(int []arr)
	{int sumtilnow=0,minsum=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			
			sumtilnow=sumtilnow+arr[i];
			if(sumtilnow<minsum)
			{
				minsum=sumtilnow;
			}
			if(sumtilnow>0)
			{
				sumtilnow=0;
			}
				}
		return minsum;}

}
