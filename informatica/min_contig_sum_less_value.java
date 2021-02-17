package informatica;

public class min_contig_sum_less_value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,30,70,20,5,10,2,2};
		int k=20;
		givval(arr,k);

	}
    public static void givval(int arr[],int k)
    {
    	for(int i=0;i<arr.length;i++)
    	{
    		for(int j=i+1;j<arr.length;j++)
    		{
    			if(arr[i]+arr[j]<k)
    			{
    				System.out.println(arr[i]+"->"+arr[j]);
    				
    			}
    			else
    			{
    				
    			}
    		}
    	}
    }
}
