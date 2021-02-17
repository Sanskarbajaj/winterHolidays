package informatica;

public class kadane_algo_max_sum_subarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {4,5,0,-2,-3,1};
 // System.out.println(kadane(arr));
  System.out.println(subarraysDivByK(arr, 5));
	}
	public static int kadane(int arr[])
	{  int start=0,end=0,s=0;
		int sumtillnow=0,maxsum=0;
		for(int i=0;i<arr.length;i++)
		{	sumtillnow=sumtillnow+arr[i];
			if(sumtillnow>maxsum)
			{
			maxsum=sumtillnow;
			start=s; end=i;
			}
			if(sumtillnow<0)
			{
				sumtillnow=0;
				s=i+1;
			}
		}
		System.out.println(start+"->"+end);
		System.out.println();
	return maxsum;}
	
	 public static int subarraysDivByK(int[] A, int K) {
	        int N = A.length;
	        int[] P = new int[N+1];
	        for (int i = 0; i < N; ++i)
	            P[i+1] = P[i] + A[i];

	        int[] count = new int[K];
	        for (int x: P)
	            count[(x % K + K) % K]++;

	        int ans = 0;
	        for (int v: count)
	            ans += v * (v - 1) / 2;
	        return ans;
	    }

}
